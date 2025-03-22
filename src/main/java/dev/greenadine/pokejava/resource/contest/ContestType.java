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
package dev.greenadine.pokejava.resource.contest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests.
 */
@ResourcePath("contest-type")
public final class ContestType extends NamedApiResource {

    private final NamedApiResource berryFlavor;
    private final List<ContestName> names;

    @JsonCreator
    private ContestType(@JsonProperty("id") int id,
                        @JsonProperty("name") String name,
                        @JsonProperty("berry_flavor") NamedApiResource berryFlavor,
                        @JsonProperty("names") List<ContestName> names) {
        super(id, name);
        this.berryFlavor = berryFlavor;
        this.names = names;
    }

    /**
     * Gets the berry flavor of this contest type.
     *
     * @return the berry flavor of this contest type.
     */
    public @NotNull NamedApiResource getBerryFlavor() {
        return berryFlavor;
    }

    /**
     * Gets the name of this contest type in different languages.
     *
     * @return the name of this contest type in different languages.
     */
    public @NotNull List<ContestName> getNames() {
        return names;
    }
}
