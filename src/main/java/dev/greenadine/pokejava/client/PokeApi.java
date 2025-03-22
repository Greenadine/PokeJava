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
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * The main interface for interacting with the PokéAPI.
 *
 * <p> A PokéAPI client can be created by either constructing a new instance of {@link PokeApiClient}, or by using the {@link PokeApiBuilder} class.
 */
public sealed interface PokeApi permits PokeApiClient {

    /**
     * Constant for the base URL for the official PokéAPI service.
     */
    @NotNull String BASE_URL = "https://pokeapi.co/api/v2/";

    //region Languages

    /**
     * Retrieves all languages.
     *
     * @return a list of all languages.
     */
    default @NotNull NamedApiResourceList getLanguages() {
        return getLanguages(0, 0);
    }

    /**
     * Retrieves a list of languages.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of languages.
     */
    @NotNull NamedApiResourceList getLanguages(int offset, int limit);

    /**
     * Retrieves the language with the specified ID.
     *
     * @param id the ID of the language.
     * @return the languages with the specified ID.
     * @throws ResourceNotFoundException if a language with the specified ID does not exist.
     */
    @NotNull Language getLanguageById(int id);

    /**
     * Retrieves the language with the specified name.
     *
     * @param name the name of the language.
     * @return the languages with the specified name.
     * @throws ResourceNotFoundException if a language with the specified name does not exist.
     */
    @NotNull Language getLanguageByName(@NotNull String name);

    /**
     * Retrieves the full language resource.
     *
     * @param language the language resource.
     * @return the full language resource.
     * @throws PokeApiException if the provided API resource is not a language.
     */
    @NotNull Language getLanguage(@NotNull ApiResource language);
    //endregion

    //region Berries

    /**
     * Retrieves all berries.
     *
     * @return a list of all berries.
     */
    default @NotNull NamedApiResourceList getBerries() {
        return getBerries(0, 0);
    }

    /**
     * Retrieves a list of berries.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of berries.
     */
    @NotNull NamedApiResourceList getBerries(int offset, int limit);

    /**
     * Retrieves the berry with the specified ID.
     *
     * @param id the ID of the berry.
     * @return the berry with the specified ID.
     * @throws ResourceNotFoundException if a berry with the specified ID does not exist.
     */
    @NotNull Berry getBerryById(int id);

    /**
     * Retrieves the berry with the specified name.
     *
     * @param name the name of the berry.
     * @return the berry with the specified name.
     * @throws ResourceNotFoundException if a berry with the specified name does not exist.
     */
    @NotNull Berry getBerryByName(@NotNull String name);

    /**
     * Retrieves the full berry resource.
     *
     * @param berry the berry resource.
     * @return the full berry resource.
     * @throws PokeApiException if the provided API resource is not a berry.
     */
    @NotNull Berry getBerry(@NotNull ApiResource berry);
    //endregion

    //region Berry Firmness

    /**
     * Retrieves all berry firmnesses.
     *
     * @return a list of all berry firmnesses.
     */
    default @NotNull NamedApiResourceList getBerryFirmnesses() {
        return getBerryFirmnesses(0, 0);
    }

    /**
     * Retrieves a list of berry firmnesses.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of berry firmnesses.
     */
    @NotNull NamedApiResourceList getBerryFirmnesses(int offset, int limit);

    /**
     * Retrieves the berry firmness with the specified ID.
     *
     * @param id the ID of the berry firmness.
     * @return the berry firmness with the specified ID.
     * @throws ResourceNotFoundException if a berry firmness with the specified ID does not exist.
     */
    @NotNull BerryFirmness getBerryFirmnessById(int id);

    /**
     * Retrieves the berry firmness with the specified name.
     *
     * @param name the name of the berry firmness.
     * @return the berry firmness with the specified name.
     * @throws ResourceNotFoundException if a berry firmness with the specified name does not exist.
     */
    @NotNull BerryFirmness getBerryFirmnessByName(@NotNull String name);

    /**
     * Retrieves the full berry firmness resource.
     *
     * @param berryFirmness the berry firmness resource.
     * @return the full berry firmness resource.
     * @throws PokeApiException if the provided API resource is not a berry firmness.
     */
    @NotNull BerryFirmness getBerryFirmness(@NotNull ApiResource berryFirmness);
    //endregion

    //region Berry Flavors

    /**
     * Retrieves all berry flavors.
     *
     * @return a list of all berry flavors.
     */
    default @NotNull NamedApiResourceList getBerryFlavors() {
        return getBerryFlavors(0, 0);
    }

    /**
     * Retrieves a list of berry flavors.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of berry flavors.
     */
    @NotNull NamedApiResourceList getBerryFlavors(int offset, int limit);

    /**
     * Retrieves the berry flavor with the specified ID.
     *
     * @param id the ID of the berry flavor.
     * @return the berry flavor with the specified ID.
     * @throws ResourceNotFoundException if a berry flavor with the specified ID does not exist.
     */
    @NotNull BerryFlavor getBerryFlavorById(int id);

    /**
     * Retrieves the berry flavor with the specified name.
     *
     * @param name the name of the berry flavor.
     * @return the berry flavor with the specified name.
     * @throws ResourceNotFoundException if a berry flavor with the specified name does not exist.
     */
    @NotNull BerryFlavor getBerryFlavorByName(@NotNull String name);

    /**
     * Retrieves the full berry flavor resource.
     *
     * @param berryFlavor the berry flavor resource.
     * @return the full berry flavor resource.
     * @throws PokeApiException if the provided API resource is not a berry flavor.
     */
    @NotNull BerryFlavor getBerryFlavor(@NotNull ApiResource berryFlavor);
    //endregion

    //region Contest Types

    /**
     * Retrieves all contest types.
     *
     * @return a list of all contest types.
     */
    default @NotNull NamedApiResourceList getContestTypes() {
        return getContestTypes(0, 0);
    }

    /**
     * Retrieves a list of contest types.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of contest types.
     */
    @NotNull NamedApiResourceList getContestTypes(int offset, int limit);

    /**
     * Retrieves the contest type with the specified ID.
     *
     * @param id the ID of the contest type.
     * @return the contest type with the specified ID.
     * @throws ResourceNotFoundException if a contest type with the specified ID does not exist.
     */
    @NotNull ContestType getContestTypeById(int id);

    /**
     * Retrieves the contest type with the specified name.
     *
     * @param name the name of the contest type.
     * @return the contest type with the specified name.
     * @throws ResourceNotFoundException if a contest type with the specified name does not exist.
     */
    @NotNull ContestType getContestTypeByName(@NotNull String name);

    /**
     * Retrieves the full contest type resource.
     *
     * @param contestType the contest type resource.
     * @return the full contest type resource.
     * @throws PokeApiException if the provided API resource is not a contest type.
     */
    @NotNull ContestType getContestType(@NotNull ApiResource contestType);
    //endregion

    //region Contest Effects

    /**
     * Retrieves all contest effects.
     *
     * @return a list of all contest effects.
     */
    default @NotNull ApiResourceList getContestEffects() {
        return getContestEffects(0, 0);
    }

    /**
     * Retrieves a list of contest effects.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of contest effects.
     */
    @NotNull ApiResourceList getContestEffects(int offset, int limit);

    /**
     * Retrieves the contest effect with the specified ID.
     *
     * @param id the ID of the contest effect.
     * @return the contest effect with the specified ID.
     * @throws ResourceNotFoundException if a contest effect with the specified ID does not exist.
     */
    @NotNull ContestEffect getContestEffectById(int id);

    /**
     * Retrieves the full contest effect resource.
     *
     * @param contestEffect the contest effect resource.
     * @return the full contest effect resource.
     * @throws PokeApiException if the provided API resource is not a contest effect.
     */
    @NotNull ContestEffect getContestEffect(@NotNull ApiResource contestEffect);
    //endregion

