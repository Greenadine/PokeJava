package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.pokemon.Gender;
import dev.greenadine.pokejava.model.pokemon.GrowthRate;
import dev.greenadine.pokejava.model.pokemon.stat.Stat;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;

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
     * Retrieves a list of stats.
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
    Stat getStat(int id);
    //endregion

    //region Gender
    /**
     * Retrieves a list of genders.
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
    Gender getGender(int id);
    //endregion

    //region Growth rates
    /**
     * Retrieves a list of growth rates.
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
    GrowthRate getGrowthRate(int id);
    //endregion

    //region Types
    /**
     * Retrieves a list of types.
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
    Type getType(int id);
    //endregion

    //endregion
}
