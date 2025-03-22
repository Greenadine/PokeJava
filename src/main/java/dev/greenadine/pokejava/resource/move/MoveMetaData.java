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
package dev.greenadine.pokejava.resource.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

/**
 * Move metadata refers to the data that determines certain effects of a move.
 *
 * @param ailment       the status ailment this move inflicts on its target.
 * @param category      the category of move this move falls under, e.g. damage or ailment.
 * @param minHits       the minimum number of times this move hits, or {@code 0} if not applicable.
 * @param maxHits       the maximum number of times this move hits, or {@code 0} if not applicable.
 * @param minTurns      the minimum number of turns this move continues to take effect, or {@code 0} if not applicable.
 * @param maxTurns      the maximum number of turns this move continues to take effect, or {@code 0} if not applicable.
 * @param drain         the amount of HP gained by the attacking Pokémon when it uses this move, or {@code 0} if not applicable.
 * @param healing       the amount of HP gained by the attacking Pokémon when it uses this move, or {@code 0} if not applicable.
 * @param critRate      the likelihood this attack will cause a critical hit, or {@code 0} if not applicable.
 * @param ailmentChance the likelihood this attack will cause a status ailment, or {@code 0} if not applicable.
 * @param flinchChance  the likelihood this attack will cause the target Pokémon to flinch, or {@code 0} if not applicable.
 * @param statChance    the likelihood this attack will cause a stat change in the target Pokémon, or {@code 0} if not applicable.
 * @see Move
 */
public record MoveMetaData(@JsonProperty("ailment") @NotNull NamedApiResource ailment,
                           @JsonProperty("category") @NotNull NamedApiResource category,
                           @JsonProperty("min_hits") int minHits,
                           @JsonProperty("max_hits") int maxHits,
                           @JsonProperty("min_turns") int minTurns,
                           @JsonProperty("max_turns") int maxTurns,
                           @JsonProperty("drain") int drain,
                           @JsonProperty("healing") int healing,
                           @JsonProperty("crit_rate") int critRate,
                           @JsonProperty("ailment_chance") int ailmentChance,
                           @JsonProperty("flinch_chance") int flinchChance,
                           @JsonProperty("stat_chance") int statChance) {
}
