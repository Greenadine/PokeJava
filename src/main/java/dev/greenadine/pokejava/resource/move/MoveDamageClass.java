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
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.common.Description;
import dev.greenadine.pokejava.resource.common.Name;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Damage classes moves can have, e.g. physical, special, or non-damaging.
 */
@ResourcePath("move-damage-class")
public final class MoveDamageClass extends NamedApiResource implements NameLocalized, DescriptionLocalized {

    private final List<Description> descriptions;
    private final List<NamedApiResource> moves;
    private final List<Name> names;

    @JsonCreator
    private MoveDamageClass(@JsonProperty("id") int id,
                            @JsonProperty("name") String name,
                            @JsonProperty("descriptions") List<Description> descriptions,
                            @JsonProperty("moves") List<NamedApiResource> moves,
                            @JsonProperty("names") List<Name> names) {
        super(id, name);
        this.descriptions = descriptions;
        this.moves = moves;
        this.names = names;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    @Override
    public @NotNull List<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * Gets the moves that are of this damage class.
     *
     * @return the moves that are of this damage class.
     */
    public @NotNull List<NamedApiResource> getMoves() {
        return moves;
    }
}
