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
import dev.greenadine.pokejava.resource.pokemon.Pokemon;

/**
 * A Pokémon's sprites.
 *
 * <p> Note that not every Pokémon may have every sprite. In such cases, the corresponding field will be {@code null}.
 *
 * @param frontDefault     the URL for the default depiction of this Pokémon from the front in battle.
 * @param frontShiny       the URL for the shiny depiction of this Pokémon from the front in battle.
 * @param frontFemale      the URL for the female depiction of this Pokémon from the front in battle.
 * @param frontShinyFemale the URL for the shiny female depiction of this Pokémon from the front in battle.
 * @param backDefault      the URL for the default depiction of this Pokémon from the back in battle.
 * @param backShiny        the URL for the shiny depiction of this Pokémon from the back in battle.
 * @param backFemale       the URL for the female depiction of this Pokémon from the back in battle.
 * @param backFemaleShiny  the URL for the female shiny depiction of this Pokémon from the back in battle.
 * @param other            the other sprites of this Pokémon.
 * @param versions         the sprites of this Pokémon in different versions of the games.
 * @see Pokemon
 */
public record PokemonSprites(@JsonProperty("front_default") String frontDefault,
                             @JsonProperty("front_shiny") String frontShiny,
                             @JsonProperty("front_female") String frontFemale,
                             @JsonProperty("front_shiny_female") String frontShinyFemale,
                             @JsonProperty("back_default") String backDefault,
                             @JsonProperty("back_shiny") String backShiny,
                             @JsonProperty("back_female") String backFemale,
                             @JsonProperty("back_shiny_female") String backFemaleShiny,
                             @JsonProperty("other") PokemonOtherSprites other,
                             @JsonProperty("versions") PokemonGenerationSprites versions) {
}
