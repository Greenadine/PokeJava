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
package dev.greenadine.pokejava.resource.location;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.GenerationGameIndex;
import dev.greenadine.pokejava.resource.common.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
 */
@ResourcePath("location")
public final class Location extends NamedApiResource implements NameLocalized {

    private final NamedApiResource region;
    private final List<Name> names;
    private final List<GenerationGameIndex> gameIndices;
    private final List<NamedApiResource> areas;

    @JsonCreator
    private Location(@JsonProperty("id") int id,
                     @JsonProperty("name") String name,
                     @JsonProperty("region") NamedApiResource region,
                     @JsonProperty("names") List<Name> names,
                     @JsonProperty("game_indices") List<GenerationGameIndex> gameIndices,
                     @JsonProperty("areas") List<NamedApiResource> areas) {
        super(id, name);
        this.region = region;
        this.names = names;
        this.gameIndices = gameIndices;
        this.areas = areas;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets the region this location can be found in.
     *
     * @return the region this location can be found in.
     */
    public @Nullable NamedApiResource getRegion() {
        return region;
    }

    /**
     * Gets a list of game indices relevant to this location by generation.
     *
     * @return a list of game indices relevant to this location by generation.
     */
    public @NotNull List<GenerationGameIndex> getGameIndices() {
        return gameIndices;
    }

    /**
     * Gets a list of areas that can be found within this location.
     *
     * @return a list of areas that can be found within this location.
     */
    public @Nullable List<NamedApiResource> getAreas() {
        return areas;
    }
}