    //region Super Contest Effects

    /**
     * Retrieves all super contest effects.
     *
     * @return a list of all super contest effects.
     */
    default @NotNull ApiResourceList getSuperContestEffects() {
        return getSuperContestEffects(0, 0);
    }

    /**
     * Retrieves a list of super contest effects.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of super contest effects.
     */
    @NotNull ApiResourceList getSuperContestEffects(int offset, int limit);

    /**
     * Retrieves the super contest effect with the specified ID.
     *
     * @param id the ID of the super contest effect.
     * @return the super contest effect with the specified ID.
     * @throws ResourceNotFoundException if a super contest effect with the specified ID does not exist.
     */
    @NotNull SuperContestEffect getSuperContestEffectById(int id);

    /**
     * Retrieves the full super contest effect resource.
     *
     * @param superContestEffect the super contest effect resource.
     * @return the full super contest effect resource.
     * @throws PokeApiException if the provided API resource is not a super contest effect.
     */
    @NotNull SuperContestEffect getSuperContestEffect(@NotNull ApiResource superContestEffect);
    //endregion

    //region Encounter Methods

    /**
     * Retrieves all encounter methods.
     *
     * @return a list of all encounter methods.
     */
    default @NotNull NamedApiResourceList getEncounterMethods() {
        return getEncounterMethods(0, 0);
    }

    /**
     * Retrieves a list of encounter methods.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of encounter methods.
     */
    @NotNull NamedApiResourceList getEncounterMethods(int offset, int limit);

    /**
     * Retrieves the encounter method with the specified ID.
     *
     * @param id the ID of the encounter method.
     * @return the encounter method with the specified ID.
     * @throws ResourceNotFoundException if an encounter method with the specified ID does not exist.
     */
    @NotNull EncounterMethod getEncounterMethodById(int id);

    /**
     * Retrieves the encounter method with the specified name.
     *
     * @param name the name of the encounter method.
     * @return the encounter method with the specified name.
     * @throws ResourceNotFoundException if an encounter method with the specified name does not exist.
     */
    @NotNull EncounterMethod getEncounterMethodByName(@NotNull String name);

    /**
     * Retrieves the full encounter method resource.
     *
     * @param encounterMethod the encounter method resource.
     * @return the full encounter method resource.
     * @throws PokeApiException if the provided API resource is not an encounter method.
     */
    @NotNull EncounterMethod getEncounterMethod(@NotNull ApiResource encounterMethod);
    //endregion

    //region Encounter Conditions

    /**
     * Retrieves all encounter conditions.
     *
     * @return a list of all encounter conditions.
     */
    default @NotNull NamedApiResourceList getEncounterConditions() {
        return getEncounterConditions(0, 0);
    }

    /**
     * Retrieves a list of encounter conditions.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of encounter conditions.
     */
    @NotNull NamedApiResourceList getEncounterConditions(int offset, int limit);

    /**
     * Retrieves the encounter condition with the specified ID.
     *
     * @param id the ID of the encounter condition.
     * @return the encounter condition with the specified ID.
     * @throws ResourceNotFoundException if an encounter condition with the specified ID does not exist.
     */
    @NotNull EncounterCondition getEncounterConditionById(int id);

    /**
     * Retrieves the encounter condition with the specified name.
     *
     * @param name the name of the encounter condition.
     * @return the encounter condition with the specified name.
     * @throws ResourceNotFoundException if an encounter condition with the specified name does not exist.
     */
    @NotNull EncounterCondition getEncounterConditionByName(@NotNull String name);

    /**
     * Retrieves the full encounter condition resource.
     *
     * @param encounterCondition the encounter condition resource.
     * @return the full encounter condition resource.
     * @throws PokeApiException if the provided API resource is not an encounter condition.
     */
    @NotNull EncounterCondition getEncounterCondition(@NotNull ApiResource encounterCondition);
    //endregion

    //region Encounter Condition Values

    /**
     * Retrieves all encounter condition values.
     *
     * @return a list of all encounter condition values.
     */
    default @NotNull NamedApiResourceList getEncounterConditionValues() {
        return getEncounterConditionValues(0, 0);
    }

    /**
     * Retrieves a list of encounter condition values.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of encounter condition values.
     */
    @NotNull NamedApiResourceList getEncounterConditionValues(int offset, int limit);

    /**
     * Retrieves the encounter condition value with the specified ID.
     *
     * @param id the ID of the encounter condition value.
     * @return the encounter condition value with the specified ID.
     * @throws ResourceNotFoundException if an encounter condition value with the specified ID does not exist.
     */
    @NotNull EncounterConditionValue getEncounterConditionValueById(int id);

    /**
     * Retrieves the encounter condition value with the specified name.
     *
     * @param name the name of the encounter condition value.
     * @return the encounter condition value with the specified name.
     * @throws ResourceNotFoundException if an encounter condition value with the specified name does not exist.
     */
    @NotNull EncounterConditionValue getEncounterConditionValueByName(@NotNull String name);

    /**
     * Retrieves the full encounter condition value resource.
     *
     * @param encounterConditionValue the encounter condition value resource.
     * @return the full encounter condition value resource.
     * @throws PokeApiException if the provided API resource is not an encounter condition value.
     */
    @NotNull EncounterConditionValue getEncounterConditionValue(@NotNull ApiResource encounterConditionValue);
    //endregion

    //region Evolution Chains

    /**
     * Retrieves all evolution chains.
     *
     * @return a list of all evolution chains.
     */
    default @NotNull ApiResourceList getEvolutionChains() {
        return getEvolutionChains(0, 0);
    }

    /**
     * Retrieves a list of evolution chains.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of evolution chains.
     */
    @NotNull ApiResourceList getEvolutionChains(int offset, int limit);

    /**
     * Retrieves the evolution chain with the specified ID.
     *
     * @param id the ID of the evolution chain.
     * @return the evolution chain with the specified ID.
     * @throws ResourceNotFoundException if an evolution chain with the specified ID does not exist.
     */
    @NotNull EvolutionChain getEvolutionChainById(int id);

    /**
     * Retrieves the full evolution chain resource.
     *
     * @param evolutionChain the evolution chain resource.
     * @return the full evolution chain resource.
     * @throws PokeApiException if the provided API resource is not an evolution chain.
     */
    @NotNull EvolutionChain getEvolutionChain(@NotNull ApiResource evolutionChain);
    //endregion

    //region Evolution Triggers

    /**
     * Retrieves all evolution triggers.
     *
     * @return a list of all evolution triggers.
     */
    default @NotNull NamedApiResourceList getEvolutionTriggers() {
        return getEvolutionTriggers(0, 0);
    }

    /**
     * Retrieves a list of evolution triggers.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of evolution triggers.
     */
    @NotNull NamedApiResourceList getEvolutionTriggers(int offset, int limit);

    /**
     * Retrieves the evolution trigger with the specified ID.
     *
     * @param id the ID of the evolution trigger.
     * @return the evolution trigger with the specified ID.
     * @throws ResourceNotFoundException if an evolution trigger with the specified ID does not exist.
     */
    @NotNull EvolutionTrigger getEvolutionTriggerById(int id);

    /**
     * Retrieves the evolution trigger with the specified name.
     *
     * @param name the name of the evolution trigger.
     * @return the evolution trigger with the specified name.
     * @throws ResourceNotFoundException if an evolution trigger with the specified name does not exist.
     */
    @NotNull EvolutionTrigger getEvolutionTriggerByName(@NotNull String name);

    /**
     * Retrieves the full evolution trigger resource.
     *
     * @param evolutionTrigger the evolution trigger resource.
     * @return the full evolution trigger resource.
     * @throws PokeApiException if the provided API resource is not an evolution trigger.
     */
    @NotNull EvolutionTrigger getEvolutionTrigger(@NotNull ApiResource evolutionTrigger);
    //endregion

