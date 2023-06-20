package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.common.resource.ApiResourceList;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.move.MoveTarget;
import dev.greenadine.pokejava.model.pokemon.*;
import dev.greenadine.pokejava.model.pokemon.ability.Ability;
import dev.greenadine.pokejava.model.pokemon.evolution.EvolutionChain;
import dev.greenadine.pokejava.model.pokemon.evolution.EvolutionTrigger;
import dev.greenadine.pokejava.model.pokemon.form.PokemonForm;
import dev.greenadine.pokejava.model.pokemon.gender.Gender;
import dev.greenadine.pokejava.model.pokemon.growthrate.GrowthRate;
import dev.greenadine.pokejava.model.pokemon.nature.Nature;
import dev.greenadine.pokejava.model.pokemon.pokeathlon.PokeathlonStat;
import dev.greenadine.pokejava.model.pokemon.shape.PokemonShape;
import dev.greenadine.pokejava.model.pokemon.species.PokemonSpecies;
import dev.greenadine.pokejava.model.pokemon.stat.Stat;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import org.jetbrains.annotations.NotNull;

/**
 * Represents the PokeAPI.
 *
 * @see PokeApiClient
 * @see PokeApiService
 *
 * @since 0.1.0
 * @author Greenadine
 */
public interface PokeApi {

    //region Resources

    //region Stats
    /**
     * Retrieves a list of stats from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of stats.
     */
    NamedApiResourceList getStats(int offset, int limit);

    /**
     * Retrieves the stat with the specified ID from the API.
     *
     * @param id the ID of the stat.
     *
     * @return the stat with the specified ID.
     */
    Stat getStatById(int id);

    /**
     * Retrieves the stat with the specified ID from the API.
     *
     * @param name the name of the stat.
     *
     * @return the stat with the specified name.
     */
    Stat getStatByName(@NotNull String name);
    //endregion

    //region Gender
    /**
     * Retrieves a list of genders from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of genders.
     */
    NamedApiResourceList getGenders(int offset, int limit);

    /**
     * Retrieves the gender with the specified ID from the API.
     *
     * @param id the ID of the gender.
     *
     * @return the gender with the specified ID.
     */
    Gender getGenderById(int id);

    /**
     * Retrieves the gender with the specified name from the API.
     *
     * @param name the name of the gender.
     *
     * @return the gender with the specified name.
     */
    Gender getGenderByName(@NotNull String name);
    //endregion

    //region Growth rates
    /**
     * Retrieves a list of growth rates from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of growth rates.
     */
    NamedApiResourceList getGrowthRates(int offset, int limit);

    /**
     * Retrieves the growth rate with the specified ID from the API.
     *
     * @param id the ID of the growth rate.
     *
     * @return the growth rate with the specified ID.
     */
    GrowthRate getGrowthRateById(int id);

    /**
     * Retrieves the growth rate with the specified name from the API.
     *
     * @param name the name of the growth rate.
     *
     * @return the growth rate with the specified name.
     */
    GrowthRate getGrowthRateByName(@NotNull String name);
    //endregion

    //region Types
    /**
     * Retrieves a list of types from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of types.
     */
    NamedApiResourceList getTypes(int offset, int limit);

    /**
     * Retrieves the type with the specified ID from the API.
     *
     * @param id the ID of the type.
     *
     * @return the type with the specified ID.
     */
    Type getTypeById(int id);

    /**
     * Retrieves the type with the specified name from the API.
     *
     * @param name the name of the type.
     *
     * @return the type with the specified name.
     */
    Type getTypeByName(@NotNull String name);
    //endregion

    //region Abilities

    /**
     * Retrieves a list of abilities from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of abilities.
     */
    NamedApiResourceList getAbilities(int offset, int limit);

    /**
     * Retrieves the ability with the specified ID from the API.
     *
     * @param id the ID of the ability.
     *
     * @return the ability with the specified ID.
     */
    Ability getAbilityById(int id);

    /**
     * Retrieves the ability with the specified name from the API.
     *
     * @param name the name of the ability.
     *
     * @return the ability with the specified name.
     */
    Ability getAbilityByName(@NotNull String name);
    //endregion

