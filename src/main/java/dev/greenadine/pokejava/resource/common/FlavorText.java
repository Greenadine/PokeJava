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
package dev.greenadine.pokejava.resource.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A flavor text for a Pokémon species in a specific language.
 *
 * @param flavorText the localized flavor text for the referenced Pokémon species.
 * @param language   the language this flavor text is in.
 * @param version    the game version this flavor text is extracted from.
 */
public record FlavorText(@JsonProperty("flavor_text") @NotNull String flavorText,
                         @JsonProperty("language") @NotNull NamedApiResource language,
                         @JsonProperty("version") @Nullable NamedApiResource version) {
}
