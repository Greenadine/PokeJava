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
package dev.greenadine.pokejava.resource.move;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.DescriptionLocalized;
import dev.greenadine.pokejava.resource.common.Description;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Move categories are properties of moves that determine on what targets it can be used on.
 */
@ResourcePath("move-category")
public final class MoveCategory extends NamedApiResource implements DescriptionLocalized {

    private final List<NamedApiResource> moves;
    private final List<Description> descriptions;

    @JsonCreator
    private MoveCategory(@JsonProperty("id") int id,
                         @JsonProperty("name") String name,
                         @JsonProperty("moves") List<NamedApiResource> moves,
                         @JsonProperty("descriptions") List<Description> descriptions) {
        super(id, name);
        this.moves = moves;
        this.descriptions = descriptions;
    }

    @Override
    public @NotNull List<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * Gets the moves that are in this category.
     *
     * @return the moves that are in this category.
     */
    public @NotNull List<NamedApiResource> getMoves() {
        return moves;
    }
}
