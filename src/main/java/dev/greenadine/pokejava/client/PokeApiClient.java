/*
 * Copyright © 2025 Kevin "Greenadine" Zuman (kevin@greenadine.dev)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.resource.ApiResource;
import dev.greenadine.pokejava.resource.ApiResourceList;
import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.berry.Berry;
import dev.greenadine.pokejava.resource.berry.BerryFirmness;
import dev.greenadine.pokejava.resource.berry.BerryFlavor;
import dev.greenadine.pokejava.resource.common.Language;
import dev.greenadine.pokejava.resource.contest.ContestEffect;
import dev.greenadine.pokejava.resource.contest.ContestType;
import dev.greenadine.pokejava.resource.contest.SuperContestEffect;
import dev.greenadine.pokejava.resource.encounter.EncounterCondition;
import dev.greenadine.pokejava.resource.encounter.EncounterConditionValue;
import dev.greenadine.pokejava.resource.encounter.EncounterMethod;
import dev.greenadine.pokejava.resource.evolution.EvolutionChain;
import dev.greenadine.pokejava.resource.evolution.EvolutionTrigger;
import dev.greenadine.pokejava.resource.game.Generation;
import dev.greenadine.pokejava.resource.game.Pokedex;
import dev.greenadine.pokejava.resource.game.Version;
import dev.greenadine.pokejava.resource.game.VersionGroup;
import dev.greenadine.pokejava.resource.item.*;
import dev.greenadine.pokejava.resource.location.Location;
import dev.greenadine.pokejava.resource.location.LocationArea;
import dev.greenadine.pokejava.resource.location.PalParkArea;
import dev.greenadine.pokejava.resource.location.Region;
import dev.greenadine.pokejava.resource.machine.Machine;
import dev.greenadine.pokejava.resource.move.*;
import dev.greenadine.pokejava.resource.pokemon.*;
import dev.greenadine.pokejava.resource.pokemon.ability.Ability;
import dev.greenadine.pokejava.resource.pokemon.form.PokemonForm;
import dev.greenadine.pokejava.resource.pokemon.gender.Gender;
import dev.greenadine.pokejava.resource.pokemon.growthrate.GrowthRate;
import dev.greenadine.pokejava.resource.pokemon.nature.Nature;
import dev.greenadine.pokejava.resource.pokemon.pokeathlon.PokeathlonStat;
import dev.greenadine.pokejava.resource.pokemon.shape.PokemonShape;
import dev.greenadine.pokejava.resource.pokemon.species.PokemonSpecies;
import dev.greenadine.pokejava.resource.pokemon.stat.Stat;
import dev.greenadine.pokejava.resource.pokemon.type.Type;
import dev.greenadine.pokejava.util.PokeJavaUtils;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

import java.io.IOException;
import java.util.List;

/**
 * A client for the PokéAPI.
 */
public final class PokeApiClient implements PokeApi {

    private final PokeApiService service;

    /**
     * Creates a new PokéAPI client using the official PokéAPI service.
     */
    public PokeApiClient() {
        this.service = PokeApiServiceFactory.createService(new ServiceConfig(PokeApi.BASE_URL));
    }

    /**
     * Creates a new PokéAPI client using a custom PokéAPI service.
     *
     * @param baseUrl the base URL of the PokéAPI service.
     */
    public PokeApiClient(@NotNull String baseUrl) {
        this.service = PokeApiServiceFactory.createService(new ServiceConfig(baseUrl));
    }

    // Constructor for PokeApiBuilder
    PokeApiClient(PokeApiService service) {
        this.service = service;
    }

    /* --- Utility --- */

    // Executes the call synchronously and returns the result
    private <T> T getResult(Call<T> call) {
        try {
            final var response = call.execute();
            try (final var errorBody = response.errorBody()) {
                if (errorBody != null) {
                    final var errorBodyMessage = errorBody.string();
                    if (errorBodyMessage.equals("Not Found"))
                        throw new ResourceNotFoundException(call.request().url().pathSegments());
                    else
                        throw new PokeApiException("Invalid API call: " + errorBodyMessage);
                }
            }
            return response.body();
        } catch (IOException ex) {
            throw new PokeApiException("An error occurred while executing API call", ex);
        }
    }

