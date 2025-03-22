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

/**
 * Holds how often a Pokémon holds a certain item when wild in a specific version.
 *
 * @param rarity  how often this Pokémon holds this item in this version.
 * @param version the version that this item is held in by the Pokémon.
 * @see ItemHolderPokemon
 */
public record ItemHolderPokemonVersionDetail(@JsonProperty("rarity") int rarity,
                                             @JsonProperty("version") @NotNull NamedApiResource version) {
}
