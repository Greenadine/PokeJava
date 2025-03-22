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
package dev.greenadine.pokejava.resource.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

/**
 * A Pokédex entry for a specific Pokémon species.
 *
 * @param entryNumber    the index of this Pokémon species entry within the Pokédex.
 * @param pokemonSpecies the referenced Pokémon species.
 * @see Pokedex
 */
public record PokemonEntry(@JsonProperty("entry_number") int entryNumber,
                           @JsonProperty("pokemon_species") @NotNull NamedApiResource pokemonSpecies) {
}
