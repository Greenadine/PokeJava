package dev.greenadine.pokejava.model.pokemon.stat;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

import java.util.List;

/**
 * Represents a list of natures which affect a stat positively and negatively.
 *
 * @param increase a list of natures which increase the referenced stat.
 * @param decrease a list of natures which decrease the referenced stat.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record NatureStatAffectSets(@JsonProperty("increase") List<NamedApiResource> increase,
                                   @JsonProperty("decrease") List<NamedApiResource> decrease) {
}
