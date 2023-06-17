package dev.greenadine.pokejava.model.pokemon.nature;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Represents a preference for a move battle style.
 *
 * @param lowHpPreference the chance of using the move, in percent, if the Pokémon's HP is under half.
 * @param highHpPreference the chance of using the move, in percent, if the Pokémon's HP is over half.
 * @param moveBattleStyle the move battle style this preference belongs to.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record MoveBattleStylePreference(@JsonProperty("low_hp_preference") int lowHpPreference,
                                        @JsonProperty("high_hp_preference") int highHpPreference,
                                        @JsonProperty("move_battle_style") NamedApiResource moveBattleStyle) {
}
