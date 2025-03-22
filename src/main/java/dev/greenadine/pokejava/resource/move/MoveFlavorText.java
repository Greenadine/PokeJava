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
import org.jetbrains.annotations.NotNull;

/**
 * Move flavor text is used to describe a move's flavor text in different languages.
 *
 * @param flavorText   the localized flavor text for an api resource in a specific language.
 * @param language     the language this name is in.
 * @param versionGroup the version group that uses this flavor text.
 * @see Move
 */
public record MoveFlavorText(@JsonProperty("flavor_text") @NotNull String flavorText,
                             @JsonProperty("language") @NotNull NamedApiResource language,
                             @JsonProperty("version_group") @NotNull NamedApiResource versionGroup) {
}
