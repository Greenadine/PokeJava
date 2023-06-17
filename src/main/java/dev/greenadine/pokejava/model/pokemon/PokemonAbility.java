package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a single Pokémon ability.
 *
 * @param isHidden whether this is a hidden ability.
 * @param slot the slot this ability occupies in this Pokémon species.
 * @param ability the ability the Pokémon may have.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record PokemonAbility(@JsonProperty("is_hidden") boolean isHidden,
                             @JsonProperty("slot") int slot,
                             @JsonProperty("ability") NamedApiResource ability) {
}
