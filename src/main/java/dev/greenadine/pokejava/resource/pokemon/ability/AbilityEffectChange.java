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
package dev.greenadine.pokejava.resource.pokemon.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.Effect;
import dev.greenadine.pokejava.resource.move.Move;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Represents how a Pokémon's ability changes in effect when it is used on a Pokémon.
 *
 * @param effectEntries the previous effect of this ability listed in different languages.
 * @param versionGroup  the version group in which the previous effect of this ability originated.
 * @see Ability
 * @see Move
 */
public record AbilityEffectChange(@JsonProperty("effect_entries") @NotNull List<Effect> effectEntries,
                                  @JsonProperty("version_group") @NotNull NamedApiResource versionGroup) {
}
