package dev.greenadine.pokejava.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a named resource from the API.
 *
 * @since 0.1.0
 * @see ApiResource
 * @see Resource
 * @author Greenadine
 */
public class NamedApiResource extends ApiResource {

    private final String name;

    protected NamedApiResource(int id, String category, String name) {
        super(id, category);

        this.name = name;
    }

    @JsonCreator
    public NamedApiResource(@JsonProperty("name") String name,
                            @JsonProperty("url") final String url) {
        super(url);

        this.name = name;
    }

    /**
     * Gets the name of the resource.
     *
     * @return the name of the resource.
     */
    public String getName() {
        return name;
    }
}
