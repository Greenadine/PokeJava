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

import java.util.List;

/**
 * A Pokémon encounter.
 *
 * @param minLevel        the lowest level the Pokémon could be encountered at.
 * @param maxLevel        the highest level the Pokémon could be encountered at.
 * @param conditionValues a list of condition values that must be in effect for this encounter to occur.
 * @param chance          percent chance that this encounter will occur.
 * @param method          the method by which this encounter happens.
 * @see VersionEncounterDetail
 */
public record Encounter(@JsonProperty("min_level") int minLevel,
                        @JsonProperty("max_level") int maxLevel,
                        @JsonProperty("condition_values") @Nullable List<NamedApiResource> conditionValues,
                        @JsonProperty("chance") int chance,
                        @JsonProperty("method") @NotNull NamedApiResource method) {
}
