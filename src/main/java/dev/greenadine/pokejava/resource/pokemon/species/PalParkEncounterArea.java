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
package dev.greenadine.pokejava.resource.pokemon.species;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

/**
 * A Pal Park area where a Pokémon species can be encountered.
 *
 * @param baseScore the base score given to the player when the referenced Pokémon is caught during a pal park run.
 * @param rate      the base rate for encountering the referenced Pokémon in this pal park area.
 * @param area      the pal park area where this encounter happens.
 * @see PokemonSpecies
 */
public record PalParkEncounterArea(@JsonProperty("base_score") int baseScore,
                                   @JsonProperty("rate") int rate,
                                   @JsonProperty("area") @NotNull NamedApiResource area) {
}
