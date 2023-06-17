package dev.greenadine.pokejava.model.pokemon.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents the link between a Pokémon and an ability.
 *
 * @param isHidden whether the ability is hidden for this Pokémon.
 * @param slot the slot this ability occupies for this Pokémon.
 * @param pokemon the Pokémon this ability belongs to.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record AbilityPokemon(@JsonProperty("is_hidden") boolean isHidden,
                             @JsonProperty("slot") int slot,
                             @JsonProperty("pokemon") NamedApiResource pokemon) {
}
