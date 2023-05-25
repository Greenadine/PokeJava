package dev.greenadine.pokejava.model.pokemon.stat;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents a list of moves which affect a stat positively and negatively.
 *
 * @param increase a list of moves which increase the referenced stat.
 * @param decrease a list of moves which decrease the referenced stat.
 *
 * @since 0.1.0
 * @see MoveStatAffect
 * @author Greenadine
 */
public record MoveStatAffectSets(@JsonProperty("increase") List<MoveStatAffect> increase,
                                 @JsonProperty("decrease") List<MoveStatAffect> decrease) {
}
