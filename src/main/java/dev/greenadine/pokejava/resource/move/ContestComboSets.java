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
import org.jetbrains.annotations.NotNull;

/**
 * Contest combo detail lists the index numbers of the moves required to enable this move to be
 *
 * @param normal     a detail of moves this move can be used before or after, granting additional appeal points in contests.
 * @param superCombo a detail of moves this move can be used before or after, granting additional appeal points in super contests.
 * @see Move
 */
public record ContestComboSets(@JsonProperty("normal") @NotNull ContestComboDetail normal,
                               @JsonProperty("super") @NotNull ContestComboDetail superCombo) {
}
