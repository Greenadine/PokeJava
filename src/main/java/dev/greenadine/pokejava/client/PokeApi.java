package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.pokemon.*;
import dev.greenadine.pokejava.model.pokemon.ability.Ability;
import dev.greenadine.pokejava.model.pokemon.nature.Nature;
import dev.greenadine.pokejava.model.pokemon.pokeathlon.PokeathlonStat;
import dev.greenadine.pokejava.model.pokemon.stat.Stat;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import dev.greenadine.pokejava.model.resource.ApiResourceList;
import dev.greenadine.pokejava.model.resource.NamedApiResource;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;
import org.jetbrains.annotations.NotNull;

/**
 * Represents the PokeAPI.
 *
 * @since 0.1.0
 * @see PokeApiClient
 * @see PokeApiService
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
    NamedApiResourceList getStatList(int offset, int limit);

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
    NamedApiResourceList getGenderList(int offset, int limit);

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
    NamedApiResourceList getGrowthRateList(int offset, int limit);

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
    NamedApiResourceList getTypeList(int offset, int limit);

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
    NamedApiResourceList getAbilityList(int offset, int limit);

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
    ApiResourceList getCharacteristicList(int offset, int limit);

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
    NamedApiResourceList getEggGroupList(int offset, int limit);

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
    NamedApiResourceList getNatureList(int offset, int limit);

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
    NamedApiResourceList getPokeathlonStatList(int offset, int limit);

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
    NamedApiResourceList getPokemonColorList(int offset, int limit);

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

    //endregion
}
