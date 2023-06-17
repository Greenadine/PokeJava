package dev.greenadine.pokejava.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a localized effect text for an API resource.
 *
 * @param effect the localized effect text.
 * @param language the language this effect is in.
 */
public record Effect(@JsonProperty("effect") String effect,
                     @JsonProperty("language") NamedApiResource language) {
}
