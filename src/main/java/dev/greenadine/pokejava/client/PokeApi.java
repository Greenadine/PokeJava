package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.pokemon.Gender;
import dev.greenadine.pokejava.model.pokemon.GrowthRate;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;

public interface PokeApi {

    //region Resources

    //region Gender
    /**
     * Retrieves the gender with the specified ID from the API.
     *
     * @param id the ID of the gender.
     *
     * @return the gender with the specified ID.
     */
    Gender getGender(int id);

    /**
     * Retrieves a list of genders.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of genders.
     */
    NamedApiResourceList getGenderList(int offset, int limit);
    //endregion

    //region Growth rates

    /**
     * Retrieves the growth rate with the specified ID from the API.
     *
     * @param id the ID of the growth rate.
     *
     * @return the growth rate with the specified ID.
     */
    GrowthRate getGrowthRate(int id);

    /**
     * Retrieves a list of growth rates.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of growth rates.
     */
    NamedApiResourceList getGrowthRateList(int offset, int limit);
    //endregion

    //region Types
    /**
     * Retrieves the type with the specified ID from the API.
     *
     * @param id the ID of the type.
     *
     * @return the type with the specified ID.
     */
    Type getType(int id);

    /**
     * Retrieves a list of types.
     *
     * @param offset the query offset.
     * @param limit the query limit.
     *
     * @return a list of types.
     */
    NamedApiResourceList getTypeList(int offset, int limit);
    //endregion

    //endregion
}