    //region Generations

    /**
     * Retrieves all generations.
     *
     * @return a list of all generations.
     */
    default @NotNull NamedApiResourceList getGenerations() {
        return getGenerations(0, 0);
    }

    /**
     * Retrieves a list of generations.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of generations.
     */
    @NotNull NamedApiResourceList getGenerations(int offset, int limit);

    /**
     * Retrieves the generation with the specified ID.
     *
     * @param id the ID of the generation.
     * @return the generation with the specified ID.
     * @throws ResourceNotFoundException if a generation with the specified ID does not exist.
     */
    @NotNull Generation getGenerationById(int id);

    /**
     * Retrieves the generation with the specified name.
     *
     * @param name the name of the generation.
     * @return the generation with the specified name.
     * @throws ResourceNotFoundException if a generation with the specified name does not exist.
     */
    @NotNull Generation getGenerationByName(@NotNull String name);

    /**
     * Retrieves the full generation resource.
     *
     * @param generation the generation resource.
     * @return the full generation resource.
     * @throws PokeApiException if the provided API resource is not a generation.
     */
    @NotNull Generation getGeneration(@NotNull ApiResource generation);
    //endregion

    //region Pokédexes

    /**
     * Retrieves all Pokédexes.
     *
     * @return a list of all Pokédexes.
     */
    default @NotNull NamedApiResourceList getPokedexes() {
        return getPokedexes(0, 0);
    }

    /**
     * Retrieves a list of Pokédexes.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of Pokédexes.
     */
    @NotNull NamedApiResourceList getPokedexes(int offset, int limit);

    /**
     * Retrieves the Pokédex with the specified ID.
     *
     * @param id the ID of the Pokédex.
     * @return the Pokédex with the specified ID.
     * @throws ResourceNotFoundException if a Pokédex with the specified ID does not exist.
     */
    @NotNull Pokedex getPokedexById(int id);

    /**
     * Retrieves the Pokédex with the specified name.
     *
     * @param name the name of the Pokédex.
     * @return the Pokédex with the specified name.
     * @throws ResourceNotFoundException if a Pokédex with the specified name does not exist.
     */
    @NotNull Pokedex getPokedexByName(@NotNull String name);

    /**
     * Retrieves the full Pokédex resource.
     *
     * @param pokedex the Pokédex resource.
     * @return the full Pokédex resource.
     * @throws PokeApiException if the provided API resource is not a Pokédex.
     */
    @NotNull Pokedex getPokedex(@NotNull ApiResource pokedex);
    //endregion

    //region Versions

    /**
     * Retrieves all versions.
     *
     * @return a list of all versions.
     */
    default @NotNull NamedApiResourceList getVersions() {
        return getVersions(0, 0);
    }

    /**
     * Retrieves a list of versions.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of versions.
     */
    @NotNull NamedApiResourceList getVersions(int offset, int limit);

    /**
     * Retrieves the version with the specified ID.
     *
     * @param id the ID of the version.
     * @return the version with the specified ID.
     * @throws ResourceNotFoundException if a version with the specified ID does not exist.
     */
    @NotNull Version getVersionById(int id);

    /**
     * Retrieves the version with the specified name.
     *
     * @param name the name of the version.
     * @return the version with the specified name.
     * @throws ResourceNotFoundException if a version with the specified name does not exist.
     */
    @NotNull Version getVersionByName(@NotNull String name);

    /**
     * Retrieves the full version resource.
     *
     * @param version the version resource.
     * @return the full version resource.
     * @throws PokeApiException if the provided API resource is not a version.
     */
    @NotNull Version getVersion(@NotNull ApiResource version);
    //endregion

    //region Version Groups

    /**
     * Retrieves all version groups.
     *
     * @return a list of all version groups.
     */
    default @NotNull NamedApiResourceList getVersionGroups() {
        return getVersionGroups(0, 0);
    }

    /**
     * Retrieves a list of version groups.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of version groups.
     */
    @NotNull NamedApiResourceList getVersionGroups(int offset, int limit);

    /**
     * Retrieves the version group with the specified ID.
     *
     * @param id the ID of the version group.
     * @return the version group with the specified ID.
     * @throws ResourceNotFoundException if a version group with the specified ID does not exist.
     */
    @NotNull VersionGroup getVersionGroupById(int id);

    /**
     * Retrieves the version group with the specified name.
     *
     * @param name the name of the version group.
     * @return the version group with the specified name.
     * @throws ResourceNotFoundException if a version group with the specified name does not exist.
     */
    @NotNull VersionGroup getVersionGroupByName(@NotNull String name);

    /**
     * Retrieves the full version group resource.
     *
     * @param versionGroup the version group resource.
     * @return the full version group resource.
     * @throws PokeApiException if the provided API resource is not a version group.
     */
    @NotNull VersionGroup getVersionGroup(@NotNull ApiResource versionGroup);
    //endregion

    //region Items

    /**
     * Retrieves all items.
     *
     * @return a list of all items.
     */
    default @NotNull NamedApiResourceList getItems() {
        return getItems(0, 0);
    }

    /**
     * Retrieves a list of items.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of items.
     */
    @NotNull NamedApiResourceList getItems(int offset, int limit);

    /**
     * Retrieves the item with the specified ID.
     *
     * @param id the ID of the item.
     * @return the item with the specified ID.
     * @throws ResourceNotFoundException if an item with the specified ID does not exist.
     */
    @NotNull Item getItemById(int id);

    /**
     * Retrieves the item with the specified name.
     *
     * @param name the name of the item.
     * @return the item with the specified name.
     * @throws ResourceNotFoundException if an item with the specified name does not exist.
     */
    @NotNull Item getItemByName(@NotNull String name);

    /**
     * Retrieves the full item resource.
     *
     * @param item the item resource.
     * @return the full item resource.
     * @throws PokeApiException if the provided API resource is not an item.
     */
    @NotNull Item getItem(@NotNull ApiResource item);
    //endregion

    //region Item Attributes

    /**
     * Retrieves all item attributes.
     *
     * @return a list of all item attributes.
     */
    default @NotNull NamedApiResourceList getItemAttributes() {
        return getItemAttributes(0, 0);
    }

    /**
     * Retrieves a list of item attributes.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of item attributes.
     */
    @NotNull NamedApiResourceList getItemAttributes(int offset, int limit);

    /**
     * Retrieves the item attribute with the specified ID.
     *
     * @param id the ID of the item attribute.
     * @return the item attribute with the specified ID.
     * @throws ResourceNotFoundException if an item attribute with the specified ID does not exist.
     */
    @NotNull ItemAttribute getItemAttributeById(int id);

    /**
     * Retrieves the item attribute with the specified name.
     *
     * @param name the name of the item attribute.
     * @return the item attribute with the specified name.
     * @throws ResourceNotFoundException if an item attribute with the specified name does not exist.
     */
    @NotNull ItemAttribute getItemAttributeByName(@NotNull String name);

    /**
     * Retrieves the full item attribute resource.
     *
     * @param itemAttribute the item attribute resource.
     * @return the full item attribute resource.
     * @throws PokeApiException if the provided API resource is not an item attribute.
     */
    @NotNull ItemAttribute getItemAttribute(@NotNull ApiResource itemAttribute);
    //endregion

    //region Item Categories

    /**
     * Retrieves all item categories.
     *
     * @return a list of all item categories.
     */
    default @NotNull NamedApiResourceList getItemCategories() {
        return getItemCategories(0, 0);
    }

    /**
     * Retrieves a list of item categories.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of item categories.
     */
    @NotNull NamedApiResourceList getItemCategories(int offset, int limit);

