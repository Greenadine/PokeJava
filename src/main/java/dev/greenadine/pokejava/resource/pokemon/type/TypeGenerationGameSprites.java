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
package dev.greenadine.pokejava.resource.pokemon.type;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * Mapping of type sprites within a generation, separated by each game within the generation.
 *
 * @see TypeGenerationSprites
 */
public final class TypeGenerationGameSprites {

    private final Map<String, TypeSprites> gameSprites = new HashMap<>();

    @JsonCreator
    private TypeGenerationGameSprites() {}

    @JsonAnySetter
    private void setGameSprites(String key, TypeSprites value) {
        gameSprites.put(key, value);
    }

    /**
     * Gets all the type's sprites within a generation, separated by each game within the generation.
     *
     * @return all the type's sprites within a generation, separated by each game within the generation.
     */
    public @NotNull Map<String, TypeSprites> getGameSprites() {
        return gameSprites;
    }

    /**
     * Gets the type's sprites within a specific game of this generation.
     *
     * @param game the game to get.
     * @return the type's sprites within a specific game of this generation.
     */
    public @Nullable TypeSprites getGameSprites(@NotNull String game) {
        return gameSprites.get(game);
    }
}
