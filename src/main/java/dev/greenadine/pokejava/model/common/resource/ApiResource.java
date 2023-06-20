package dev.greenadine.pokejava.model.common.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Preconditions;
import dev.greenadine.pokejava.annotation.Category;
import dev.greenadine.pokejava.util.AnnotationUtils;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a resource from the API.
 * A resource is a model that has (at least) an ID and a category.
 *
 * @see Resource
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class ApiResource implements Resource {

    private final int id;
    private final String category;
    private final String url;

    protected ApiResource(int id) {
        Preconditions.checkState(AnnotationUtils.hasAnnotation(this.getClass(), Category.class), "Resource is missing @Category annotation.");
        this.id = id;
        this.category = AnnotationUtils.getValue(this.getClass(), Category.class);
        this.url = "/" + category + "/" + id + "/";
    }

    @JsonCreator
    protected ApiResource(@JsonProperty("url") final String url) {
        this.id = getIdFromUrl(url);
        this.category = getCategoryFromUrl(url);
        this.url = url;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    @NotNull
    public String getCategory() {
        return category;
    }

    /**
     * Gets the RESTful API URL for the resource.
     *
     * @return the RESTful API URL for the resource.
     */
    @NotNull
    public String getUrl() {
        return url;
    }

    /**
     * Gets the ID of the resource from the URL.
     *
     * @param url the URL of the resource.
     *
     * @return the ID of the resource.
     */
    private static int getIdFromUrl(String url) {
        String[] urlParts = url.split("/");
        return Integer.parseInt(urlParts[urlParts.length - 1]);
    }

    /**
     * Gets the category of the resource from the URL.
     *
     * @param url the URL of the resource.
     *
     * @return the category of the resource.
     */
    private static String getCategoryFromUrl(String url) {
        String[] urlParts = url.split("/");
        return urlParts[urlParts.length - 2];
    }
}
