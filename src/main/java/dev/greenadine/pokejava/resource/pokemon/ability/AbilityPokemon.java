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
import org.jetbrains.annotations.NotNull;

/**
 * The link between a Pokémon and an ability.
 *
 * @param isHidden whether the ability is hidden for this Pokémon.
 * @param slot     the slot this ability occupies for this Pokémon.
 * @param pokemon  the Pokémon this ability belongs to.
 * @see Ability
 */
public record AbilityPokemon(@JsonProperty("is_hidden") boolean isHidden,
                             @JsonProperty("slot") int slot,
                             @JsonProperty("pokemon") @NotNull NamedApiResource pokemon) {
}
