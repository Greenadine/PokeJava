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
package dev.greenadine.pokejava.resource.location;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.resource.NamedApiResource;

/**
 * An encounter that can occur in a version of the game with a given rate.
 *
 * @param rate    the chance of an encounter to occur.
 * @param version the version of the game in which the encounter can occur with the given chance.
 * @see EncounterMethodRate
 */
public record EncounterVersionDetails(@JsonProperty("rate") int rate,
                                      @JsonProperty("version") NamedApiResource version) {
}
