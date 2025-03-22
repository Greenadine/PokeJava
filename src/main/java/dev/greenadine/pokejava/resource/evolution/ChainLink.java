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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * A link in an evolution chain.
 *
 * @param isBaby           whether this link is for a baby Pokémon. This would only ever be {@code true} on the base link.
 * @param species          the Pokémon species at this point in the evolution chain.
 * @param evolutionDetails the details for evolving this Pokémon species.
 * @param evolvesTo        the next stage in this evolution chain.
 * @see EvolutionChain
 */
public record ChainLink(@JsonProperty("is_baby") boolean isBaby,
                        @JsonProperty("species") @NotNull NamedApiResource species,
                        @JsonProperty("evolution_details") @Nullable List<EvolutionDetail> evolutionDetails,
                        @JsonProperty("evolves_to") @Nullable List<ChainLink> evolvesTo) {
}
