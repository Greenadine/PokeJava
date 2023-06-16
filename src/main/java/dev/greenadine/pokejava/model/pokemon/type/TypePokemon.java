package dev.greenadine.pokejava.model.pokemon.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

/**
 * Represents how a Pokémon's type influences its moves.
 *
 * @param slot the order the Pokémon's types are listed in.
 * @param pokemon the Pokémon that has the referenced type.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record TypePokemon(@JsonProperty("slot") int slot,
                          @JsonProperty("pokemon") NamedApiResource pokemon) {
}
