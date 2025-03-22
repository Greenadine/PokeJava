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
 * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
 */
@ResourcePath("location-area")
public final class LocationArea extends NamedApiResource implements NameLocalized {

    private final int gameIndex;
    private final List<EncounterMethodRate> encounterMethodRates;
    private final NamedApiResource location;
    private final List<Name> names;
    private final List<PokemonEncounter> pokemonEncounters;

    @JsonCreator
    private LocationArea(@JsonProperty("id") int id,
                         @JsonProperty("name") String name,
                         @JsonProperty("game_index") int gameIndex,
                         @JsonProperty("encounter_method_rates") List<EncounterMethodRate> encounterMethodRates,
                         @JsonProperty("location") NamedApiResource location,
                         @JsonProperty("names") List<Name> names,
                         @JsonProperty("pokemon_encounters") List<PokemonEncounter> pokemonEncounters) {
        super(id, name);
        this.gameIndex = gameIndex;
        this.encounterMethodRates = encounterMethodRates;
        this.location = location;
        this.names = names;
        this.pokemonEncounters = pokemonEncounters;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets the internal id of an API resource within game data.
     *
     * @return the internal id of an API resource within game data.
     */
    public int getGameIndex() {
        return gameIndex;
    }

    /**
     * Gets a list of possible methods a player could use to encounter Pokémon in the wild.
     *
     * @return a list of possible methods a player could use to encounter Pokémon in the wild.
     */
    public @NotNull List<EncounterMethodRate> getEncounterMethodRates() {
        return encounterMethodRates;
    }

    /**
     * Gets the location this area can be found in.
     *
     * @return the location this area can be found in.
     */
    public @NotNull NamedApiResource getLocation() {
        return location;
    }

    /**
     * Gets a list of Pokémon that can be encountered in this area along with details on levels and methods of encounter.
     *
     * @return a list of Pokémon that can be encountered in this area along with details on levels and methods of encounter.
     */
    public @NotNull List<PokemonEncounter> getPokemonEncounters() {
        return pokemonEncounters;
    }
}
