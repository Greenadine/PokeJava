package dev.greenadine.pokejava.model.pokemon.stat;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents how a move affects a stat.
 *
 * @param change the amount of change to the referenced stat.
 * @param move the move causing the change.
 *
 * @see MoveStatAffectSets
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record MoveStatAffect(@JsonProperty("change") int change,
                             @JsonProperty("move") NamedApiResource move) {
}
