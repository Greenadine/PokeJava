package dev.greenadine.pokejava.model.pokemon.shape;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a localized "scientific" name for an API resource in a specific language.
 *
 * @param awesomeName the localized "scientific" name.
 * @param language the language this "scientific" name is in.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record AwesomeName(@JsonProperty("awesome_name") String awesomeName,
                          @JsonProperty("language") NamedApiResource language) {
}
