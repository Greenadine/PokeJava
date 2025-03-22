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
package dev.greenadine.pokejava.resource.item;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Holds information about which Pokémon can hold a specific item in specific versions.
 *
 * @param pokemon        the Pokémon that holds the item.
 * @param versionDetails the details for the version that this item is held in by the Pokémon.
 * @see Item
 */
public record ItemHolderPokemon(@JsonProperty("pokemon") @NotNull NamedApiResource pokemon,
                                @JsonProperty("version_details") @NotNull List<ItemHolderPokemonVersionDetail> versionDetails) {
}
