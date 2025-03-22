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
package dev.greenadine.pokejava.resource.game;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Version groups categorize highly similar versions of the games.
 */
@ResourcePath("version-group")
public final class VersionGroup extends NamedApiResource {

    private final int order;
    private final NamedApiResource generation;
    private final List<NamedApiResource> moveLearnMethods;
    private final List<NamedApiResource> pokedexes;
    private final List<NamedApiResource> regions;
    private final List<NamedApiResource> versions;

    @JsonCreator
    private VersionGroup(@JsonProperty("id") int id,
                         @JsonProperty("name") String name,
                         @JsonProperty("order") int order,
                         @JsonProperty("generation") NamedApiResource generation,
                         @JsonProperty("move_learn_methods") List<NamedApiResource> moveLearnMethods,
                         @JsonProperty("pokedexes") List<NamedApiResource> pokedexes,
                         @JsonProperty("regions") List<NamedApiResource> regions,
                         @JsonProperty("versions") List<NamedApiResource> versions) {
        super(id, name);
        this.order = order;
        this.generation = generation;
        this.moveLearnMethods = moveLearnMethods;
        this.pokedexes = pokedexes;
        this.regions = regions;
        this.versions = versions;
    }

    /**
     * Gets the order for sorting. Almost by date of release, except similar versions are grouped together.
     *
     * @return the order for sorting.
     */
    public int getOrder() {
        return order;
    }

    /**
     * Gets the generation this version was introduced in.
     *
     * @return the generation this version was introduced in.
     */
    public @NotNull NamedApiResource getGeneration() {
        return generation;
    }

    /**
     * Gets a list of methods in which Pokémon can learn moves in this version group.
     *
     * @return a list of methods in which Pokémon can learn moves in this version group.
     */
    public @Nullable List<NamedApiResource> getMoveLearnMethods() {
        return moveLearnMethods;
    }

    /**
     * Gets a list of Pokédexes introduced in this version group.
     *
     * @return a list of Pokédexes introduced in this version group.
     */
    public @NotNull List<NamedApiResource> getPokedexes() {
        return pokedexes;
    }

    /**
     * Gets a list of regions that can be visited in this version group.
     *
     * @return a list of regions that can be visited in this version group.
     */
    public @NotNull List<NamedApiResource> getRegions() {
        return regions;
    }

    /**
     * Gets the versions this version group owns.
     *
     * @return the versions this version group owns.
     */
    public @NotNull List<NamedApiResource> getVersions() {
        return versions;
    }
}
