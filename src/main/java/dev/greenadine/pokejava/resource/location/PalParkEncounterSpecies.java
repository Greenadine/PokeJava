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
import org.jetbrains.annotations.NotNull;

/**
 * An encounter with a Pokémon in a {@link PalParkArea}.
 *
 * @param baseScore      the base score given to the player when the Pokémon is caught during a Pal Park run.
 * @param rate           the base rate for encountering the Pokémon in this Pal Park area.
 * @param pokemonSpecies the Pokémon species being encountered.
 * @see PalParkArea
 */
public record PalParkEncounterSpecies(@JsonProperty("base_score") int baseScore,
                                      @JsonProperty("rate") int rate,
                                      @JsonProperty("pokemon_species") @NotNull NamedApiResource pokemonSpecies) {
}
