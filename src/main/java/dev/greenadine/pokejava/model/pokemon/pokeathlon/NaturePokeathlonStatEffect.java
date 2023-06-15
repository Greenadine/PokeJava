package dev.greenadine.pokejava.model.pokemon.pokeathlon;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

/**
 * Represents how a nature affects a Pokéathlon stat.
 *
 * @param maxChange the maximum amount of change to the referenced stat.
 * @param nature the nature which affects the referenced stat.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record NaturePokeathlonStatEffect(@JsonProperty("max_change") int maxChange,
                                         @JsonProperty("nature") NamedApiResource nature) {
}
