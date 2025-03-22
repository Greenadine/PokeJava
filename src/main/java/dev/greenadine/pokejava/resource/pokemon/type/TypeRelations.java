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
package dev.greenadine.pokejava.resource.pokemon.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Represents how effective a type is towards another type.
 *
 * @param noDamageTo       a list of types which have no effect on the referenced type.
 * @param halfDamageTo     a list of types which have half damage on the referenced type.
 * @param doubleDamageTo   a list of types which have double damage on the referenced type.
 * @param noDamageFrom     a list of types which the referenced type has no effect on.
 * @param halfDamageFrom   a list of types which have half damage from the referenced type.
 * @param doubleDamageFrom a list of types which have double damage from the referenced type.
 * @see Type
 */
public record TypeRelations(@JsonProperty("no_damage_to") @Nullable List<NamedApiResource> noDamageTo,
                            @JsonProperty("half_damage_to") @Nullable List<NamedApiResource> halfDamageTo,
                            @JsonProperty("double_damage_to") @Nullable List<NamedApiResource> doubleDamageTo,
                            @JsonProperty("no_damage_from") @Nullable List<NamedApiResource> noDamageFrom,
                            @JsonProperty("half_damage_from") @Nullable List<NamedApiResource> halfDamageFrom,
                            @JsonProperty("double_damage_from") @Nullable List<NamedApiResource> doubleDamageFrom) {
}
