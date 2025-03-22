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
 * Represents items a Pokémon can be holding when encountered.
 *
 * @param item           the item the referenced Pokémon holds.
 * @param versionDetails the details of the different versions in which the item is held.
 * @see Pokemon
 */
public record PokemonHeldItem(@JsonProperty("item") @NotNull NamedApiResource item,
                              @JsonProperty("version_details") @NotNull PokemonHeldItemVersion versionDetails) {
}