    //region Characteristics

    /**
     * Retrieves a list of characteristics from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of characteristics.
     */
    ApiResourceList getCharacteristics(int offset, int limit);

    /**
     * Retrieves the characteristic with the specified ID from the API.
     *
     * @param id the ID of the characteristic.
     *
     * @return the characteristic with the specified ID.
     */
    Characteristic getCharacteristic(int id);
    //endregion

    //region Egg groups

    /**
     * Retrieves a list of egg groups from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of egg groups.
     */
    NamedApiResourceList getEggGroups(int offset, int limit);

    /**
     * Retrieves the egg group with the specified ID from the API.
     *
     * @param id the ID of the egg group.
     *
     * @return the egg group with the specified ID.
     */
    EggGroup getEggGroupById(int id);

    /**
     * Retrieves the egg group with the specified name from the API.
     *
     * @param name the name of the egg group.
     *
     * @return the egg group with the specified name.
     */
    EggGroup getEggGroupByName(@NotNull String name);
    //endregion

    //region Natures

    /**
     * Retrieves a list of natures from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of natures.
     */
    NamedApiResourceList getNatures(int offset, int limit);

    /**
     * Retrieves the nature with the specified ID from the API.
     *
     * @param id the ID of the nature.
     *
     * @return the nature with the specified ID.
     */
    Nature getNatureById(int id);

    /**
     * Retrieves the nature with the specified name from the API.
     *
     * @param name the name of the nature.
     *
     * @return the nature with the specified name.
     */
    Nature getNatureByName(@NotNull String name);
    //endregion

    //region Pokeathlon stats

    /**
     * Retrieves a list of Pokeathlon stats from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of Pokeathlon stats.
     */
    NamedApiResourceList getPokeathlonStats(int offset, int limit);

    /**
     * Retrieves the Pokeathlon stat with the specified ID from the API.
     *
     * @param id the ID of the Pokeathlon stat.
     *
     * @return the Pokeathlon stat with the specified ID.
     */
    PokeathlonStat getPokeathlonStatById(int id);

    /**
     * Retrieves the Pokeathlon stat with the specified name from the API.
     *
     * @param name the name of the Pokeathlon stat.
     *
     * @return the Pokeathlon stat with the specified name.
     */
    PokeathlonStat getPokeathlonStatByName(@NotNull String name);
    //endregion

    //region Pokémon colors

    /**
     * Retrieves a list of Pokémon colors from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of Pokémon colors.
     */
    NamedApiResourceList getPokemonColors(int offset, int limit);

    /**
     * Retrieves the Pokémon color with the specified ID from the API.
     *
     * @param id the ID of the Pokémon color.
     *
     * @return the Pokémon color with the specified ID.
     */
    PokemonColor getPokemonColorById(int id);

    /**
     * Retrieves the Pokémon color with the specified name from the API.
     *
     * @param name the name of the Pokémon color.
     *
     * @return the Pokémon color with the specified name.
     */
    PokemonColor getPokemonColorByName(@NotNull String name);
    //endregion

    //region Pokémon habitats

    /**
     * Retrieves a list of Pokémon habitats from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of Pokémon habitats.
     */
    NamedApiResourceList getPokemonHabitats(int offset, int limit);

    /**
     * Retrieves the Pokémon habitat with the specified ID from the API.
     *
     * @param id the ID of the Pokémon habitat.
     *
     * @return the Pokémon habitat with the specified ID.
     */
    PokemonHabitat getPokemonHabitatById(int id);

    /**
     * Retrieves the Pokémon habitat with the specified name from the API.
     *
     * @param name the name of the Pokémon habitat.
     *
     * @return the Pokémon habitat with the specified name.
     */
    PokemonHabitat getPokemonHabitatByName(@NotNull String name);
    //endregion

    //region Pokémon shapes

    /**
     * Retrieves a list of Pokémon shapes from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of Pokémon shapes.
     */
    NamedApiResourceList getPokemonShapes(int offset, int limit);

    /**
     * Retrieves the Pokémon shape with the specified ID from the API.
     *
     * @param id the ID of the Pokémon shape.
     *
     * @return a Pokémon shape with the specified ID.
     */
    PokemonShape getPokemonShapeById(int id);

