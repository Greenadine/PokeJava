package dev.greenadine.pokejava.model.resource;

import org.jetbrains.annotations.Nullable;

/**
 * Represents a resource from the API.
 * A resource is a model that has (at least) an ID and a category.
 *
 * @see ApiResource
 *
 * @since 0.1.0
 * @author Greenadine
 */
public interface Resource {

    /**
     * Gets the ID of the resource.
     *
     * @return the resource's ID.
     */
    int getId();

    /**
     * Gets the name of the resource.
     *
     * @return the resource's name.
     */
    @Nullable
    String getCategory();
}
