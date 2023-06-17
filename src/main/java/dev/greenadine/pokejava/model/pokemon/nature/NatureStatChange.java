package dev.greenadine.pokejava.model.pokemon.nature;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents how a Pokémon's stats change when its nature is changed.
 *
 * @param maxChange the maximum amount of change to the referenced stat.
 * @param pokeathlonStat the stat which is affected by this nature.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record NatureStatChange(@JsonProperty("max_change") int maxChange,
                               @JsonProperty("pokeathlon_stat") NamedApiResource pokeathlonStat) {
}
