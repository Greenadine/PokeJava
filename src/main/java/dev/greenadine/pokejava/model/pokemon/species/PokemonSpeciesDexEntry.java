package dev.greenadine.pokejava.model.pokemon.species;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a Pokédex entry for a specific Pokémon species in a specific Pokédex.
 *
 * @param entryNumber the index number within the Pokédex.
 * @param pokedex the Pokédex that this entry belongs to.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record PokemonSpeciesDexEntry(@JsonProperty("entry_number") int entryNumber,
                                     @JsonProperty("pokedex") NamedApiResource pokedex) {
}
