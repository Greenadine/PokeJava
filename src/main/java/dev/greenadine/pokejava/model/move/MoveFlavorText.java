package dev.greenadine.pokejava.model.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Move flavor text is used to describe a move's flavor text in different languages.
 *
 * @param flavorText the localized flavor text for an api resource in a specific language.
 * @param language the language this name is in.
 * @param versionGroup the version group that uses this flavor text.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record MoveFlavorText(@JsonProperty("flavor_text") String flavorText,
                             @JsonProperty("language") NamedApiResource language,
                             @JsonProperty("version_group") NamedApiResource versionGroup) {
}
