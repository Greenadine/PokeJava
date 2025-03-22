/*
 * Copyright © 2025 Kevin "Greenadine" Zuman (kevin@greenadine.dev)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.greenadine.pokejava.resource.pokemon.nature;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

/**
 * A preference for a move battle style.
 *
 * @param lowHpPreference  the chance of using the move, in percent, if the Pokémon's HP is under half.
 * @param highHpPreference the chance of using the move, in percent, if the Pokémon's HP is over half.
 * @param moveBattleStyle  the move battle style this preference belongs to.
 * @see Nature
 */
public record MoveBattleStylePreference(@JsonProperty("low_hp_preference") int lowHpPreference,
                                        @JsonProperty("high_hp_preference") int highHpPreference,
                                        @JsonProperty("move_battle_style") @NotNull NamedApiResource moveBattleStyle) {
}
