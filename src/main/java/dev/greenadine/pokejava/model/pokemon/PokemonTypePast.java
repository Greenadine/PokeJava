package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Represents a Pokémon's types as they were in a previous generation.
 *
 * @param generation the generation of this Pokémon type.
 * @param types the types the referenced Pokémon had.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record PokemonTypePast(@JsonProperty("generation") NamedApiResource generation,
                              @JsonProperty("types") List<PokemonType> types) {
}
