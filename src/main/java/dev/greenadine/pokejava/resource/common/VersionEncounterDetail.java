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
import dev.greenadine.pokejava.resource.location.PokemonEncounter;
import dev.greenadine.pokejava.resource.pokemon.LocationAreaEncounter;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * A Pokémon encounter in a specific version with details about the encounter.
 *
 * @param version          the game version this encounter happens in.
 * @param maxChance        the total percentage of all encounter potential.
 * @param encounterDetails a list of encounters and their specifics.
 * @see PokemonEncounter
 * @see LocationAreaEncounter
 */
public record VersionEncounterDetail(@JsonProperty("version") @NotNull NamedApiResource version,
                                     @JsonProperty("max_chance") int maxChance,
                                     @JsonProperty("encounter_details") @NotNull List<Encounter> encounterDetails) {
}
