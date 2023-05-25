package dev.greenadine.pokejava.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

/**
 * Represents a name of a resource in a specific language.
 *
 * @param name the localized name for an API resource in a specific language.
 * @param language the language the name is in.
 */
public record Name(@JsonProperty("name") String name,
                   @JsonProperty("language") NamedApiResource language) {
}