    /**
     * Retrieves the item category with the specified ID.
     *
     * @param id the ID of the item category.
     * @return the item category with the specified ID.
     * @throws ResourceNotFoundException if an item category with the specified ID does not exist.
     */
    @NotNull ItemCategory getItemCategoryById(int id);

    /**
     * Retrieves the item category with the specified name.
     *
     * @param name the name of the item category.
     * @return the item category with the specified name.
     * @throws ResourceNotFoundException if an item category with the specified name does not exist.
     */
    @NotNull ItemCategory getItemCategoryByName(@NotNull String name);

    /**
     * Retrieves the full item category resource.
     *
     * @param itemCategory the item category resource.
     * @return the full item category resource.
     * @throws PokeApiException if the provided API resource is not an item category.
     */
    @NotNull ItemCategory getItemCategory(@NotNull ApiResource itemCategory);
    //endregion

    //region Item Fling Effects

    /**
     * Retrieves all item fling effects.
     *
     * @return a list of all item fling effects.
     */
    default @NotNull NamedApiResourceList getItemFlingEffects() {
        return getItemFlingEffects(0, 0);
    }

    /**
     * Retrieves a list of item fling effects.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of item fling effects.
     */
    @NotNull NamedApiResourceList getItemFlingEffects(int offset, int limit);

    /**
     * Retrieves the item fling effect with the specified ID.
     *
     * @param id the ID of the item fling effect.
     * @return the item fling effect with the specified ID.
     * @throws ResourceNotFoundException if an item fling effect with the specified ID does not exist.
     */
    @NotNull ItemFlingEffect getItemFlingEffectById(int id);

    /**
     * Retrieves the item fling effect with the specified name.
     *
     * @param name the name of the item fling effect.
     * @return the item fling effect with the specified name.
     * @throws ResourceNotFoundException if an item fling effect with the specified name does not exist.
     */
    @NotNull ItemFlingEffect getItemFlingEffectByName(@NotNull String name);

    /**
     * Retrieves the full item fling effect resource.
     *
     * @param itemFlingEffect the item fling effect resource.
     * @return the full item fling effect resource.
     * @throws PokeApiException if the provided API resource is not an item fling effect.
     */
    @NotNull ItemFlingEffect getItemFlingEffect(@NotNull ApiResource itemFlingEffect);
    //endregion

    //region Item Pockets

    /**
     * Retrieves all item pockets.
     *
     * @return a list of all item pockets.
     */
    default @NotNull NamedApiResourceList getItemPockets() {
        return getItemPockets(0, 0);
    }

    /**
     * Retrieves a list of item pockets.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of item pockets.
     */
    @NotNull NamedApiResourceList getItemPockets(int offset, int limit);

    /**
     * Retrieves the item pocket with the specified ID.
     *
     * @param id the ID of the item pocket.
     * @return the item pocket with the specified ID.
     * @throws ResourceNotFoundException if an item pocket with the specified ID does not exist.
     */
    @NotNull ItemPocket getItemPocketById(int id);

    /**
     * Retrieves the item pocket with the specified name.
     *
     * @param name the name of the item pocket.
     * @return the item pocket with the specified name.
     * @throws ResourceNotFoundException if an item pocket with the specified name does not exist.
     */
    @NotNull ItemPocket getItemPocketByName(@NotNull String name);

    /**
     * Retrieves the full item pocket resource.
     *
     * @param itemPocket the item pocket resource.
     * @return the full item pocket resource.
     * @throws PokeApiException if the provided API resource is not an item pocket.
     */
    @NotNull ItemPocket getItemPocket(@NotNull ApiResource itemPocket);
    //endregion

    //region Locations

    /**
     * Retrieves all locations.
     *
     * @return a list of all locations.
     */
    default @NotNull NamedApiResourceList getLocations() {
        return getLocations(0, 0);
    }

    /**
     * Retrieves a list of locations.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of locations.
     */
    @NotNull NamedApiResourceList getLocations(int offset, int limit);

    /**
     * Retrieves the location with the specified ID.
     *
     * @param id the ID of the location.
     * @return the location with the specified ID.
     * @throws ResourceNotFoundException if a location with the specified ID does not exist.
     */
    @NotNull Location getLocationById(int id);

    /**
     * Retrieves the location with the specified name.
     *
     * @param name the name of the location.
     * @return the location with the specified name.
     * @throws ResourceNotFoundException if a location with the specified name does not exist.
     */
    @NotNull Location getLocationByName(@NotNull String name);

    /**
     * Retrieves the full location resource.
     *
     * @param location the location resource.
     * @return the full location resource.
     * @throws PokeApiException if the provided API resource is not a location.
     */
    @NotNull Location getLocation(@NotNull ApiResource location);
    //endregion

    //region Location Areas

    /**
     * Retrieves all location areas.
     *
     * @return a list of all location areas.
     */
    default @NotNull NamedApiResourceList getLocationAreas() {
        return getLocationAreas(0, 0);
    }

    /**
     * Retrieves a list of location areas.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of location areas.
     */
    @NotNull NamedApiResourceList getLocationAreas(int offset, int limit);

    /**
     * Retrieves the location area with the specified ID.
     *
     * @param id the ID of the location area.
     * @return the location area with the specified ID.
     * @throws ResourceNotFoundException if a location area with the specified ID does not exist.
     */
    @NotNull LocationArea getLocationAreaById(int id);

    /**
     * Retrieves the location area with the specified name.
     *
     * @param name the name of the location area.
     * @return the location area with the specified name.
     * @throws ResourceNotFoundException if a location area with the specified name does not exist.
     */
    @NotNull LocationArea getLocationAreaByName(@NotNull String name);

    /**
     * Retrieves the full location area resource.
     *
     * @param locationArea the location area resource.
     * @return the full location area resource.
     * @throws PokeApiException if the provided API resource is not a location area.
     */
    @NotNull LocationArea getLocationArea(@NotNull ApiResource locationArea);
    //endregion

    //region Pal Park Areas

    /**
     * Retrieves all Pal Park areas.
     *
     * @return a list of all Pal Park areas.
     */
    default @NotNull NamedApiResourceList getPalParkAreas() {
        return getPalParkAreas(0, 0);
    }

    /**
     * Retrieves a list of Pal Park areas.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of Pal Park areas.
     */
    @NotNull NamedApiResourceList getPalParkAreas(int offset, int limit);

    /**
     * Retrieves the Pal Park area with the specified ID.
     *
     * @param id the ID of the Pal Park area.
     * @return the Pal Park area with the specified ID.
     * @throws ResourceNotFoundException if a Pal Park area with the specified ID does not exist.
     */
    @NotNull PalParkArea getPalParkAreaById(int id);

    /**
     * Retrieves the Pal Park area with the specified name.
     *
     * @param name the name of the Pal Park area.
     * @return the Pal Park area with the specified name.
     * @throws ResourceNotFoundException if a Pal Park area with the specified name does not exist.
     */
    @NotNull PalParkArea getPalParkAreaByName(@NotNull String name);

    /**
     * Retrieves the full Pal Park area resource.
     *
     * @param palParkArea the Pal Park area resource.
     * @return the full Pal Park area resource.
     * @throws PokeApiException if the provided API resource is not a Pal Park area.
     */
    @NotNull PalParkArea getPalParkArea(@NotNull ApiResource palParkArea);
    //endregion

    //region Regions

    /**
     * Retrieves all regions.
     *
     * @return a list of all regions.
     */
    default @NotNull NamedApiResourceList getRegions() {
        return getRegions(0, 0);
    }

    /**
     * Retrieves a list of regions.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of regions.
     */
    @NotNull NamedApiResourceList getRegions(int offset, int limit);

