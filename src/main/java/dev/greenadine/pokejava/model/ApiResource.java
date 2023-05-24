package dev.greenadine.pokejava.model;

import org.jetbrains.annotations.NotNull;

/**
 * Represents a resource from the API.
 * A resource is a model that has (at least) an ID and a category.
 *
 * @since 0.1.0
 * @see Resource
 * @author Greenadine
 */
public class ApiResource implements Resource {

    private final int id;
    private final String category;
    private final String url;

    public ApiResource(final int id, @NotNull final String category) {
        this.id = id;
        this.category = category;
        this.url = getUrl(id, category);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getCategory() {
        return category;
    }

    /**
     * Gets the partial URL for the resource.
     * The returned URL is relative to the base URL of the API.
     *
     * @return the API-relative URL for the resource.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Constructs the URL for the resource.
     * The constructed URL is relative to the base URL of the API.
     *
     * @param id the ID of the resource.
     * @param category the category of the resource.
     *
     * @return the API-relative URL for the resource.
     */
    private static String getUrl(final int id, @NotNull final String category) {
        return category + "/" + id + "/";
    }
}
