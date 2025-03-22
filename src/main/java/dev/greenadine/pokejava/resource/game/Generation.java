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
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not
 * exist in the previous generation are released.
 */
@ResourcePath("generation")
public final class Generation extends NamedApiResource implements NameLocalized {

    private final NamedApiResource mainRegion;
    private final List<NamedApiResource> abilities;
    private final List<Name> names;
    private final List<NamedApiResource> moves;
    private final List<NamedApiResource> pokemonSpecies;
    private final List<NamedApiResource> types;
    private final List<NamedApiResource> versionGroups;

    @JsonCreator
    private Generation(@JsonProperty("id") int id,
                       @JsonProperty("name") String name,
                       @JsonProperty("main_region") NamedApiResource mainRegion,
                       @JsonProperty("abilities") List<NamedApiResource> abilities,
                       @JsonProperty("names") List<Name> names,
                       @JsonProperty("moves") List<NamedApiResource> moves,
                       @JsonProperty("pokemon_species") List<NamedApiResource> pokemonSpecies,
                       @JsonProperty("types") List<NamedApiResource> types,
                       @JsonProperty("version_groups") List<NamedApiResource> versionGroups) {
        super(id, name);
        this.abilities = abilities;
        this.names = names;
        this.mainRegion = mainRegion;
        this.moves = moves;
        this.pokemonSpecies = pokemonSpecies;
        this.types = types;
        this.versionGroups = versionGroups;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets a list of abilities that were introduced in this generation.
     *
     * @return a list of abilities that were introduced in this generation.
     */
    public @Nullable List<NamedApiResource> getAbilities() {
        return abilities;
    }

    /**
     * Gets the main region travelled in this generation.
     *
     * @return the main region travelled in this generation.
     */
    public @NotNull NamedApiResource getMainRegion() {
        return mainRegion;
    }

    /**
     * Gets a list of moves that were introduced in this generation.
     *
     * @return a list of moves that were introduced in this generation.
     */
    public @NotNull List<NamedApiResource> getMoves() {
        return moves;
    }

    /**
     * Gets a list of Pokémon species that were introduced in this generation.
     *
     * @return a list of Pokémon species that were introduced in this generation.
     */
    public @NotNull List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }

    /**
     * Gets a list of types that were introduced in this generation.
     *
     * @return a list of types that were introduced in this generation.
     */
    public @Nullable List<NamedApiResource> getTypes() {
        return types;
    }

    /**
     * Gets a list of version groups that were introduced in this generation.
     *
     * @return a list of version groups that were introduced in this generation.
     */
    public @NotNull List<NamedApiResource> getVersionGroups() {
        return versionGroups;
    }
}
