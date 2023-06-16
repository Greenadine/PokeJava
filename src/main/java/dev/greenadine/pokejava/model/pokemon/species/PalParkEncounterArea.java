package dev.greenadine.pokejava.model.pokemon.species;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

/**
 * Represents a Pal Park area where a Pokémon species can be encountered.
 *
 * @param baseScore the base score given to the player when the referenced Pokémon is caught during a pal park run.
 * @param rate the base rate for encountering the referenced Pokémon in this pal park area.
 * @param area the pal park area where this encounter happens.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record PalParkEncounterArea(@JsonProperty("base_score") int baseScore,
                                   @JsonProperty("rate") int rate,
                                   @JsonProperty("area") NamedApiResource area) {
}
