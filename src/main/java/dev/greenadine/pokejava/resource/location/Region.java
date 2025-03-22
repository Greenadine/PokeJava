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
import dev.greenadine.pokejava.resource.common.Name;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
 */
@ResourcePath("region")
public final class Region extends NamedApiResource implements NameLocalized {

    private final List<NamedApiResource> locations;
    private final List<Name> names;
    private final NamedApiResource mainGeneration;
    private final List<NamedApiResource> pokedexes;
    private final List<NamedApiResource> versionGroups;

    @JsonCreator
    private Region(@JsonProperty("id") int id,
                   @JsonProperty("name") String name,
                   @JsonProperty("locations") List<NamedApiResource> locations,
                   @JsonProperty("names") List<Name> names,
                   @JsonProperty("main_generation") NamedApiResource mainGeneration,
                   @JsonProperty("pokedexes") List<NamedApiResource> pokedexes,
                   @JsonProperty("version_groups") List<NamedApiResource> versionGroups) {
        super(id, name);
        this.locations = locations;
        this.names = names;
        this.mainGeneration = mainGeneration;
        this.pokedexes = pokedexes;
        this.versionGroups = versionGroups;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets a list of locations that can be found in this region.
     *
     * @return A list of locations that can be found in this region.
     */
    public @NotNull List<NamedApiResource> getLocations() {
        return locations;
    }

    /**
     * Gets the generation this region was introduced in.
     *
     * @return The generation this region was introduced in.
     */
    public @NotNull NamedApiResource getMainGeneration() {
        return mainGeneration;
    }

    /**
     * Gets a list of Pokédexes that catalogue Pokémon in this region.
     *
     * @return A list of Pokédexes that catalogue Pokémon in this region.
     */
    public @NotNull List<NamedApiResource> getPokedexes() {
        return pokedexes;
    }

    /**
     * Gets a list of version groups where this region can be visited.
     *
     * @return A list of version groups where this region can be visited.
     */
    public @NotNull List<NamedApiResource> getVersionGroups() {
        return versionGroups;
    }
}
