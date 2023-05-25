package dev.greenadine.pokejava.model.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents a list of {@link ApiResource}s.
 *
 * @since 0.1.0
 * @see ApiResource
 * @see AbstractResourceList
 * @see ResourceList
 * @author Greenadine
 */
public class ApiResourceList extends AbstractResourceList<ApiResource> {

    @JsonCreator
    public ApiResourceList(@JsonProperty("count") int count,
                           @JsonProperty("next") String next,
                           @JsonProperty("previous") String previous,
                           @JsonProperty("results") List<ApiResource> results) {
        super(count, next, previous, results);
    }
}
