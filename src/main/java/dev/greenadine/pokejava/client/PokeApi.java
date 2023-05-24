package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.Type;

import java.util.List;

public interface PokeApi {

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
     * @param offset the starting ID.
     * @param limit the maximum amount of types to retrieve.
     *
     * @return a list of types.
     */
    List<Type> getTypeList(int offset, int limit);
    //endregion
}
