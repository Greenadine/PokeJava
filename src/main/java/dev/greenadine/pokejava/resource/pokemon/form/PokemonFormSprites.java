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
package dev.greenadine.pokejava.resource.pokemon.form;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A set of sprites used to depict a Pokémon in the game.
 *
 * @param frontDefault     the default depiction of this Pokémon from the front in battle.
 * @param frontShiny       the shiny depiction of this Pokémon from the front in battle.
 * @param backDefault      the default depiction of this Pokémon from the back in battle.
 * @param backShiny        the shiny depiction of this Pokémon from the back in battle.
 * @see PokemonForm
 */
public record PokemonFormSprites(@JsonProperty("back_default") @NotNull String backDefault,
                                 @JsonProperty("back_female") @Nullable String backFemale,
                                 @JsonProperty("back_shiny") @NotNull String backShiny,
                                 @JsonProperty("back_shiny_female") @Nullable String backShinyFemale,
                                 @JsonProperty("front_default") @NotNull String frontDefault,
                                 @JsonProperty("front_female") @Nullable String frontFemale,
                                 @JsonProperty("front_shiny") @NotNull String frontShiny,
                                 @JsonProperty("front_shiny_female") @Nullable String frontShinyFemale) {
}
