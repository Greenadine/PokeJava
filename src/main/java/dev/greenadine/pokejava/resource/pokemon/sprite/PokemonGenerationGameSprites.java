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

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * Mapping of Pokémon sprites within a generation, separated by each game within the generation.
 *
 * <p> Not to be confused with {@link PokemonGameSprites}, which contains all the Pokémon's sprites within a specific game.
 *
 * @see PokemonGenerationSprites
 */
public final class PokemonGenerationGameSprites {

    private final Map<String, PokemonGameSprites> gameSprites = new HashMap<>();

    @JsonCreator
    private PokemonGenerationGameSprites() {}

    @JsonAnySetter
    private void setGameSprites(String key, PokemonGameSprites value) {
        gameSprites.put(key, value);
    }

    /**
     * Gets all the Pokémon's sprites within a generation, separated by each game within the generation.
     *
     * @return all the Pokémon's sprites within a generation, separated by each game within the generation.
     */
    public @NotNull Map<String, PokemonGameSprites> getGameSprites() {
        return gameSprites;
    }

    /**
     * Gets the Pokémon's sprites within a specific game of this generation.
     *
     * @param game the game to get.
     * @return the Pokémon's sprites within a specific game of this generation.
     */
    public @Nullable PokemonGameSprites getGameSprites(@NotNull String game) {
        return gameSprites.get(game);
    }
}
