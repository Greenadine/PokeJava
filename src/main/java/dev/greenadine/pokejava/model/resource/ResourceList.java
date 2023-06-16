package dev.greenadine.pokejava.model.resource;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Represents a list of resources from the API.
 *
 * @param <T> the type of {@link Resource}s in the list.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public interface ResourceList<T extends Resource> {

    /**
     * Gets the total number of resources available from the resource list.
     *
     * @return the total number of resources available from the resource list.
     */
    int getCount();

    /**
     * Gets the URL for the next page in the list.
     *
     * @return the URL for the next page in the list.
     */
    @Nullable
    String getNext();

    /**
     * Gets the URL for the previous page in the list.
     *
     * @return the URL for the previous page in the list.
     */
    @Nullable
    String getPrevious();

    /**
     * Gets the list of {@link ApiResource}s.
     *
     * @return the list of {@link ApiResource}s.
     */
    @NotNull
    List<T> getResults();
}
