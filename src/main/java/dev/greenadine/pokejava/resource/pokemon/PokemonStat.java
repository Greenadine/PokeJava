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
 * A Pokémon's stat.
 *
 * @param stat     the stat the referenced Pokémon has.
 * @param effort   the effort points (EV) the referenced Pokémon has in the stat.
 * @param baseStat the base value of the referenced Pokémon has in the stat.
 * @see Pokemon
 */
public record PokemonStat(@JsonProperty("stat") @NotNull NamedApiResource stat,
                          @JsonProperty("effort") int effort,
                          @JsonProperty("base_stat") int baseStat) {
}
