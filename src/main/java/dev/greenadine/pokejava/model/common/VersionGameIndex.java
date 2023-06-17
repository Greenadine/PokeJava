package dev.greenadine.pokejava.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a game index of a resource in a specific version.
 *
 * @param gameIndex the internal id of an API resource within game data.
 * @param version the version relevant to this game index.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record VersionGameIndex(@JsonProperty("game_index") int gameIndex,
                               @JsonProperty("version") NamedApiResource version) {
}