    /**
     * Retrieves the region with the specified ID.
     *
     * @param id the ID of the region.
     * @return the region with the specified ID.
     * @throws ResourceNotFoundException if a region with the specified ID does not exist.
     */
    @NotNull Region getRegionById(int id);

    /**
     * Retrieves the region with the specified name.
     *
     * @param name the name of the region.
     * @return the region with the specified name.
     * @throws ResourceNotFoundException if a region with the specified name does not exist.
     */
    @NotNull Region getRegionByName(@NotNull String name);

    /**
     * Retrieves the full region resource.
     *
     * @param region the region resource.
     * @return the full region resource.
     * @throws PokeApiException if the provided API resource is not a region.
     */
    @NotNull Region getRegion(@NotNull ApiResource region);
    //endregion

    //region Machines

    /**
     * Retrieves all machines.
     *
     * @return a list of all machines.
     */
    default @NotNull ApiResourceList getMachines() {
        return getMachines(0, 0);
    }

    /**
     * Retrieves a list of machines.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of machines.
     */
    @NotNull ApiResourceList getMachines(int offset, int limit);

    /**
     * Retrieves the machine with the specified ID.
     *
     * @param id the ID of the machine.
     * @return the machine with the specified ID.
     * @throws ResourceNotFoundException if a machine with the specified ID does not exist.
     */
    @NotNull Machine getMachineById(int id);

    /**
     * Retrieves the full machine resource.
     *
     * @param machine the machine resource.
     * @return the full machine resource.
     * @throws PokeApiException if the provided API resource is not a machine.
     */
    @NotNull Machine getMachine(@NotNull ApiResource machine);
    //endregion

    //region Moves

    /**
     * Retrieves all moves.
     *
     * @return a list of all moves.
     */
    default @NotNull NamedApiResourceList getMoves() {
        return getMoves(0, 0);
    }

    /**
     * Retrieves a list of moves.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of moves.
     */
    @NotNull NamedApiResourceList getMoves(int offset, int limit);

    /**
     * Retrieves the move with the specified ID.
     *
     * @param id the ID of the move.
     * @return the move with the specified ID.
     * @throws ResourceNotFoundException if a move with the specified ID does not exist.
     */
    @NotNull Move getMoveById(int id);

    /**
     * Retrieves the move with the specified name.
     *
     * @param name the name of the move.
     * @return the move with the specified name.
     * @throws ResourceNotFoundException if a move with the specified name does not exist.
     */
    @NotNull Move getMoveByName(@NotNull String name);

    /**
     * Retrieves the full move resource.
     *
     * @param move the move resource.
     * @return the full move resource.
     * @throws PokeApiException if the provided API resource is not a move.
     */
    @NotNull Move getMove(@NotNull ApiResource move);
    //endregion

    //region Move Ailments

    /**
     * Retrieves all move ailments.
     *
     * @return a list of all move ailments.
     */
    default @NotNull NamedApiResourceList getMoveAilments() {
        return getMoveAilments(0, 0);
    }

    /**
     * Retrieves a list of move ailments.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of move ailments.
     */
    @NotNull NamedApiResourceList getMoveAilments(int offset, int limit);

    /**
     * Retrieves the move ailment with the specified ID.
     *
     * @param id the ID of the move ailment.
     * @return the move ailment with the specified ID.
     * @throws ResourceNotFoundException if a move ailment with the specified ID does not exist.
     */
    @NotNull MoveAilment getMoveAilmentById(int id);

    /**
     * Retrieves the move ailment with the specified name.
     *
     * @param name the name of the move ailment.
     * @return the move ailment with the specified name.
     * @throws ResourceNotFoundException if a move ailment with the specified name does not exist.
     */
    @NotNull MoveAilment getMoveAilmentByName(@NotNull String name);

    /**
     * Retrieves the full move ailment resource.
     *
     * @param moveAilment the move ailment resource.
     * @return the full move ailment resource.
     * @throws PokeApiException if the provided API resource is not a move ailment.
     */
    @NotNull MoveAilment getMoveAilment(@NotNull ApiResource moveAilment);
    //endregion

    //region Move Battle Styles

    /**
     * Retrieves all move battle styles.
     *
     * @return a list of all move battle styles.
     */
    default @NotNull NamedApiResourceList getMoveBattleStyles() {
        return getMoveBattleStyles(0, 0);
    }

    /**
     * Retrieves a list of move battle styles.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of move battle styles.
     */
    @NotNull NamedApiResourceList getMoveBattleStyles(int offset, int limit);

    /**
     * Retrieves the move battle style with the specified ID.
     *
     * @param id the ID of the move battle style.
     * @return the move battle style with the specified ID.
     * @throws ResourceNotFoundException if a move battle style with the specified ID does not exist.
     */
    @NotNull MoveBattleStyle getMoveBattleStyleById(int id);

    /**
     * Retrieves the move battle style with the specified name.
     *
     * @param name the name of the move battle style.
     * @return the move battle style with the specified name.
     * @throws ResourceNotFoundException if a move battle style with the specified name does not exist.
     */
    @NotNull MoveBattleStyle getMoveBattleStyleByName(@NotNull String name);

    /**
     * Retrieves the full move battle style resource.
     *
     * @param moveBattleStyle the move battle style resource.
     * @return the full move battle style resource.
     * @throws PokeApiException if the provided API resource is not a move battle style.
     */
    @NotNull MoveBattleStyle getMoveBattleStyle(@NotNull ApiResource moveBattleStyle);
    //endregion

    // Move Categories

    /**
     * Retrieves all move categories.
     *
     * @return a list of all move categories.
     */
    default @NotNull NamedApiResourceList getMoveCategories() {
        return getMoveCategories(0, 0);
    }

    /**
     * Retrieves a list of move categories.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of move categories.
     */
    @NotNull NamedApiResourceList getMoveCategories(int offset, int limit);

    /**
     * Retrieves the move category with the specified ID.
     *
     * @param id the ID of the move category.
     * @return the move category with the specified ID.
     * @throws ResourceNotFoundException if a move category with the specified ID does not exist.
     */
    @NotNull MoveCategory getMoveCategoryById(int id);

    /**
     * Retrieves the move category with the specified name.
     *
     * @param name the name of the move category.
     * @return the move category with the specified name.
     * @throws ResourceNotFoundException if a move category with the specified name does not exist.
     */
    @NotNull MoveCategory getMoveCategoryByName(@NotNull String name);

    /**
     * Retrieves the full move category resource.
     *
     * @param moveCategory the move category resource.
     * @return the full move category resource.
     * @throws PokeApiException if the provided API resource is not a move category.
     */
    @NotNull MoveCategory getMoveCategory(@NotNull ApiResource moveCategory);
    //endregion

    //region Move Damage Classes

    /**
     * Retrieves all move damage classes.
     *
     * @return a list of all move damage classes.
     */
    default @NotNull NamedApiResourceList getMoveDamageClasses() {
        return getMoveDamageClasses(0, 0);
    }

    /**
     * Retrieves a list of move damage classes.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of move damage classes.
     */
    @NotNull NamedApiResourceList getMoveDamageClasses(int offset, int limit);

    /**
     * Retrieves a move damage class with the specified ID.
     *
     * @param id the ID of the move damage class.
     * @return the move damage class with the specified ID.
     * @throws ResourceNotFoundException if a move damage class with the specified ID does not exist.
     */
    @NotNull MoveDamageClass getMoveDamageClassById(int id);

    /**
     * Retrieves a move damage class with the specified name.
     *
     * @param name the name of the move damage class.
     * @return the move damage class with the specified name.
     * @throws ResourceNotFoundException if a move damage class with the specified name does not exist.
     */
    @NotNull MoveDamageClass getMoveDamageClassByName(@NotNull String name);

