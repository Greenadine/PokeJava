package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a Pokémon's stat.
 *
 * @param stat the stat the referenced Pokémon has.
 * @param effort the effort points (EV) the referenced Pokémon has in the stat.
 * @param baseStat the base value of the referenced Pokémon has in the stat.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record PokemonStat(@JsonProperty("stat") NamedApiResource stat,
                          @JsonProperty("effort") int effort,
                          @JsonProperty("base_stat") int baseStat) {
}
