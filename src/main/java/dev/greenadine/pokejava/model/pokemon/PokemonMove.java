package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Represents a Pokémon's move.
 *
 * @param move the move the Pokémon can learn.
 * @param versionGroupDetails the details of the version in which the Pokémon can learn the move.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record PokemonMove(@JsonProperty("move") NamedApiResource move,
                          @JsonProperty("version_group_details") List<PokemonMoveVersion> versionGroupDetails) {
}
