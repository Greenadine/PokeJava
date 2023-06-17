package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a single Pokémon type.
 *
 * @param slot the order the Pokémon's types are listed in.
 * @param type the type the referenced Pokémon has.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record PokemonType(@JsonProperty("slot") int slot,
                          @JsonProperty("type") NamedApiResource type) {
}