    // Ensures the resource is of the expected type
    private void checkResourceType(ApiResource resource, Class<? extends ApiResource> resourceType) {
        final var expected = PokeJavaUtils.getResourcePath(resourceType);
        if (!resource.getResourcePath().equals(expected))
            throw new PokeApiException("Resource is not a " + PokeApiException.getResourceDisplayName(expected));
    }

    /* --- API --- */

    @Override
    public @NotNull NamedApiResourceList getLanguages(int offset, int limit) {
        return getResult(service.getLanguages(offset, limit));
    }

    @Override
    public @NotNull Language getLanguageById(int id) {
        return getResult(service.getLanguageById(id));
    }

    @Override
    public @NotNull Language getLanguageByName(@NotNull String name) {
        return getResult(service.getLanguageByName(name));
    }

    @Override
    public @NotNull Language getLanguage(@NotNull ApiResource language) {
        checkResourceType(language, Language.class);
        return getLanguageById(language.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getBerries(int offset, int limit) {
        return getResult(service.getBerries(offset, limit));
    }

    @Override
    public @NotNull Berry getBerryById(int id) {
        return getResult(service.getBerryById(id));
    }

    @Override
    public @NotNull Berry getBerryByName(@NotNull String name) {
        return getResult(service.getBerryByName(name));
    }

    @Override
    public @NotNull Berry getBerry(@NotNull ApiResource berry) {
        checkResourceType(berry, Berry.class);
        return getBerryById(berry.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getBerryFirmnesses(int offset, int limit) {
        return getResult(service.getBerryFirmnesses(offset, limit));
    }

    @Override
    public @NotNull BerryFirmness getBerryFirmnessById(int id) {
        return getResult(service.getBerryFirmnessById(id));
    }

    @Override
    public @NotNull BerryFirmness getBerryFirmnessByName(@NotNull String name) {
        return getResult(service.getBerryFirmnessByName(name));
    }

    @Override
    public @NotNull BerryFirmness getBerryFirmness(@NotNull ApiResource berryFirmness) {
        checkResourceType(berryFirmness, BerryFirmness.class);
        return getBerryFirmnessById(berryFirmness.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getBerryFlavors(int offset, int limit) {
        return getResult(service.getBerryFlavors(offset, limit));
    }

    @Override
    public @NotNull BerryFlavor getBerryFlavorById(int id) {
        return getResult(service.getBerryFlavorById(id));
    }

    @Override
    public @NotNull BerryFlavor getBerryFlavorByName(@NotNull String name) {
        return getResult(service.getBerryFlavorByName(name));
    }

    @Override
    public @NotNull BerryFlavor getBerryFlavor(@NotNull ApiResource berryFlavor) {
        checkResourceType(berryFlavor, BerryFlavor.class);
        return getBerryFlavorById(berryFlavor.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getContestTypes(int offset, int limit) {
        return getResult(service.getContestTypes(offset, limit));
    }

    @Override
    public @NotNull ContestType getContestTypeById(int id) {
        return getResult(service.getContestTypeById(id));
    }

    @Override
    public @NotNull ContestType getContestTypeByName(@NotNull String name) {
        return getResult(service.getContestTypeByName(name));
    }

    @Override
    public @NotNull ContestType getContestType(@NotNull ApiResource contestType) {
        checkResourceType(contestType, ContestType.class);
        return getContestTypeById(contestType.getId());
    }

    @Override
    public @NotNull ApiResourceList getContestEffects(int offset, int limit) {
        return getResult(service.getContestEffects(offset, limit));
    }

    @Override
    public @NotNull ContestEffect getContestEffectById(int id) {
        return getResult(service.getContestEffectById(id));
    }

    @Override
    public @NotNull ContestEffect getContestEffect(@NotNull ApiResource contestEffect) {
        checkResourceType(contestEffect, ContestEffect.class);
        return getContestEffectById(contestEffect.getId());
    }

    @Override
    public @NotNull ApiResourceList getSuperContestEffects(int offset, int limit) {
        return getResult(service.getSuperContestEffects(offset, limit));
    }

    @Override
    public @NotNull SuperContestEffect getSuperContestEffectById(int id) {
        return getResult(service.getSuperContestEffectById(id));
    }

    @Override
    public @NotNull SuperContestEffect getSuperContestEffect(@NotNull ApiResource superContestEffect) {
        checkResourceType(superContestEffect, SuperContestEffect.class);
        return getSuperContestEffectById(superContestEffect.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getEncounterMethods(int offset, int limit) {
        return getResult(service.getEncounterMethods(offset, limit));
    }

    @Override
    public @NotNull EncounterMethod getEncounterMethodById(int id) {
        return getResult(service.getEncounterMethodById(id));
    }

    @Override
    public @NotNull EncounterMethod getEncounterMethodByName(@NotNull String name) {
        return getResult(service.getEncounterMethodByName(name));
    }

    @Override
    public @NotNull EncounterMethod getEncounterMethod(@NotNull ApiResource encounterMethod) {
        checkResourceType(encounterMethod, EncounterMethod.class);
        return getEncounterMethodById(encounterMethod.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getEncounterConditions(int offset, int limit) {
        return getResult(service.getEncounterConditions(offset, limit));
    }

    @Override
    public @NotNull EncounterCondition getEncounterConditionById(int id) {
        return getResult(service.getEncounterConditionById(id));
    }

    @Override
    public @NotNull EncounterCondition getEncounterConditionByName(@NotNull String name) {
        return getResult(service.getEncounterConditionByName(name));
    }

    @Override
    public @NotNull EncounterCondition getEncounterCondition(@NotNull ApiResource encounterCondition) {
        checkResourceType(encounterCondition, EncounterCondition.class);
        return getEncounterConditionById(encounterCondition.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getEncounterConditionValues(int offset, int limit) {
        return getResult(service.getEncounterConditionValues(offset, limit));
    }

    @Override
    public @NotNull EncounterConditionValue getEncounterConditionValueById(int id) {
        return getResult(service.getEncounterConditionValueById(id));
    }

    @Override
    public @NotNull EncounterConditionValue getEncounterConditionValueByName(@NotNull String name) {
        return getResult(service.getEncounterConditionValueByName(name));
    }

    @Override
    public @NotNull EncounterConditionValue getEncounterConditionValue(@NotNull ApiResource encounterConditionValue) {
        checkResourceType(encounterConditionValue, EncounterConditionValue.class);
        return getEncounterConditionValueById(encounterConditionValue.getId());
    }

    @Override
    public @NotNull ApiResourceList getEvolutionChains(int offset, int limit) {
        return getResult(service.getEvolutionChains(offset, limit));
    }

    @Override
    public @NotNull EvolutionChain getEvolutionChainById(int id) {
        return getResult(service.getEvolutionChainById(id));
    }

    @Override
    public @NotNull EvolutionChain getEvolutionChain(@NotNull ApiResource evolutionChain) {
        checkResourceType(evolutionChain, EvolutionChain.class);
        return getEvolutionChainById(evolutionChain.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getEvolutionTriggers(int offset, int limit) {
        return getResult(service.getEvolutionTriggers(offset, limit));
    }

    @Override
    public @NotNull EvolutionTrigger getEvolutionTriggerById(int id) {
        return getResult(service.getEvolutionTriggerById(id));
    }

    @Override
    public @NotNull EvolutionTrigger getEvolutionTriggerByName(@NotNull String name) {
        return getResult(service.getEvolutionTriggerByName(name));
    }

    @Override
    public @NotNull EvolutionTrigger getEvolutionTrigger(@NotNull ApiResource evolutionTrigger) {
        checkResourceType(evolutionTrigger, EvolutionTrigger.class);
        return getEvolutionTriggerById(evolutionTrigger.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getGenerations(int offset, int limit) {
        return getResult(service.getGenerations(offset, limit));
    }

    @Override
    public @NotNull Generation getGenerationById(int id) {
        return getResult(service.getGenerationById(id));
    }

    @Override
    public @NotNull Generation getGenerationByName(@NotNull String name) {
        return getResult(service.getGenerationByName(name));
    }

    @Override
    public @NotNull Generation getGeneration(@NotNull ApiResource generation) {
        checkResourceType(generation, Generation.class);
        return getGenerationById(generation.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getPokedexes(int offset, int limit) {
        return getResult(service.getPokedexes(offset, limit));
    }

    @Override
    public @NotNull Pokedex getPokedexById(int id) {
        return getResult(service.getPokedexById(id));
    }

    @Override
    public @NotNull Pokedex getPokedexByName(@NotNull String name) {
        return getResult(service.getPokedexByName(name));
    }

    @Override
    public @NotNull Pokedex getPokedex(@NotNull ApiResource pokedex) {
        checkResourceType(pokedex, Pokedex.class);
        return getPokedexById(pokedex.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getVersions(int offset, int limit) {
        return getResult(service.getVersions(offset, limit));
    }

    @Override
    public @NotNull Version getVersionById(int id) {
        return getResult(service.getVersionById(id));
    }

    @Override
    public @NotNull Version getVersionByName(@NotNull String name) {
        return getResult(service.getVersionByName(name));
    }

    @Override
    public @NotNull Version getVersion(@NotNull ApiResource version) {
        checkResourceType(version, Version.class);
        return getVersionById(version.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getVersionGroups(int offset, int limit) {
        return getResult(service.getVersionGroups(offset, limit));
    }

    @Override
    public @NotNull VersionGroup getVersionGroupById(int id) {
        return getResult(service.getVersionGroupById(id));
    }

    @Override
    public @NotNull VersionGroup getVersionGroupByName(@NotNull String name) {
        return getResult(service.getVersionGroupByName(name));
    }

    @Override
    public @NotNull VersionGroup getVersionGroup(@NotNull ApiResource version) {
        checkResourceType(version, VersionGroup.class);
        return getVersionGroupById(version.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getItems(int offset, int limit) {
        return getResult(service.getItems(offset, limit));
    }

    @Override
    public @NotNull Item getItemById(int id) {
        return getResult(service.getItemById(id));
    }

    @Override
    public @NotNull Item getItemByName(@NotNull String name) {
        return getResult(service.getItemByName(name));
    }

    @Override
    public @NotNull Item getItem(@NotNull ApiResource item) {
        checkResourceType(item, Item.class);
        return getItemById(item.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getItemAttributes(int offset, int limit) {
        return getResult(service.getItemAttributes(offset, limit));
    }

    @Override
    public @NotNull ItemAttribute getItemAttributeById(int id) {
        return getResult(service.getItemAttributeById(id));
    }

    @Override
    public @NotNull ItemAttribute getItemAttributeByName(@NotNull String name) {
        return getResult(service.getItemAttributeByName(name));
    }

    @Override
    public @NotNull ItemAttribute getItemAttribute(@NotNull ApiResource itemAttribute) {
        checkResourceType(itemAttribute, ItemAttribute.class);
        return getItemAttributeById(itemAttribute.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getItemCategories(int offset, int limit) {
        return getResult(service.getItemCategories(offset, limit));
    }

    @Override
    public @NotNull ItemCategory getItemCategoryById(int id) {
        return getResult(service.getItemCategoryById(id));
    }

    @Override
    public @NotNull ItemCategory getItemCategoryByName(@NotNull String name) {
        return getResult(service.getItemCategoryByName(name));
    }

    @Override
    public @NotNull ItemCategory getItemCategory(@NotNull ApiResource itemCategory) {
        checkResourceType(itemCategory, ItemCategory.class);
        return getItemCategoryById(itemCategory.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getItemFlingEffects(int offset, int limit) {
        return getResult(service.getItemFlingEffects(offset, limit));
    }

    @Override
    public @NotNull ItemFlingEffect getItemFlingEffectById(int id) {
        return getResult(service.getItemFlingEffectById(id));
    }

    @Override
    public @NotNull ItemFlingEffect getItemFlingEffectByName(@NotNull String name) {
        return getResult(service.getItemFlingEffectByName(name));
    }

    @Override
    public @NotNull ItemFlingEffect getItemFlingEffect(@NotNull ApiResource itemFlingEffect) {
        checkResourceType(itemFlingEffect, ItemFlingEffect.class);
        return getItemFlingEffectById(itemFlingEffect.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getItemPockets(int offset, int limit) {
        return getResult(service.getItemPockets(offset, limit));
    }

    @Override
    public @NotNull ItemPocket getItemPocketById(int id) {
        return getResult(service.getItemPocketById(id));
    }

    @Override
    public @NotNull ItemPocket getItemPocketByName(@NotNull String name) {
        return getResult(service.getItemPocketByName(name));
    }

    @Override
    public @NotNull ItemPocket getItemPocket(@NotNull ApiResource itemPocket) {
        checkResourceType(itemPocket, ItemPocket.class);
        return getItemPocketById(itemPocket.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getLocations(int offset, int limit) {
        return getResult(service.getLocations(offset, limit));
    }

    @Override
    public @NotNull Location getLocationById(int id) {
        return getResult(service.getLocationById(id));
    }

    @Override
    public @NotNull Location getLocationByName(@NotNull String name) {
        return getResult(service.getLocationByName(name));
    }

    @Override
    public @NotNull Location getLocation(@NotNull ApiResource location) {
        checkResourceType(location, Location.class);
        return getLocationById(location.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getLocationAreas(int offset, int limit) {
        return getResult(service.getLocationAreas(offset, limit));
    }

    @Override
    public @NotNull LocationArea getLocationAreaById(int id) {
        return getResult(service.getLocationAreaById(id));
    }

    @Override
    public @NotNull LocationArea getLocationAreaByName(@NotNull String name) {
        return getResult(service.getLocationAreaByName(name));
    }

    @Override
    public @NotNull LocationArea getLocationArea(@NotNull ApiResource locationArea) {
        checkResourceType(locationArea, LocationArea.class);
        return getLocationAreaById(locationArea.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getPalParkAreas(int offset, int limit) {
        return getResult(service.getPalParkAreas(offset, limit));
    }

    @Override
    public @NotNull PalParkArea getPalParkAreaById(int id) {
        return getResult(service.getPalParkAreaById(id));
    }

    @Override
    public @NotNull PalParkArea getPalParkAreaByName(@NotNull String name) {
        return getResult(service.getPalParkAreaByName(name));
    }

    @Override
    public @NotNull PalParkArea getPalParkArea(@NotNull ApiResource palParkArea) {
        checkResourceType(palParkArea, PalParkArea.class);
        return getPalParkAreaById(palParkArea.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getRegions(int offset, int limit) {
        return getResult(service.getRegions(offset, limit));
    }

    @Override
    public @NotNull Region getRegionById(int id) {
        return getResult(service.getRegionById(id));
    }

    @Override
    public @NotNull Region getRegionByName(@NotNull String name) {
        return getResult(service.getRegionByName(name));
    }

    @Override
    public @NotNull Region getRegion(@NotNull ApiResource region) {
        checkResourceType(region, Region.class);
        return getRegionById(region.getId());
    }

    @Override
    public @NotNull ApiResourceList getMachines(int offset, int limit) {
        return getResult(service.getMachines(offset, limit));
    }

    @Override
    public @NotNull Machine getMachineById(int id) {
        return getResult(service.getMachineById(id));
    }

    @Override
    public @NotNull Machine getMachine(@NotNull ApiResource machine) {
        checkResourceType(machine, Machine.class);
        return getMachineById(machine.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getMoves(int offset, int limit) {
        return getResult(service.getMoves(offset, limit));
    }

    @Override
    public @NotNull Move getMoveById(int id) {
        return getResult(service.getMoveById(id));
    }

    @Override
    public @NotNull Move getMoveByName(@NotNull String name) {
        return getResult(service.getMoveByName(name));
    }

    @Override
    public @NotNull Move getMove(@NotNull ApiResource move) {
        checkResourceType(move, Move.class);
        return getMoveById(move.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getMoveAilments(int offset, int limit) {
        return getResult(service.getMoveAilments(offset, limit));
    }

    @Override
    public @NotNull MoveAilment getMoveAilmentById(int id) {
        return getResult(service.getMoveAilmentById(id));
    }

    @Override
    public @NotNull MoveAilment getMoveAilmentByName(@NotNull String name) {
        return getResult(service.getMoveAilmentByName(name));
    }

    @Override
    public @NotNull MoveAilment getMoveAilment(@NotNull ApiResource moveAilment) {
        checkResourceType(moveAilment, MoveAilment.class);
        return getMoveAilmentById(moveAilment.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getMoveBattleStyles(int offset, int limit) {
        return getResult(service.getMoveBattleStyles(offset, limit));
    }

    @Override
    public @NotNull MoveBattleStyle getMoveBattleStyleById(int id) {
        return getResult(service.getMoveBattleStyleById(id));
    }

    @Override
    public @NotNull MoveBattleStyle getMoveBattleStyleByName(@NotNull String name) {
        return getResult(service.getMoveBattleStyleByName(name));
    }

    @Override
    public @NotNull MoveBattleStyle getMoveBattleStyle(@NotNull ApiResource moveBattleStyle) {
        checkResourceType(moveBattleStyle, MoveBattleStyle.class);
        return getMoveBattleStyleById(moveBattleStyle.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getMoveCategories(int offset, int limit) {
        return getResult(service.getMoveCategories(offset, limit));
    }

    @Override
    public @NotNull MoveCategory getMoveCategoryById(int id) {
        return getResult(service.getMoveCategoryById(id));
    }

    @Override
    public @NotNull MoveCategory getMoveCategoryByName(@NotNull String name) {
        return getResult(service.getMoveCategoryByName(name));
    }

    @Override
    public @NotNull MoveCategory getMoveCategory(@NotNull ApiResource moveCategory) {
        checkResourceType(moveCategory, MoveCategory.class);
        return getMoveCategoryById(moveCategory.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getMoveDamageClasses(int offset, int limit) {
        return getResult(service.getMoveDamageClasses(offset, limit));
    }

    @Override
    public @NotNull MoveDamageClass getMoveDamageClassById(int id) {
        return getResult(service.getMoveDamageClassById(id));
    }

    @Override
    public @NotNull MoveDamageClass getMoveDamageClassByName(@NotNull String name) {
        return getResult(service.getMoveDamageClassByName(name));
    }

    @Override
    public @NotNull MoveDamageClass getMoveDamageClass(@NotNull ApiResource moveDamageClass) {
        checkResourceType(moveDamageClass, MoveDamageClass.class);
        return getMoveDamageClassById(moveDamageClass.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getMoveLearnMethods(int offset, int limit) {
        return getResult(service.getMoveLearnMethods(offset, limit));
    }

    @Override
    public @NotNull MoveLearnMethod getMoveLearnMethodById(int id) {
        return getResult(service.getMoveLearnMethodById(id));
    }

    @Override
    public @NotNull MoveLearnMethod getMoveLearnMethodByName(@NotNull String name) {
        return getResult(service.getMoveLearnMethodByName(name));
    }

    @Override
    public @NotNull MoveLearnMethod getMoveLearnMethod(@NotNull ApiResource moveLearnMethod) {
        checkResourceType(moveLearnMethod, MoveLearnMethod.class);
        return getMoveLearnMethodById(moveLearnMethod.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getMoveTargets(int offset, int limit) {
        return getResult(service.getMoveTargets(offset, limit));
    }

    @Override
    public @NotNull MoveTarget getMoveTargetById(int id) {
        return getResult(service.getMoveTargetById(id));
    }

    @Override
    public @NotNull MoveTarget getMoveTargetByName(@NotNull String name) {
        return getResult(service.getMoveTargetByName(name));
    }

    @Override
    public @NotNull MoveTarget getMoveTarget(@NotNull ApiResource moveTarget) {
        checkResourceType(moveTarget, MoveTarget.class);
        return getMoveTargetById(moveTarget.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getAbilities(int offset, int limit) {
        return getResult(service.getAbilities(offset, limit));
    }

    @Override
    public @NotNull Ability getAbilityById(int id) {
        return getResult(service.getAbilityById(id));
    }

    @Override
    public @NotNull Ability getAbilityByName(@NotNull String name) {
        return getResult(service.getAbilityByName(name));
    }

    @Override
    public @NotNull Ability getAbility(@NotNull ApiResource ability) {
        checkResourceType(ability, Ability.class);
        return getAbilityById(ability.getId());
    }

    @Override
    public @NotNull ApiResourceList getCharacteristics(int offset, int limit) {
        return getResult(service.getCharacteristics(offset, limit));
    }

    @Override
    public @NotNull Characteristic getCharacteristicById(int id) {
        return getResult(service.getCharacteristic(id));
    }

    @Override
    public @NotNull Characteristic getCharacteristic(@NotNull ApiResource characteristic) {
        checkResourceType(characteristic, Characteristic.class);
        return getCharacteristicById(characteristic.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getEggGroups(int offset, int limit) {
        return getResult(service.getEggGroups(offset, limit));
    }

    @Override
    public @NotNull EggGroup getEggGroupById(int id) {
        return getResult(service.getEggGroupById(id));
    }

    @Override
    public @NotNull EggGroup getEggGroupByName(@NotNull String name) {
        return getResult(service.getEggGroupByName(name));
    }

    @Override
    public @NotNull EggGroup getEggGroup(@NotNull ApiResource eggGroup) {
        checkResourceType(eggGroup, EggGroup.class);
        return getEggGroupById(eggGroup.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getGenders(int offset, int limit) {
        return getResult(service.getGenders(offset, limit));
    }

    @Override
    public @NotNull Gender getGenderById(int id) {
        return getResult(service.getGenderById(id));
    }

    @Override
    public @NotNull Gender getGenderByName(@NotNull String name) {
        return getResult(service.getGenderByName(name));
    }

    @Override
    public @NotNull Gender getGender(@NotNull ApiResource gender) {
        checkResourceType(gender, Gender.class);
        return getGenderById(gender.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getGrowthRates(int offset, int limit) {
        return getResult(service.getGrowthRates(offset, limit));
    }

    @Override
    public @NotNull GrowthRate getGrowthRateById(int id) {
        return getResult(service.getGrowthRateById(id));
    }

    @Override
    public @NotNull GrowthRate getGrowthRateByName(@NotNull String name) {
        return getResult(service.getGrowthRateByName(name));
    }

    @Override
    public @NotNull GrowthRate getGrowthRate(@NotNull ApiResource growthRate) {
        checkResourceType(growthRate, GrowthRate.class);
        return getGrowthRateById(growthRate.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getNatures(int offset, int limit) {
        return getResult(service.getNatures(offset, limit));
    }

    @Override
    public @NotNull Nature getNatureById(int id) {
        return getResult(service.getNatureById(id));
    }

    @Override
    public @NotNull Nature getNatureByName(@NotNull String name) {
        return getResult(service.getNatureByName(name));
    }

    @Override
    public @NotNull Nature getNature(@NotNull ApiResource nature) {
        checkResourceType(nature, Nature.class);
        return getNatureById(nature.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getPokeathlonStats(int offset, int limit) {
        return getResult(service.getPokeathlonStats(offset, limit));
    }

    @Override
    public @NotNull PokeathlonStat getPokeathlonStatById(int id) {
        return getResult(service.getPokeathlonStatById(id));
    }

    @Override
    public @NotNull PokeathlonStat getPokeathlonStatByName(@NotNull String name) {
        return getResult(service.getPokeathlonStatByName(name));
    }

    @Override
    public @NotNull PokeathlonStat getPokeathlonStat(@NotNull ApiResource pokeathlonStat) {
        checkResourceType(pokeathlonStat, PokeathlonStat.class);
        return getPokeathlonStatById(pokeathlonStat.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getPokemon(int offset, int limit) {
        return getResult(service.getPokemon(offset, limit));
    }

    @Override
    public @NotNull Pokemon getPokemonById(int id) {
        return getResult(service.getPokemonById(id));
    }

    @Override
    public @NotNull Pokemon getPokemonByName(@NotNull String name) {
        return getResult(service.getPokemonByName(name));
    }

    @Override
    public @NotNull Pokemon getPokemon(@NotNull ApiResource pokemon) {
        checkResourceType(pokemon, Pokemon.class);
        return getPokemonById(pokemon.getId());
    }

    @Override
    public @NotNull List<LocationAreaEncounter> getPokemonEncountersById(int id) {
        return getResult(service.getPokemonEncountersById(id));
    }

    @Override
    public @NotNull List<LocationAreaEncounter> getPokemonEncountersByName(@NotNull String name) {
        return getResult(service.getPokemonEncountersByName(name));
    }

    @Override
    public @NotNull NamedApiResourceList getPokemonColors(int offset, int limit) {
        return getResult(service.getPokemonColors(offset, limit));
    }

    @Override
    public @NotNull PokemonColor getPokemonColorById(int id) {
        return getResult(service.getPokemonColorById(id));
    }

    @Override
    public @NotNull PokemonColor getPokemonColorByName(@NotNull String name) {
        return getResult(service.getPokemonColorByName(name));
    }

    @Override
    public @NotNull PokemonColor getPokemonColor(@NotNull ApiResource pokemonColor) {
        checkResourceType(pokemonColor, PokemonColor.class);
        return getPokemonColorById(pokemonColor.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getPokemonForms(int offset, int limit) {
        return getResult(service.getPokemonForms(offset, limit));
    }

    @Override
    public @NotNull PokemonForm getPokemonFormById(int id) {
        return getResult(service.getPokemonFormById(id));
    }

    @Override
    public @NotNull PokemonForm getPokemonFormByName(@NotNull String name) {
        return getResult(service.getPokemonFormByName(name));
    }

    @Override
    public @NotNull PokemonForm getPokemonForm(@NotNull ApiResource pokemonForm) {
        checkResourceType(pokemonForm, PokemonForm.class);
        return getPokemonFormById(pokemonForm.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getPokemonHabitats(int offset, int limit) {
        return getResult(service.getPokemonHabitats(offset, limit));
    }

    @Override
    public @NotNull PokemonHabitat getPokemonHabitatById(int id) {
        return getResult(service.getPokemonHabitatById(id));
    }

    @Override
    public @NotNull PokemonHabitat getPokemonHabitatByName(@NotNull String name) {
        return getResult(service.getPokemonHabitatByName(name));
    }

    @Override
    public @NotNull PokemonHabitat getPokemonHabitat(@NotNull ApiResource pokemonHabitat) {
        checkResourceType(pokemonHabitat, PokemonHabitat.class);
        return getPokemonHabitatById(pokemonHabitat.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getPokemonShapes(int offset, int limit) {
        return getResult(service.getPokemonShapes(offset, limit));
    }

    @Override
    public @NotNull PokemonShape getPokemonShapeById(int id) {
        return getResult(service.getPokemonShapeById(id));
    }

    @Override
    public @NotNull PokemonShape getPokemonShapeByName(@NotNull String name) {
        return getResult(service.getPokemonShapeByName(name));
    }

    @Override
    public @NotNull PokemonShape getPokemonShape(@NotNull ApiResource pokemonShape) {
        checkResourceType(pokemonShape, PokemonShape.class);
        return getPokemonShapeById(pokemonShape.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getPokemonSpecies(int offset, int limit) {
        return getResult(service.getPokemonSpecies(offset, limit));
    }

    @Override
    public @NotNull PokemonSpecies getPokemonSpeciesById(int id) {
        return getResult(service.getPokemonSpeciesById(id));
    }

    @Override
    public @NotNull PokemonSpecies getPokemonSpeciesByName(@NotNull String name) {
        return getResult(service.getPokemonSpeciesByName(name));
    }

    @Override
    public @NotNull PokemonSpecies getPokemonSpecies(@NotNull ApiResource pokemonSpecies) {
        checkResourceType(pokemonSpecies, PokemonSpecies.class);
        return getPokemonSpeciesById(pokemonSpecies.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getStats(int offset, int limit) {
        return getResult(service.getStats(offset, limit));
    }

    @Override
    public @NotNull Stat getStatById(int id) {
        return getResult(service.getStatById(id));
    }

    @Override
    public @NotNull Stat getStatByName(@NotNull String name) {
        return getResult(service.getStatByName(name));
    }

    @Override
    public @NotNull Stat getStat(@NotNull ApiResource stat) {
        checkResourceType(stat, Stat.class);
        return getStatById(stat.getId());
    }

    @Override
    public @NotNull NamedApiResourceList getTypes(int offset, int limit) {
        return getResult(service.getTypes(offset, limit));
    }

    @Override
    public @NotNull Type getTypeById(int id) {
        return getResult(service.getTypeById(id));
    }

    @Override
    public @NotNull Type getTypeByName(@NotNull String name) {
        return getResult(service.getTypeByName(name));
    }

    @Override
    public @NotNull Type getType(@NotNull ApiResource type) {
        checkResourceType(type, Type.class);
        return getTypeById(type.getId());
    }
}
