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
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

// Retrofit interface for the PokéAPI.
interface PokeApiService {

    //region Languages
    @GET("language/")
    Call<NamedApiResourceList> getLanguages(@Query("offset") int offset, @Query("limit") int limit);

    @GET("language/{id}/")
    Call<Language> getLanguageById(@Path("id") int id);

    @GET("language/{name}/")
    Call<Language> getLanguageByName(@Path("name") String name);
    //endregion

    //region Berries
    @GET("berry/")
    Call<NamedApiResourceList> getBerries(@Query("offset") int offset, @Query("limit") int limit);

    @GET("berry/{id}/")
    Call<Berry> getBerryById(@Path("id") int id);

    @GET("berry/{name}/")
    Call<Berry> getBerryByName(@Path("name") String name);
    //endregion

    //region Berry Firmness
    @GET("berry-firmness/")
    Call<NamedApiResourceList> getBerryFirmnesses(@Query("offset") int offset, @Query("limit") int limit);

    @GET("berry-firmness/{id}/")
    Call<BerryFirmness> getBerryFirmnessById(@Path("id") int id);

    @GET("berry-firmness/{name}/")
    Call<BerryFirmness> getBerryFirmnessByName(@Path("name") String name);
    //endregion

    //region Berry Flavors
    @GET("berry-flavor/")
    Call<NamedApiResourceList> getBerryFlavors(@Query("offset") int offset, @Query("limit") int limit);

    @GET("berry-flavor/{id}/")
    Call<BerryFlavor> getBerryFlavorById(@Path("id") int id);

    @GET("berry-flavor/{name}/")
    Call<BerryFlavor> getBerryFlavorByName(@Path("name") String name);
    //endregion

    //region Contest Types
    @GET("contest-type/")
    Call<NamedApiResourceList> getContestTypes(@Query("offset") int offset, @Query("limit") int limit);

    @GET("contest-type/{id}/")
    Call<ContestType> getContestTypeById(@Path("id") int id);

    @GET("contest-type/{name}/")
    Call<ContestType> getContestTypeByName(@Path("name") String name);
    //endregion

    //region Contest Effects
    @GET("contest-effect/")
    Call<ApiResourceList> getContestEffects(@Query("offset") int offset, @Query("limit") int limit);

    @GET("contest-effect/{id}/")
    Call<ContestEffect> getContestEffectById(@Path("id") int id);
    //endregion

    //region Super Contest Effects
    @GET("super-contest-effect/")
    Call<ApiResourceList> getSuperContestEffects(@Query("offset") int offset, @Query("limit") int limit);

    @GET("super-contest-effect/{id}/")
    Call<SuperContestEffect> getSuperContestEffectById(@Path("id") int id);
    //endregion

    //region Encounter Methods
    @GET("encounter-method/")
    Call<NamedApiResourceList> getEncounterMethods(@Query("offset") int offset, @Query("limit") int limit);

    @GET("encounter-method/{id}/")
    Call<EncounterMethod> getEncounterMethodById(@Path("id") int id);

    @GET("encounter-method/{name}/")
    Call<EncounterMethod> getEncounterMethodByName(@Path("name") String name);
    //endregion

    //region Encounter Conditions
    @GET("encounter-condition/")
    Call<NamedApiResourceList> getEncounterConditions(@Query("offset") int offset, @Query("limit") int limit);

    @GET("encounter-condition/{id}/")
    Call<EncounterCondition> getEncounterConditionById(@Path("id") int id);

    @GET("encounter-condition/{name}/")
    Call<EncounterCondition> getEncounterConditionByName(@Path("name") String name);
    //endregion

    //region Encounter Condition Values
    @GET("encounter-condition-value/")
    Call<NamedApiResourceList> getEncounterConditionValues(@Query("offset") int offset, @Query("limit") int limit);

    @GET("encounter-condition-value/{id}/")
    Call<EncounterConditionValue> getEncounterConditionValueById(@Path("id") int id);

    @GET("encounter-condition-value/{name}/")
    Call<EncounterConditionValue> getEncounterConditionValueByName(@Path("name") String name);
    //endregion

    //region Evolution Chains
    @GET("evolution-chain/")
    Call<ApiResourceList> getEvolutionChains(@Query("offset") int offset, @Query("limit") int limit);

    @GET("evolution-chain/{id}/")
    Call<EvolutionChain> getEvolutionChainById(@Path("id") int id);
    //endregion

    //region Evolution Triggers
    @GET("evolution-trigger/")
    Call<NamedApiResourceList> getEvolutionTriggers(@Query("offset") int offset, @Query("limit") int limit);

    @GET("evolution-trigger/{id}/")
    Call<EvolutionTrigger> getEvolutionTriggerById(@Path("id") int id);

