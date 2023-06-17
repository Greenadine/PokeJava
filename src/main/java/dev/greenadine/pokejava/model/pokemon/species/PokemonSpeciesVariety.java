package dev.greenadine.pokejava.model.pokemon.species;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a variety of a Pokémon species.
 *
 * @param isDefault whether this variety is the default variety.
 * @param pokemon the Pokémon variety.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record PokemonSpeciesVariety(@JsonProperty("is_default") boolean isDefault,
                                    @JsonProperty("pokemon") NamedApiResource pokemon) {
}
