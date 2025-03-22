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
package dev.greenadine.pokejava.resource.pokemon.sprite;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Pokémon's miscellaneous sprites.
 *
 * <p> Note that not every Pokémon may have every sprite. In such cases, the corresponding field will be {@code null}.
 *
 * @param dreamWorld      the sprites of this Pokémon in the dream world.
 * @param home            the sprites of this Pokémon in Pokémon Home.
 * @param officialArtwork the official artwork of this Pokémon.
 * @param showdown        the sprites of this Pokémon in Pokémon Showdown.
 * @see PokemonSprites
 */
public record PokemonOtherSprites(@JsonProperty("dream_world") PokemonSprites dreamWorld,
                                  @JsonProperty("home") PokemonSprites home,
                                  @JsonProperty("official-artwork") PokemonSprites officialArtwork,
                                  @JsonProperty("showdown") PokemonSprites showdown) {
}