    /**
     * Retrieves the full move damage class resource.
     *
     * @param moveDamageClass the move damage class resource.
     * @return the full move damage class resource.
     * @throws PokeApiException if the provided API resource is not a move damage class.
     */
    @NotNull MoveDamageClass getMoveDamageClass(@NotNull ApiResource moveDamageClass);
    //endregion

    //region Move Learn Methods

    /**
     * Retrieves all move learn methods.
     *
     * @return a list of all move learn methods.
     */
    default @NotNull NamedApiResourceList getMoveLearnMethods() {
        return getMoveLearnMethods(0, 0);
    }

    /**
     * Retrieves a list of move learn methods.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of move learn methods.
     */
    @NotNull NamedApiResourceList getMoveLearnMethods(int offset, int limit);

    /**
     * Retrieves a move learn method with the specified ID.
     *
     * @param id the ID of the move learn method.
     * @return the move learn method with the specified ID.
     * @throws ResourceNotFoundException if a move learn method with the specified ID does not exist.
     */
    @NotNull MoveLearnMethod getMoveLearnMethodById(int id);

    /**
     * Retrieves a move learn method with the specified name.
     *
     * @param name the name of the move learn method.
     * @return the move learn method with the specified name.
     * @throws ResourceNotFoundException if a move learn method with the specified name does not exist.
     */
    @NotNull MoveLearnMethod getMoveLearnMethodByName(@NotNull String name);

    /**
     * Retrieves the full move learn method resource.
     *
     * @param moveLearnMethod the move learn method resource.
     * @return the full move learn method resource.
     * @throws PokeApiException if the provided API resource is not a move learn method.
     */
    @NotNull MoveLearnMethod getMoveLearnMethod(@NotNull ApiResource moveLearnMethod);
    //endregion

    //region Move Targets

    /**
     * Retrieves all move targets.
     *
     * @return a list of all move targets.
     */
    default @NotNull NamedApiResourceList getMoveTargets() {
        return getMoveTargets(0, 0);
    }

    /**
     * Retrieves a list of move targets.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of move targets.
     */
    @NotNull NamedApiResourceList getMoveTargets(int offset, int limit);

    /**
     * Retrieves a move target with the specified ID.
     *
     * @param id the ID of the move target.
     * @return the move target with the specified ID.
     * @throws ResourceNotFoundException if a move target with the specified ID does not exist.
     */
    @NotNull MoveTarget getMoveTargetById(int id);

    /**
     * Retrieves a move target with the specified name.
     *
     * @param name the name of the move target.
     * @return the move target with the specified name.
     * @throws ResourceNotFoundException if a move target with the specified name does not exist.
     */
    @NotNull MoveTarget getMoveTargetByName(@NotNull String name);

    /**
     * Retrieves the full move target resource.
     *
     * @param moveTarget the move target resource.
     * @return the full move target resource.
     * @throws PokeApiException if the provided API resource is not a move target.
     */
    @NotNull MoveTarget getMoveTarget(@NotNull ApiResource moveTarget);
    //endregion

    //region Abilities

    /**
     * Retrieves all abilities.
     *
     * @return a list of all abilities.
     */
    default @NotNull NamedApiResourceList getAbilities() {
        return getAbilities(0, 0);
    }

    /**
     * Retrieves a list of abilities.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of abilities.
     */
    @NotNull NamedApiResourceList getAbilities(int offset, int limit);

    /**
     * Retrieves the ability with the specified ID.
     *
     * @param id the ID of the ability.
     * @return the ability with the specified ID.
     * @throws ResourceNotFoundException if an ability with the specified ID does not exist.
     */
    @NotNull Ability getAbilityById(int id);

    /**
     * Retrieves the ability with the specified name.
     *
     * @param name the name of the ability.
     * @return the ability with the specified name.
     * @throws ResourceNotFoundException if an ability with the specified name does not exist.
     */
    @NotNull Ability getAbilityByName(@NotNull String name);

    /**
     * Retrieves the full ability resource.
     *
     * @param ability the ability resource.
     * @return the full ability resource.
     * @throws PokeApiException if the provided API resource is not an ability.
     */
    @NotNull Ability getAbility(@NotNull ApiResource ability);
    //endregion

    //region Characteristics

    /**
     * Retrieves all characteristics.
     *
     * @return a list of all characteristics.
     */
    default @NotNull ApiResourceList getCharacteristics() {
        return getCharacteristics(0, 0);
    }

    /**
     * Retrieves a list of characteristics.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of characteristics.
     */
    @NotNull ApiResourceList getCharacteristics(int offset, int limit);

    /**
     * Retrieves the characteristic with the specified ID.
     *
     * @param id the ID of the characteristic.
     * @return the characteristic with the specified ID.
     * @throws ResourceNotFoundException if a characteristic with the specified ID does not exist.
     */
    @NotNull Characteristic getCharacteristicById(int id);

    /**
     * Retrieves the full characteristic resource.
     *
     * @param characteristic the characteristic resource.
     * @return the full characteristic resource.
     * @throws PokeApiException if the provided API resource is not a characteristic.
     */
    @NotNull Characteristic getCharacteristic(@NotNull ApiResource characteristic);
    //endregion

    //region Egg groups

    /**
     * Retrieves all egg groups.
     *
     * @return a list of all egg groups.
     */
    default @NotNull NamedApiResourceList getEggGroups() {
        return getEggGroups(0, 0);
    }

    /**
     * Retrieves a list of egg groups.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of egg groups.
     */
    @NotNull NamedApiResourceList getEggGroups(int offset, int limit);

    /**
     * Retrieves the egg group with the specified ID.
     *
     * @param id the ID of the egg group.
     * @return the egg group with the specified ID.
     * @throws ResourceNotFoundException if an egg group with the specified ID does not exist.
     */
    @NotNull EggGroup getEggGroupById(int id);

    /**
     * Retrieves the egg group with the specified name.
     *
     * @param name the name of the egg group.
     * @return the egg group with the specified name.
     * @throws ResourceNotFoundException if an egg group with the specified name does not exist.
     */
    @NotNull EggGroup getEggGroupByName(@NotNull String name);

    /**
     * Retrieves the full egg group resource.
     *
     * @param eggGroup the egg group resource.
     * @return the full egg group resource.
     * @throws PokeApiException if the provided API resource is not an egg group.
     */
    @NotNull EggGroup getEggGroup(@NotNull ApiResource eggGroup);
    //endregion

    //region Gender

    /**
     * Retrieves all genders.
     *
     * @return a list of all genders.
     */
    default @NotNull NamedApiResourceList getGenders() {
        return getGenders(0, 0);
    }

    /**
     * Retrieves a list of genders.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of genders.
     */
    @NotNull NamedApiResourceList getGenders(int offset, int limit);

    /**
     * Retrieves the gender with the specified ID.
     *
     * @param id the ID of the gender.
     * @return the gender with the specified ID.
     * @throws ResourceNotFoundException if a gender with the specified ID does not exist.
     */
    @NotNull Gender getGenderById(int id);

    /**
     * Retrieves the gender with the specified name.
     *
     * @param name the name of the gender.
     * @return the gender with the specified name.
     * @throws ResourceNotFoundException if a gender with the specified name does not exist.
     */
    @NotNull Gender getGenderByName(@NotNull String name);

    /**
     * Retrieves the full gender resource.
     *
     * @param gender the gender resource.
     * @return the full gender resource.
     * @throws PokeApiException if the provided API resource is not a gender.
     */
    @NotNull Gender getGender(@NotNull ApiResource gender);
    //endregion

    //region Growth Rates

    /**
     * Retrieves all growth rates.
     *
     * @return a list of all growth rates.
     */
    default @NotNull NamedApiResourceList getGrowthRates() {
        return getGrowthRates(0, 0);
    }

