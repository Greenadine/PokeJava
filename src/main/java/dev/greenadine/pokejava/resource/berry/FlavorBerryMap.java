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
package dev.greenadine.pokejava.resource.berry;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

/**
 * A mapping of a berry that has a specific berry flavor and the potency of the flavor in the berry.
 *
 * @param potency how powerful the referenced flavor is for this berry.
 * @param berry   the berry with the referenced flavor.
 * @see BerryFlavor
 */
public record FlavorBerryMap(@JsonProperty("potency") int potency,
                             @JsonProperty("berry") @NotNull NamedApiResource berry) {
}
