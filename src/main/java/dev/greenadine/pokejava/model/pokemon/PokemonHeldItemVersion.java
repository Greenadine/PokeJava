package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a Pokémon held item version.
 *
 * @param version the version in which the item is held.
 * @param rarity the chance of the Pokémon holding the item.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record PokemonHeldItemVersion(@JsonProperty("version") NamedApiResource version,
                                     @JsonProperty("rarity") int rarity) {
}
