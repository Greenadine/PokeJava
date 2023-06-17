package dev.greenadine.pokejava.model.pokemon.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a single Pokémon form type.
 *
 * @param slot the order in which types are listed for this Pokémon form.
 * @param type the type the referenced Pokémon form has.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record PokemonFormType(@JsonProperty("slot") int slot,
                              @JsonProperty("type") NamedApiResource type) {
}
