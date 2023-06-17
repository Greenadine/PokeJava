package dev.greenadine.pokejava.model.pokemon.species;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a genus of a Pokémon species in a specific language.
 *
 * @param genus the localized genus for the referenced Pokémon species.
 * @param language the language this genus is in.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record Genus(@JsonProperty("genus") String genus,
                    @JsonProperty("language") NamedApiResource language) {
}
