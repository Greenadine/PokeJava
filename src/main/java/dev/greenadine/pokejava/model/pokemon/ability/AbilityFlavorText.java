package dev.greenadine.pokejava.model.pokemon.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

/**
 * Represents a localized flavor text for an API resource.
 *
 * @param flavorText the localized flavor text.
 * @param language the language this flavor text is in.
 * @param versionGroup the version group that uses this flavor text.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record AbilityFlavorText(@JsonProperty("flavor_text") String flavorText,
                                @JsonProperty("language") NamedApiResource language,
                                @JsonProperty("version_group") NamedApiResource versionGroup) {
}
