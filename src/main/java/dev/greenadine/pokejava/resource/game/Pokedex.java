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
import dev.greenadine.pokejava.resource.DescriptionLocalized;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.Description;
import dev.greenadine.pokejava.resource.common.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region, except the national dex and
 * some smaller dexes related to portions of a region.
 */
@ResourcePath("pokedex")
public final class Pokedex extends NamedApiResource implements NameLocalized, DescriptionLocalized {

    private final boolean isMainSeries;
    private final List<Description> descriptions;
    private final List<Name> names;
    private final List<PokemonEntry> pokemonEntries;
    private final NamedApiResource region;
    private final List<NamedApiResource> versionGroups;

    @JsonCreator
    private Pokedex(@JsonProperty("id") int id,
                    @JsonProperty("name") String name,
                    @JsonProperty("is_main_series") boolean isMainSeries,
                    @JsonProperty("descriptions") List<Description> descriptions,
                    @JsonProperty("names") List<Name> names,
                    @JsonProperty("pokemon_entries") List<PokemonEntry> pokemonEntries,
                    @JsonProperty("region") NamedApiResource region,
                    @JsonProperty("version_groups") List<NamedApiResource> versionGroups) {
        super(id, name);
        this.isMainSeries = isMainSeries;
        this.descriptions = descriptions;
        this.names = names;
        this.pokemonEntries = pokemonEntries;
        this.region = region;
        this.versionGroups = versionGroups;
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
     * Whether this Pokédex originated in the main series of the video games.
     *
     * @return {@code true} if this Pokédex originated in the main series of the video games; {@code false} otherwise.
     */
    public boolean isMainSeries() {
        return isMainSeries;
    }

    /**
     * Gets a list of Pokémon species entries.
     *
     * @return a list of Pokémon species entries.
     */
    public @NotNull List<PokemonEntry> getPokemonEntries() {
        return pokemonEntries;
    }

    /**
     * Gets the region this Pokédex is in.
     *
     * @return the region this Pokédex is in.
     */
    public @Nullable NamedApiResource getRegion() {
        return region;
    }

    /**
     * Gets a list of version groups this Pokédex is relevant to.
     *
     * @return a list of version groups this Pokédex is relevant to.
     */
    public @Nullable List<NamedApiResource> getVersionGroups() {
        return versionGroups;
    }
}
