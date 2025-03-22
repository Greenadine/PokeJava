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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A Pokémon's cries.
 *
 * @param latest the latest depiction of this Pokémon's cry.
 * @param legacy the legacy depiction of this Pokémon's cry.
 * @see Pokemon
 */
public record PokemonCries(@JsonProperty("latest") @NotNull String latest,
                           @JsonProperty("legacy") @Nullable String legacy) {
}
