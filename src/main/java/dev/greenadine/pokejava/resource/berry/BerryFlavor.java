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
package dev.greenadine.pokejava.resource.berry;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.Name;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their nature.
 */
@ResourcePath("berry-flavor")
public final class BerryFlavor extends NamedApiResource implements NameLocalized {

    private final List<FlavorBerryMap> berries;
    private final NamedApiResource contestType;
    private final List<Name> names;

    @JsonCreator
    private BerryFlavor(@JsonProperty("id") int id,
                        @JsonProperty("name") String name,
                        @JsonProperty("berries") List<FlavorBerryMap> berries,
                        @JsonProperty("contest_type") NamedApiResource contestType,
                        @JsonProperty("names") List<Name> names) {
        super(id, name);
        this.berries = berries;
        this.contestType = contestType;
        this.names = names;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets a list of the berries with this flavor.
     *
     * @return a list of the berries with this flavor.
     */
    public @NotNull List<FlavorBerryMap> getBerries() {
        return berries;
    }

    /**
     * Gets the contest type that correlates with this berry flavor.
     *
     * @return the contest type that correlates with this berry flavor.
     */
    public @NotNull NamedApiResource getContestType() {
        return contestType;
    }
}
