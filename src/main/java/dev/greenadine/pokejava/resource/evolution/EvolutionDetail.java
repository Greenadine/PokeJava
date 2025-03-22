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
package dev.greenadine.pokejava.resource.evolution;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.Nullable;

/**
 * Contains the details for an evolution to take place.
 *
 * @param item                  the item required to cause evolution.
 * @param trigger               the type of event that triggers evolution.
 * @param gender                the ID of the gender of the evolving Pokémon species must be in order to evolve into this species, or {@code 0} if not applicable.
 * @param heldItem              the item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this species.
 * @param knownMove             the move that must be known by the evolving Pokémon species in order to evolve into this species.
 * @param knownMoveType         the evolving Pokémon species must know a move with this type in order to evolve into this species.
 * @param location              the location the evolution must be triggered at.
 * @param minLevel              the minimum required level of the evolving Pokémon species to evolve into this species, or {@code 0} if not applicable.
 * @param minHappiness          the minimum required level of happiness the evolving Pokémon species to evolve into this species, or {@code 0} if not applicable.
 * @param minBeauty             the minimum required level of beauty the evolving Pokémon species to evolve into this species, or {@code 0} if not applicable.
 * @param minAffection          the minimum required level of affection the evolving Pokémon species to evolve into this species, or {@code 0} if not applicable.
 * @param needsOverworldRain    whether it must be raining in the overworld to cause evolution this species.
 * @param partySpecies          the Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this species.
 * @param partyType             the player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this species.
 * @param relativePhysicalStats the required relation between the Pokémon's Attack and Defense stats, or {@code 0} if not applicable.
 * @param timeOfDay             the required time of day. Day or night.
 * @param tradeSpecies          the Pokémon species that must be in a players party in order for the evolving Pokémon species to evolve into this species.
 * @param turnUpsideDown        whether the 3DS needs to be turned upside-down as this Pokémon levels up.
 * @see ChainLink
 */
public record EvolutionDetail(@JsonProperty("item") @Nullable NamedApiResource item,
                              @JsonProperty("trigger") @Nullable NamedApiResource trigger,
                              @JsonProperty("gender") int gender,
                              @JsonProperty("held_item") @Nullable NamedApiResource heldItem,
                              @JsonProperty("known_move") @Nullable NamedApiResource knownMove,
                              @JsonProperty("known_move_type") @Nullable NamedApiResource knownMoveType,
                              @JsonProperty("location") @Nullable NamedApiResource location,
                              @JsonProperty("min_level") int minLevel,
                              @JsonProperty("min_happiness") int minHappiness,
                              @JsonProperty("min_beauty") int minBeauty,
                              @JsonProperty("min_affection") int minAffection,
                              @JsonProperty("needs_overworld_rain") boolean needsOverworldRain,
                              @JsonProperty("party_species") @Nullable NamedApiResource partySpecies,
                              @JsonProperty("party_type") @Nullable NamedApiResource partyType,
                              @JsonProperty("relative_physical_stats") int relativePhysicalStats,
                              @JsonProperty("time_of_day") @Nullable String timeOfDay,
                              @JsonProperty("trade_species") @Nullable NamedApiResource tradeSpecies,
                              @JsonProperty("turn_upside_down") boolean turnUpsideDown) {
}
