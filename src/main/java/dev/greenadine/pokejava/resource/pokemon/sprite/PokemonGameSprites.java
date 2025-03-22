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
 * A Pokémon's sprites in a specific game.
 *
 * <p> Note that not every Pokémon may have every sprite. In such cases, the corresponding field will be {@code null}.
 *
 * @param frontDefault          the default sprite of this Pokémon from the front in battle.
 * @param frontTransparent      the transparent sprite of this Pokémon from the front in battle.
 * @param frontShiny            the shiny sprite of this Pokémon from the front in battle.
 * @param frontShinyTransparent the shiny transparent sprite of this Pokémon from the front in battle.
 * @param frontFemale           the female sprite of this Pokémon from the front in battle.
 * @param frontShinyFemale      the shiny female sprite of this Pokémon from the front in battle.
 * @param frontGray             the gray sprite of this Pokémon from the front in battle.
 * @param backDefault           the default sprite of this Pokémon from the back in battle.
 * @param backTransparent       the transparent sprite of this Pokémon from the back in battle.
 * @param backShiny             the shiny sprite of this Pokémon from the back in battle.
 * @param backShinyTransparent  the shiny transparent sprite of this Pokémon from the back in battle.
 * @param backFemale            the female sprite of this Pokémon from the back in battle.
 * @param backFemaleShiny       the shiny female sprite of this Pokémon from the back in battle.
 * @param backGray              the gray sprite of this Pokémon from the back in battle.
 * @param animated              the animated sprites of this Pokémon in battle.
 * @see PokemonGenerationGameSprites
 */
public record PokemonGameSprites(@JsonProperty("front_default") String frontDefault,
                                 @JsonProperty("front_transparent") String frontTransparent,
                                 @JsonProperty("front_shiny") String frontShiny,
                                 @JsonProperty("front_shiny_transparent") String frontShinyTransparent,
                                 @JsonProperty("front_female") String frontFemale,
                                 @JsonProperty("front_shiny_female") String frontShinyFemale,
                                 @JsonProperty("front_gray") String frontGray,
                                 @JsonProperty("back_default") String backDefault,
                                 @JsonProperty("back_transparent") String backTransparent,
                                 @JsonProperty("back_shiny") String backShiny,
                                 @JsonProperty("back_shiny_transparent") String backShinyTransparent,
                                 @JsonProperty("back_female") String backFemale,
                                 @JsonProperty("back_shiny_female") String backFemaleShiny,
                                 @JsonProperty("back_gray") String backGray,
                                 @JsonProperty("animated") PokemonGameSprites animated) {
}