    /**
     * Retrieves a list of growth rates.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of growth rates.
     */
    @NotNull NamedApiResourceList getGrowthRates(int offset, int limit);

    /**
     * Retrieves the growth rate with the specified ID.
     *
     * @param id the ID of the growth rate.
     * @return the growth rate with the specified ID.
     * @throws ResourceNotFoundException if a growth rate with the specified ID does not exist.
     */
    @NotNull GrowthRate getGrowthRateById(int id);

    /**
     * Retrieves the growth rate with the specified name.
     *
     * @param name the name of the growth rate.
     * @return the growth rate with the specified name.
     * @throws ResourceNotFoundException if a growth rate with the specified name does not exist.
     */
    @NotNull GrowthRate getGrowthRateByName(@NotNull String name);

    /**
     * Retrieves the full growth rate resource.
     *
     * @param growthRate the growth rate resource.
     * @return the full growth rate resource.
     * @throws PokeApiException if the provided API resource is not a growth rate.
     */
    @NotNull GrowthRate getGrowthRate(@NotNull ApiResource growthRate);
    //endregion

    //region Natures

    /**
     * Retrieves all natures.
     *
     * @return a list of all natures.
     */
    default @NotNull NamedApiResourceList getNatures() {
        return getNatures(0, 0);
    }

    /**
     * Retrieves a list of natures.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of natures.
     */
    @NotNull NamedApiResourceList getNatures(int offset, int limit);

    /**
     * Retrieves the nature with the specified ID.
     *
     * @param id the ID of the nature.
     * @return the nature with the specified ID.
     * @throws ResourceNotFoundException if a nature with the specified ID does not exist.
     */
    @NotNull Nature getNatureById(int id);

    /**
     * Retrieves the nature with the specified name.
     *
     * @param name the name of the nature.
     * @return the nature with the specified name.
     * @throws ResourceNotFoundException if a nature with the specified name does not exist.
     */
    @NotNull Nature getNatureByName(@NotNull String name);

    /**
     * Retrieves the full nature resource.
     *
     * @param nature the nature resource.
     * @return the full nature resource.
     * @throws PokeApiException if the provided API resource is not a nature.
     */
    @NotNull Nature getNature(@NotNull ApiResource nature);
    //endregion

    //region Pokéathlon stats
    /**
     * Retrieves all Pokéathlon stats.
     *
     * @return a list of all Pokéathlon stats.
     */
    default @NotNull NamedApiResourceList getPokeathlonStats() {
        return getPokeathlonStats(0, 0);
    }

    /**
     * Retrieves a list of Pokéathlon stats.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of Pokéathlon stats.
     */
    @NotNull NamedApiResourceList getPokeathlonStats(int offset, int limit);

    /**
     * Retrieves the Pokéathlon stat with the specified ID.
     *
     * @param id the ID of the Pokeathlon stat.
     * @return the Pokéathlon stat with the specified ID.
     * @throws ResourceNotFoundException if a Pokéathlon stat with the specified ID does not exist.
     */
    @NotNull PokeathlonStat getPokeathlonStatById(int id);

    /**
     * Retrieves the Pokéathlon stat with the specified name.
     *
     * @param name the name of the Pokéathlon stat.
     * @return the Pokéathlon stat with the specified name.
     * @throws ResourceNotFoundException if a Pokéathlon stat with the specified name does not exist.
     */
    @NotNull PokeathlonStat getPokeathlonStatByName(@NotNull String name);

    /**
     * Retrieves the full Pokéathlon stat resource.
     *
     * @param pokeathlonStat the Pokéathlon stat resource.
     * @return the full Pokéathlon stat resource.
     * @throws PokeApiException if the provided API resource is not a Pokéathlon stat.
     */
    @NotNull PokeathlonStat getPokeathlonStat(@NotNull ApiResource pokeathlonStat);
    //endregion

    //region Pokémon

    /**
     * Retrieves all Pokémon.
     *
     * @return a list of all Pokémon.
     */
    default @NotNull NamedApiResourceList getPokemon() {
        return getPokemon(0, 0);
    }

    /**
     * Retrieves a list of Pokémon.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of Pokémon.
     */
    @NotNull NamedApiResourceList getPokemon(int offset, int limit);

    /**
     * Retrieves the Pokémon with the specified ID.
     *
     * @param id the ID of the Pokémon.
     * @return the Pokémon with the specified ID.
     * @throws ResourceNotFoundException if a Pokémon with the specified ID does not exist.
     */
    @NotNull Pokemon getPokemonById(int id);

    /**
     * Retrieves the Pokémon with the specified name.
     *
     * @param name the name of the Pokémon.
     * @return the Pokémon with the specified name.
     * @throws ResourceNotFoundException if a Pokémon with the specified name does not exist.
     */
    @NotNull Pokemon getPokemonByName(@NotNull String name);

    /**
     * Retrieves the full Pokémon resource.
     *
     * @param pokemon the Pokémon resource.
     * @return the full Pokémon resource.
     * @throws PokeApiException if the provided API resource is not a Pokémon.
     */
    @NotNull Pokemon getPokemon(@NotNull ApiResource pokemon);
    //endregion

    //region Pokémon Encounters

    /**
     * Retrieves all location areas where the Pokémon with the specified ID can be encountered.
     *
     * @param id the ID of the Pokémon.
     * @return a list of all location areas where the Pokémon with the specified ID can be encountered.
     * @throws ResourceNotFoundException if a location area with the specified ID does not exist.
     */
    @NotNull List<LocationAreaEncounter> getPokemonEncountersById(int id);

    /**
     * Retrieves all location areas where the Pokémon with the specified name can be encountered.
     *
     * @param name the name of the Pokémon.
     * @return a list of all location areas where the Pokémon with the specified name can be encountered.
     * @throws ResourceNotFoundException if a location area with the specified name does not exist.
     */
    @NotNull List<LocationAreaEncounter> getPokemonEncountersByName(@NotNull String name);
    //endregion

    //region Pokémon Colors

    /**
     * Retrieves all Pokémon colors.
     *
     * @return a list of all Pokémon colors.
     */
    default @NotNull NamedApiResourceList getPokemonColors() {
        return getPokemonColors(0, 0);
    }

    /**
     * Retrieves a list of Pokémon colors.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of Pokémon colors.
     */
    @NotNull NamedApiResourceList getPokemonColors(int offset, int limit);

    /**
     * Retrieves the Pokémon color with the specified ID.
     *
     * @param id the ID of the Pokémon color.
     * @return the Pokémon color with the specified ID.
     * @throws ResourceNotFoundException if a Pokémon color with the specified ID does not exist.
     */
    @NotNull PokemonColor getPokemonColorById(int id);

    /**
     * Retrieves the Pokémon color with the specified name.
     *
     * @param name the name of the Pokémon color.
     * @return the Pokémon color with the specified name.
     * @throws ResourceNotFoundException if a Pokémon color with the specified name does not exist.
     */
    @NotNull PokemonColor getPokemonColorByName(@NotNull String name);

    /**
     * Retrieves the full Pokémon color resource.
     *
     * @param pokemonColor the Pokémon color resource.
     * @return the full Pokémon color resource.
     * @throws PokeApiException if the provided API resource is not a Pokémon color.
     */
    @NotNull PokemonColor getPokemonColor(@NotNull ApiResource pokemonColor);
    //endregion

    //region Pokémon Forms

    /**
     * Retrieves all Pokémon forms.
     *
     * @return a list of all Pokémon forms.
     */
    default @NotNull NamedApiResourceList getPokemonForms() {
        return getPokemonForms(0, 0);
    }

    /**
     * Retrieves a list of Pokémon forms.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of Pokémon forms.
     */
    @NotNull NamedApiResourceList getPokemonForms(int offset, int limit);