    @GET("evolution-trigger/{name}/")
    Call<EvolutionTrigger> getEvolutionTriggerByName(@Path("name") String name);
    //endregion

    //region Generations
    @GET("generation/")
    Call<NamedApiResourceList> getGenerations(@Query("offset") int offset, @Query("limit") int limit);

    @GET("generation/{id}/")
    Call<Generation> getGenerationById(@Path("id") int id);

    @GET("generation/{name}/")
    Call<Generation> getGenerationByName(@Path("name") String name);
    //endregion

    //region Pokédexes
    @GET("pokedex/")
    Call<NamedApiResourceList> getPokedexes(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokedex/{id}/")
    Call<Pokedex> getPokedexById(@Path("id") int id);

    @GET("pokedex/{name}/")
    Call<Pokedex> getPokedexByName(@Path("name") String name);
    //endregion

    //region Versions
    @GET("version/")
    Call<NamedApiResourceList> getVersions(@Query("offset") int offset, @Query("limit") int limit);

    @GET("version/{id}/")
    Call<Version> getVersionById(@Path("id") int id);

    @GET("version/{name}/")
    Call<Version> getVersionByName(@Path("name") String name);
    //endregion

    //region Version Groups
    @GET("version-group/")
    Call<NamedApiResourceList> getVersionGroups(@Query("offset") int offset, @Query("limit") int limit);

    @GET("version-group/{id}/")
    Call<VersionGroup> getVersionGroupById(@Path("id") int id);

    @GET("version-group/{name}/")
    Call<VersionGroup> getVersionGroupByName(@Path("name") String name);
    //endregion

    //region Items
    @GET("item/")
    Call<NamedApiResourceList> getItems(@Query("offset") int offset, @Query("limit") int limit);

    @GET("item/{id}/")
    Call<Item> getItemById(@Path("id") int id);

    @GET("item/{name}/")
    Call<Item> getItemByName(@Path("name") String name);
    //endregion

    //region Item Attributes
    @GET("item-attribute/")
    Call<NamedApiResourceList> getItemAttributes(@Query("offset") int offset, @Query("limit") int limit);

    @GET("item-attribute/{id}/")
    Call<ItemAttribute> getItemAttributeById(@Path("id") int id);

    @GET("item-attribute/{name}/")
    Call<ItemAttribute> getItemAttributeByName(@Path("name") String name);
    //endregion

    //region Item Categories
    @GET("item-category/")
    Call<NamedApiResourceList> getItemCategories(@Query("offset") int offset, @Query("limit") int limit);

    @GET("item-category/{id}/")
    Call<ItemCategory> getItemCategoryById(@Path("id") int id);

    @GET("item-category/{name}/")
    Call<ItemCategory> getItemCategoryByName(@Path("name") String name);
    //endregion

    //region Item Fling Effects
    @GET("item-fling-effect/")
    Call<NamedApiResourceList> getItemFlingEffects(@Query("offset") int offset, @Query("limit") int limit);

    @GET("item-fling-effect/{id}/")
    Call<ItemFlingEffect> getItemFlingEffectById(@Path("id") int id);

    @GET("item-fling-effect/{name}/")
    Call<ItemFlingEffect> getItemFlingEffectByName(@Path("name") String name);
    //endregion

    //region Item Pockets
    @GET("item-pocket/")
    Call<NamedApiResourceList> getItemPockets(@Query("offset") int offset, @Query("limit") int limit);

    @GET("item-pocket/{id}/")
    Call<ItemPocket> getItemPocketById(@Path("id") int id);

    @GET("item-pocket/{name}/")
    Call<ItemPocket> getItemPocketByName(@Path("name") String name);
    //endregion

    //region Locations
    @GET("location/")
    Call<NamedApiResourceList> getLocations(@Query("offset") int offset, @Query("limit") int limit);

    @GET("location/{id}/")
    Call<Location> getLocationById(@Path("id") int id);

    @GET("location/{name}/")
    Call<Location> getLocationByName(@Path("name") String name);
    //endregion

    //region Location Areas
    @GET("location-area/")
    Call<NamedApiResourceList> getLocationAreas(@Query("offset") int offset, @Query("limit") int limit);

    @GET("location-area/{id}/")
    Call<LocationArea> getLocationAreaById(@Path("id") int id);

    @GET("location-area/{name}/")
    Call<LocationArea> getLocationAreaByName(@Path("name") String name);
    //endregion

    //region Pal Park Areas
    @GET("pal-park-area/")
    Call<NamedApiResourceList> getPalParkAreas(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pal-park-area/{id}/")
    Call<PalParkArea> getPalParkAreaById(@Path("id") int id);

    @GET("pal-park-area/{name}/")
    Call<PalParkArea> getPalParkAreaByName(@Path("name") String name);
    //endregion

    //region Regions
    @GET("region/")
    Call<NamedApiResourceList> getRegions(@Query("offset") int offset, @Query("limit") int limit);

    @GET("region/{id}/")
    Call<Region> getRegionById(@Path("id") int id);

    @GET("region/{name}/")
    Call<Region> getRegionByName(@Path("name") String name);
    //endregion

    //region Machines
    @GET("machine/")
    Call<ApiResourceList> getMachines(@Query("offset") int offset, @Query("limit") int limit);

    @GET("machine/{id}/")
    Call<Machine> getMachineById(@Path("id") int id);
    //endregion

    //region Moves
    @GET("move/")
    Call<NamedApiResourceList> getMoves(@Query("offset") int offset, @Query("limit") int limit);

    @GET("move/{id}/")
    Call<Move> getMoveById(@Path("id") int id);

    @GET("move/{name}/")
    Call<Move> getMoveByName(@Path("name") String name);
    //endregion

    //region Move Ailments
    @GET("move-ailment/")
    Call<NamedApiResourceList> getMoveAilments(@Query("offset") int offset, @Query("limit") int limit);

    @GET("move-ailment/{id}/")
    Call<MoveAilment> getMoveAilmentById(@Path("id") int id);

    @GET("move-ailment/{name}/")
    Call<MoveAilment> getMoveAilmentByName(@Path("name") String name);
    //endregion

    //region Move Battle Styles
    @GET("move-battle-style/")
    Call<NamedApiResourceList> getMoveBattleStyles(@Query("offset") int offset, @Query("limit") int limit);

    @GET("move-battle-style/{id}/")
    Call<MoveBattleStyle> getMoveBattleStyleById(@Path("id") int id);

    @GET("move-battle-style/{name}/")
    Call<MoveBattleStyle> getMoveBattleStyleByName(@Path("name") String name);
    //endregion

    //region Move Categories
    @GET("move-category/")
    Call<NamedApiResourceList> getMoveCategories(@Query("offset") int offset, @Query("limit") int limit);

    @GET("move-category/{id}/")
    Call<MoveCategory> getMoveCategoryById(@Path("id") int id);

    @GET("move-category/{name}/")
    Call<MoveCategory> getMoveCategoryByName(@Path("name") String name);
    //endregion

    //region Move Damage Classes
    @GET("move-damage-class/")
    Call<NamedApiResourceList> getMoveDamageClasses(@Query("offset") int offset, @Query("limit") int limit);

    @GET("move-damage-class/{id}/")
    Call<MoveDamageClass> getMoveDamageClassById(@Path("id") int id);

    @GET("move-damage-class/{name}/")
    Call<MoveDamageClass> getMoveDamageClassByName(@Path("name") String name);
    //endregion

    //region Move Learn Methods
    @GET("move-learn-method/")
    Call<NamedApiResourceList> getMoveLearnMethods(@Query("offset") int offset, @Query("limit") int limit);

    @GET("move-learn-method/{id}/")
    Call<MoveLearnMethod> getMoveLearnMethodById(@Path("id") int id);

    @GET("move-learn-method/{name}/")
    Call<MoveLearnMethod> getMoveLearnMethodByName(@Path("name") String name);
    //endregion

    //region Move Targets
    @GET("move-target/")
    Call<NamedApiResourceList> getMoveTargets(@Query("offset") int offset, @Query("limit") int limit);

    @GET("move-target/{id}/")
    Call<MoveTarget> getMoveTargetById(@Path("id") int id);

    @GET("move-target/{name}/")
    Call<MoveTarget> getMoveTargetByName(@Path("name") String name);
    //endregion

    //region Abilities
    @GET("ability/")
    Call<NamedApiResourceList> getAbilities(@Query("offset") int offset, @Query("limit") int limit);

    @GET("ability/{id}/")
    Call<Ability> getAbilityById(@Path("id") int id);

    @GET("ability/{name}/")
    Call<Ability> getAbilityByName(@Path("name") String name);
    //endregion

    //region Characteristics
    @GET("characteristic/")
    Call<ApiResourceList> getCharacteristics(@Query("offset") int offset, @Query("limit") int limit);

    @GET("characteristic/")
    Call<Characteristic> getCharacteristic(@Query("offset") int offset, @Query("limit") int limit);

    @GET("characteristic/{id}/")
    Call<Characteristic> getCharacteristic(@Path("id") int id);
    //endregion

    //region Egg Groups
    @GET("egg-group/")
    Call<NamedApiResourceList> getEggGroups(@Query("offset") int offset, @Query("limit") int limit);

    @GET("egg-group/{id}/")
    Call<EggGroup> getEggGroupById(@Path("id") int id);

    @GET("egg-group/{name}/")
    Call<EggGroup> getEggGroupByName(@Path("name") String name);
    //endregion

    //region Genders
    @GET("gender/")
    Call<NamedApiResourceList> getGenders(@Query("offset") int offset, @Query("limit") int limit);

    @GET("gender/{id}/")
    Call<Gender> getGenderById(@Path("id") int id);

    @GET("gender/{name}/")
    Call<Gender> getGenderByName(@Path("name") String name);
    //endregion

    //region Growth Rates
    @GET("growth-rate/")
    Call<NamedApiResourceList> getGrowthRates(@Query("offset") int offset, @Query("limit") int limit);

    @GET("growth-rate/{id}/")
    Call<GrowthRate> getGrowthRateById(@Path("id") int id);

    @GET("growth-rate/{name}/")
    Call<GrowthRate> getGrowthRateByName(@Path("name") String name);
    //endregion

    //region Natures
    @GET("nature/")
    Call<NamedApiResourceList> getNatures(@Query("offset") int offset, @Query("limit") int limit);

    @GET("nature/{id}/")
    Call<Nature> getNatureById(@Path("id") int id);

    @GET("nature/{name}/")
    Call<Nature> getNatureByName(@Path("name") String name);
    //endregion

    //region Pokeathlon Stats
    @GET("pokeathlon-stat/")
    Call<NamedApiResourceList> getPokeathlonStats(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokeathlon-stat/{id}/")
    Call<PokeathlonStat> getPokeathlonStatById(@Path("id") int id);

    @GET("pokeathlon-stat/{name}/")
    Call<PokeathlonStat> getPokeathlonStatByName(@Path("name") String name);
    //endregion

    //region Pokémon
    @GET("pokemon/")
    Call<NamedApiResourceList> getPokemon(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokemon/{id}/")
    Call<Pokemon> getPokemonById(@Path("id") int id);

    @GET("pokemon/{name}/")
    Call<Pokemon> getPokemonByName(@Path("name") String name);
    //endregion

    //region Pokémon Location Area Encounters
    @GET("pokemon/{id}/encounters")
    Call<List<LocationAreaEncounter>> getPokemonEncountersById(@Path("id") int id);

    @GET("pokemon/{name}/encounters")
    Call<List<LocationAreaEncounter>> getPokemonEncountersByName(@Path("name") String name);
    //endregion

    //region Pokémon

    //region Pokémon Colors
    @GET("pokemon-color/")
    Call<NamedApiResourceList> getPokemonColors(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokemon-color/{id}/")
    Call<PokemonColor> getPokemonColorById(@Path("id") int id);

    @GET("pokemon-color/{name}/")
    Call<PokemonColor> getPokemonColorByName(@Path("name") String name);
    //endregion

    //region Pokémon Forms
    @GET("pokemon-form/")
    Call<NamedApiResourceList> getPokemonForms(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokemon-form/{id}/")
    Call<PokemonForm> getPokemonFormById(@Path("id") int id);

    @GET("pokemon-form/{name}/")
    Call<PokemonForm> getPokemonFormByName(@Path("name") String name);
    //endregion

    //region Pokémon Habitats
    @GET("pokemon-habitat/")
    Call<NamedApiResourceList> getPokemonHabitats(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokemon-habitat/{id}/")
    Call<PokemonHabitat> getPokemonHabitatById(@Path("id") int id);

    @GET("pokemon-habitat/{name}/")
    Call<PokemonHabitat> getPokemonHabitatByName(@Path("name") String name);
    //endregion

    //region Pokémon Shapes
    @GET("pokemon-shape/")
    Call<NamedApiResourceList> getPokemonShapes(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokemon-shape/{id}/")
    Call<PokemonShape> getPokemonShapeById(@Path("id") int id);

    @GET("pokemon-shape/{name}/")
    Call<PokemonShape> getPokemonShapeByName(@Path("name") String name);
    //endregion

    //region Pokémon Species
    @GET("pokemon-species/")
    Call<NamedApiResourceList> getPokemonSpecies(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokemon-species/{id}/")
    Call<PokemonSpecies> getPokemonSpeciesById(@Path("id") int id);

    @GET("pokemon-species/{name}/")
    Call<PokemonSpecies> getPokemonSpeciesByName(@Path("name") String name);
    //endregion

    //region Stats
    @GET("stat/")
    Call<NamedApiResourceList> getStats(@Query("offset") int offset, @Query("limit") int limit);

    @GET("stat/{id}/")
    Call<Stat> getStatById(@Path("id") int id);

    @GET("stat/{name}/")
    Call<Stat> getStatByName(@Path("name") String name);
    //endregion

    //region Types
    @GET("type/")
    Call<NamedApiResourceList> getTypes(@Query("offset") int offset, @Query("limit") int limit);

    @GET("type/{id}/")
    Call<Type> getTypeById(@Path("id") int id);

    @GET("type/{name}/")
    Call<Type> getTypeByName(@Path("name") String name);
    //endregion
}
