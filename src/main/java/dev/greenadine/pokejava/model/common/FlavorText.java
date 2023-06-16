package dev.greenadine.pokejava.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

/**
 * Represents a flavor text for a Pokémon species in a specific language.
 *
 * @param flavorText the localized flavor text for the referenced Pokémon species.
 * @param language the language this flavor text is in.
 * @param version the game version this flavor text is extracted from.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record FlavorText(@JsonProperty("flavor_text") String flavorText,
                         @JsonProperty("language") NamedApiResource language,
                         @JsonProperty("version") NamedApiResource version) {
}
