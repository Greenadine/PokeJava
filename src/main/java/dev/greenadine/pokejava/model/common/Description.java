package dev.greenadine.pokejava.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a description of a resource.
 *
 * @param description the localized description for an API resource in a specific language.
 * @param language the language the description is in.
 */
public record Description(@JsonProperty("description") String description,
                          @JsonProperty("language") NamedApiResource language) {
}
