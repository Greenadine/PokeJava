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
 * Mapping of a Pokémon's sprites for each generation.
 *
 * @see PokemonSprites
 */
public final class PokemonGenerationSprites {

    private final Map<String, PokemonGenerationGameSprites> generationSprites = new HashMap<>();

    @JsonCreator
    private PokemonGenerationSprites() {}

    @JsonAnySetter
    private void setGenerationSprites(String key, PokemonGenerationGameSprites value) {
        generationSprites.put(key, value);
    }

    /**
     * Gets all of a Pokémon's sprites for each generation.
     *
     * @return all of a Pokémon's sprites for each generation.
     */
    public @NotNull Map<String, PokemonGenerationGameSprites> getGenerationSprites() {
        return generationSprites;
    }

    /**
     * Gets a specific generation of this Pokémon's sprites.
     *
     * @param key the generation to get.
     * @return the Pokémon's sprites of a specific generation.
     */
    public @Nullable PokemonGenerationGameSprites getGenerationSprites(@NotNull String key) {
        return generationSprites.get(key);
    }
}