    /**
     * Retrieves the Pokémon form with the specified ID.
     *
     * @param id the ID of the Pokémon form.
     * @return the Pokémon form with the specified ID.
     * @throws ResourceNotFoundException if a Pokémon form with the specified ID does not exist.
     */
    @NotNull PokemonForm getPokemonFormById(int id);

    /**
     * Retrieves the Pokémon form with the specified name.
     *
     * @param name the name of the Pokémon form.
     * @return the Pokémon form with the specified name.
     * @throws ResourceNotFoundException if a Pokémon form with the specified name does not exist.
     */
    @NotNull PokemonForm getPokemonFormByName(@NotNull String name);

    /**
     * Retrieves the full Pokémon form resource.
     *
     * @param pokemonForm the Pokémon form resource.
     * @return the full Pokémon form resource.
     * @throws PokeApiException if the provided API resource is not a Pokémon form.
     */
    @NotNull PokemonForm getPokemonForm(@NotNull ApiResource pokemonForm);
    //endregion

    //region Pokémon Habitats

    /**
     * Retrieves all Pokémon habitats.
     *
     * @return a list of all Pokémon habitats.
     */
    default @NotNull NamedApiResourceList getPokemonHabitats() {
        return getPokemonHabitats(0, 0);
    }

    /**
     * Retrieves a list of Pokémon habitats.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of Pokémon habitats.
     */
    @NotNull NamedApiResourceList getPokemonHabitats(int offset, int limit);

    /**
     * Retrieves the Pokémon habitat with the specified ID.
     *
     * @param id the ID of the Pokémon habitat.
     * @return the Pokémon habitat with the specified ID.
     * @throws ResourceNotFoundException if a Pokémon habitat with the specified ID does not exist.
     */
    @NotNull PokemonHabitat getPokemonHabitatById(int id);

    /**
     * Retrieves the Pokémon habitat with the specified name.
     *
     * @param name the name of the Pokémon habitat.
     * @return the Pokémon habitat with the specified name.
     * @throws ResourceNotFoundException if a Pokémon habitat with the specified name does not exist.
     */
    @NotNull PokemonHabitat getPokemonHabitatByName(@NotNull String name);

    /**
     * Retrieves the full Pokémon habitat resource.
     *
     * @param pokemonHabitat the Pokémon habitat resource.
     * @return the full Pokémon habitat resource.
     * @throws PokeApiException if the provided API resource is not a Pokémon habitat.
     */
    @NotNull PokemonHabitat getPokemonHabitat(@NotNull ApiResource pokemonHabitat);
    //endregion

    //region Pokémon Shapes

    /**
     * Retrieves all Pokémon shapes.
     *
     * @return a list of all Pokémon shapes.
     */
    default @NotNull NamedApiResourceList getPokemonShapes() {
        return getPokemonShapes(0, 0);
    }

    /**
     * Retrieves a list of Pokémon shapes.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of Pokémon shapes.
     */
    @NotNull NamedApiResourceList getPokemonShapes(int offset, int limit);

    /**
     * Retrieves the Pokémon shape with the specified ID.
     *
     * @param id the ID of the Pokémon shape.
     * @return a Pokémon shape with the specified ID.
     * @throws ResourceNotFoundException if a Pokémon shape with the specified ID does not exist.
     */
    @NotNull PokemonShape getPokemonShapeById(int id);

    /**
     * Retrieves the Pokémon shape with the specified name.
     *
     * @param name the name of the Pokémon shape.
     * @return the Pokémon shape with the specified name.
     * @throws ResourceNotFoundException if a Pokémon shape with the specified name does not exist.
     */
    @NotNull PokemonShape getPokemonShapeByName(@NotNull String name);

    /**
     * Retrieves the full Pokémon shape resource.
     *
     * @param pokemonShape the Pokémon shape resource.
     * @return the full Pokémon shape resource.
     * @throws PokeApiException if the provided API resource is not a Pokémon shape.
     */
    @NotNull PokemonShape getPokemonShape(@NotNull ApiResource pokemonShape);
    //endregion

    //region Pokémon Species

    /**
     * Retrieves all Pokémon species.
     *
     * @return a list of all Pokémon species.
     */
    default @NotNull NamedApiResourceList getPokemonSpecies() {
        return getPokemonSpecies(0, 0);
    }

    /**
     * Retrieves a list of Pokémon species.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of Pokémon species.
     */
    @NotNull NamedApiResourceList getPokemonSpecies(int offset, int limit);

    /**
     * Retrieves the Pokémon species with the specified ID.
     *
     * @param id the ID of the Pokémon species.
     * @return the Pokémon species with the specified ID.
     * @throws ResourceNotFoundException if a Pokémon species with the specified ID does not exist.
     */
    @NotNull PokemonSpecies getPokemonSpeciesById(int id);

    /**
     * Retrieves the Pokémon species with the specified name.
     *
     * @param name the name of the Pokémon species.
     * @return the Pokémon species with the specified name.
     * @throws ResourceNotFoundException if a Pokémon species with the specified name does not exist.
     */
    @NotNull PokemonSpecies getPokemonSpeciesByName(@NotNull String name);

    /**
     * Retrieves the full Pokémon species resource.
     *
     * @param pokemonSpecies the Pokémon species resource.
     * @return the full Pokémon species resource.
     * @throws PokeApiException if the provided API resource is not a Pokémon species.
     */
    @NotNull PokemonSpecies getPokemonSpecies(@NotNull ApiResource pokemonSpecies);
    //endregion

    //region Stats

    /**
     * Retrieves all stats.
     *
     * @return a list of all stats.
     */
    @NotNull
    default NamedApiResourceList getStats() {
        return getStats(0, 0);
    }

    /**
     * Retrieves a list of stats.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of stats.
     */
    @NotNull NamedApiResourceList getStats(int offset, int limit);

    /**
     * Retrieves the stat with the specified ID.
     *
     * @param id the ID of the stat.
     * @return the stat with the specified ID.
     * @throws ResourceNotFoundException if a stat with the specified ID does not exist.
     */
    @NotNull Stat getStatById(int id);

    /**
     * Retrieves the stat with the specified name.
     *
     * @param name the name of the stat.
     * @return the stat with the specified name.
     * @throws ResourceNotFoundException if a stat with the specified name does not exist.
     */
    @NotNull Stat getStatByName(@NotNull String name);

    /**
     * Retrieves the full stat resource.
     *
     * @param stat the stat resource.
     * @return the full stat resource.
     * @throws PokeApiException if the provided API resource is not a stat.
     */
    @NotNull Stat getStat(@NotNull ApiResource stat);
    //endregion

    //region Types

    /**
     * Retrieves all types.
     *
     * @return a list of all types.
     */
    default @NotNull NamedApiResourceList getTypes() {
        return getTypes(0, 0);
    }

    /**
     * Retrieves a list of types.
     *
     * @param offset the query offset.
     * @param limit  the query limit.
     * @return a list of types.
     */
    @NotNull NamedApiResourceList getTypes(int offset, int limit);

    /**
     * Retrieves the type with the specified ID.
     *
     * @param id the ID of the type.
     * @return the type with the specified ID.
     * @throws ResourceNotFoundException if a type with the specified ID does not exist.
     */
    @NotNull Type getTypeById(int id);

    /**
     * Retrieves the type with the specified name.
     *
     * @param name the name of the type.
     * @return the type with the specified name.
     * @throws ResourceNotFoundException if a type with the specified name does not exist.
     */
    @NotNull Type getTypeByName(@NotNull String name);

    /**
     * Retrieves the full type resource.
     *
     * @param type the type resource.
     * @return the full type resource.
     * @throws PokeApiException if the provided API resource is not a type.
     */
    @NotNull Type getType(@NotNull ApiResource type);
    //endregion
}
