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
package dev.greenadine.pokejava.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

/**
 * A Pokémon's move version.
 *
 * @param moveLearnMethod the method by which the move is learned.
 * @param versionGroup    the version group in which the move is learned.
 * @param order           the order the move is learned in the version group. Can be {@code null}.
 * @param levelLearnedAt  the minimum level to learn the move.
 * @see PokemonMove
 */
public record PokemonMoveVersion(@JsonProperty("move_learn_method") @NotNull NamedApiResource moveLearnMethod,
                                 @JsonProperty("version_group") @NotNull NamedApiResource versionGroup,
                                 @JsonProperty("order") int order,
                                 @JsonProperty("level_learned_at") int levelLearnedAt) {
}
