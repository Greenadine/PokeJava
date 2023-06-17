package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a Pokémon's move version.
 *
 * @param moveLearnMethod the method by which the move is learned.
 * @param versionGroup the version group in which the move is learned.
 * @param levelLearnedAt the minimum level to learn the move.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record PokemonMoveVersion(@JsonProperty("move_learn_method") NamedApiResource moveLearnMethod,
                                 @JsonProperty("version_group") NamedApiResource versionGroup,
                                 @JsonProperty("level_learned_at") int levelLearnedAt) {
}
