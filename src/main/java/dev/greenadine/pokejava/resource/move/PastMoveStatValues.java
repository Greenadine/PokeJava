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
import dev.greenadine.pokejava.resource.common.VerboseEffect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Past move stat values are used to describe values of a move in past games.
 *
 * @param accuracy      the percent value of how likely this move is to be successful, or {@code 0} if not applicable.
 * @param effectChance  the percent value of how likely it is this moves effect will happen, or {@code 0} if not applicable.
 * @param power         the base power of this move with a value of 0 if it does not have a base power, or {@code 0} if not applicable.
 * @param pp            the effect of this move listed in different languages, or {@code 0} if not applicable.
 * @param effectEntries the elemental type of this move.
 * @param type          the type of this move.
 * @param versionGroup  the version group in which these move stat values were in effect.
 * @see Move
 */
public record PastMoveStatValues(@JsonProperty("accuracy") int accuracy,
                                 @JsonProperty("effect_chance") int effectChance,
                                 @JsonProperty("power") int power,
                                 @JsonProperty("pp") int pp,
                                 @JsonProperty("effect_entries") @Nullable List<VerboseEffect> effectEntries,
                                 @JsonProperty("type") @Nullable NamedApiResource type,
                                 @JsonProperty("version_group") @NotNull NamedApiResource versionGroup) {
}
