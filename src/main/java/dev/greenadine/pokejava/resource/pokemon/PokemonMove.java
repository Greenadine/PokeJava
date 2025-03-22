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

import java.util.List;

/**
 * A Pokémon's move.
 *
 * @param move                the move the Pokémon can learn.
 * @param versionGroupDetails the details of the version in which the Pokémon can learn the move.
 * @see Pokemon
 */
public record PokemonMove(@JsonProperty("move") @NotNull NamedApiResource move,
                          @JsonProperty("version_group_details") @NotNull List<PokemonMoveVersion> versionGroupDetails) {
}
