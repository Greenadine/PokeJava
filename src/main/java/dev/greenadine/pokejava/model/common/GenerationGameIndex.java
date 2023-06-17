package dev.greenadine.pokejava.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a game index of a resource in a specific generation.
 *
 * @param gameIndex the internal id of an API resource within game data.
 * @param generation the generation relevant to this game index.
 */
public record GenerationGameIndex(@JsonProperty("game_index") int gameIndex,
                                  @JsonProperty("generation") NamedApiResource generation) {
}
