package dev.greenadine.pokejava.model.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents a list of {@link NamedApiResource}s.
 *
 * @since 0.1.0
 * @see NamedApiResource
 * @see AbstractResourceList
 * @see ResourceList
 * @author Greenadine
 */
public class NamedApiResourceList extends AbstractResourceList<NamedApiResource> {

    @JsonCreator
    protected NamedApiResourceList(@JsonProperty("count") int count,
                                   @JsonProperty("next") String next,
                                   @JsonProperty("previous") String previous,
                                   @JsonProperty("results") List<NamedApiResource> results) {
        super(count, next, previous, results);
    }
}
