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
 * Mapping of a type's sprites for each generation.
 *
 * @see Type
 */
public final class TypeGenerationSprites {

    private final Map<String, TypeGenerationGameSprites> generationSprites = new HashMap<>();

    @JsonCreator
    private TypeGenerationSprites() {}

    @JsonAnySetter
    private void setGenerationSprites(String key, TypeGenerationGameSprites value) {
        generationSprites.put(key, value);
    }

    /**
     * Gets all of a type's sprites for each generation.
     *
     * @return all of a type's sprites for each generation.
     */
    public @NotNull Map<String, TypeGenerationGameSprites> getGenerationSprites() {
        return generationSprites;
    }

    /**
     * Gets a specific generation of this type's sprites.
     *
     * @param key the generation to get.
     * @return the type's sprites of a specific generation.
     */
    public @Nullable TypeGenerationGameSprites getGenerationSprites(@NotNull String key) {
        return generationSprites.get(key);
    }
}