    /**
     * Retrieves the Pokémon shape with the specified name from the API.
     *
     * @param name the name of the Pokémon shape.
     *
     * @return the Pokémon shape with the specified name.
     */
    PokemonShape getPokemonShapeByName(@NotNull String name);
    //endregion

    //region Pokémon species

    /**
     * Retrieves a list of Pokémon species from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of Pokémon species.
     */
    NamedApiResourceList getPokemonSpecies(int offset, int limit);

    /**
     * Retrieves the Pokémon species with the specified ID from the API.
     *
     * @param id the ID of the Pokémon species.
     *
     * @return the Pokémon species with the specified ID.
     */
    PokemonSpecies getPokemonSpeciesById(int id);

    /**
     * Retrieves the Pokémon species with the specified name from the API.
     *
     * @param name the name of the Pokémon species.
     *
     * @return the Pokémon species with the specified name.
     */
    PokemonSpecies getPokemonSpeciesByName(@NotNull String name);
    //endregion

    //region Pokémon forms

    /**
     * Retrieves a list of Pokémon forms from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of Pokémon forms.
     */
    NamedApiResourceList getPokemonForms(int offset, int limit);

    /**
     * Retrieves the Pokémon form with the specified ID from the API.
     *
     * @param id the ID of the Pokémon form.
     *
     * @return the Pokémon form with the specified ID.
     */
    PokemonForm getPokemonFormById(int id);

    /**
     * Retrieves the Pokémon form with the specified name from the API.
     *
     * @param name the name of the Pokémon form.
     *
     * @return the Pokémon form with the specified name.
     */
    PokemonForm getPokemonFormByName(@NotNull String name);
    //endregion

    //region Pokémon

    /**
     * Retrieves a list of Pokémon from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of Pokémon.
     */
    NamedApiResourceList getPokemon(int offset, int limit);

    /**
     * Retrieves the Pokémon with the specified ID from the API.
     *
     * @param id the ID of the Pokémon.
     *
     * @return the Pokémon with the specified ID.
     */
    Pokemon getPokemonById(int id);

    /**
     * Retrieves the Pokémon with the specified name from the API.
     *
     * @param name the name of the Pokémon.
     *
     * @return the Pokémon with the specified name.
     */
    Pokemon getPokemonByName(@NotNull String name);
    //endregion

    //region Evolution chains

    /**
     * Retrieves a list of evolution chains from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of evolution chains.
     */
    ApiResourceList getEvolutionChains(int offset, int limit);

    /**
     * Retrieves an evolution chain with the specified ID from the API.
     *
     * @param id the ID of the evolution chain.
     *
     * @return the evolution chain with the specified ID.
     */
    EvolutionChain getEvolutionChainById(int id);
    //endregion

    //region Evolution triggers

    /**
     * Retrieves a list of evolution triggers from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of evolution triggers.
     */
    NamedApiResourceList getEvolutionTriggers(int offset, int limit);

    /**
     * Retrieves an evolution trigger with the specified ID from the API.
     *
     * @param id the ID of the evolution trigger.
     *
     * @return the evolution trigger with the specified ID.
     */
    EvolutionTrigger getEvolutionTriggerById(int id);

    /**
     * Retrieves an evolution trigger with the specified name from the API.
     *
     * @param name the name of the evolution trigger.
     *
     * @return the evolution trigger with the specified name.
     */
    EvolutionTrigger getEvolutionTriggerByName(@NotNull String name);
    //endregion

    //region Move targets

    /**
     * Retrieves a list of move targets from the API.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of move targets.
     */
    NamedApiResourceList getMoveTargets(int offset, int limit);

    /**
     * Retrieves a move target with the specified ID from the API.
     *
     * @param id the ID of the move target.
     *
     * @return the move target with the specified ID.
     */
    MoveTarget getMoveTargetById(int id);

    /**
     * Retrieves a move target with the specified name from the API.
     *
     * @param name the name of the move target.
     *
     * @return the move target with the specified name.
     */
    MoveTarget getMoveTargetByName(@NotNull String name);
    //endregion

    //endregion
}
