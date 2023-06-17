package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents items a Pokémon can be holding when encountered.
 *
 * @param item the item the referenced Pokémon holds.
 * @param versionDetails the details of the different versions in which the item is held.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record PokemonHeldItem(@JsonProperty("item") NamedApiResource item,
                              @JsonProperty("version_details") PokemonHeldItemVersion versionDetails) {
}
