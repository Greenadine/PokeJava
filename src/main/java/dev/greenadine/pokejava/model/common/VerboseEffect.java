package dev.greenadine.pokejava.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

/**
 * Represents a localized effect text for an API resource.
 *
 * @param effect the localized effect text.
 * @param shortEffect the localized effect text in brief.
 * @param language the language this effect is in.
 */
public record VerboseEffect(@JsonProperty("effect") String effect,
                            @JsonProperty("short_effect") String shortEffect,
                            @JsonProperty("language") NamedApiResource language) {
}
