package dev.greenadine.pokejava.model.common.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a named resource from the API.
 *
 * @see ApiResource
 * @see Resource
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class NamedApiResource extends ApiResource {

    private final String name;

    protected NamedApiResource(int id, String name) {
        super(id);

        this.name = name;
    }

    @JsonCreator
    protected NamedApiResource(@JsonProperty("name") String name,
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
