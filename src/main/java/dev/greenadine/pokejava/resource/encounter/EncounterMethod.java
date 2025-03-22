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
package dev.greenadine.pokejava.resource.encounter;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.Name;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass.
 */
@ResourcePath("encounter-method")
public final class EncounterMethod extends NamedApiResource implements NameLocalized {

    private final int order;
    private final List<Name> names;

    @JsonCreator
    private EncounterMethod(@JsonProperty("id") int id,
                            @JsonProperty("name") String name,
                            @JsonProperty("order") int order,
                            @JsonProperty("names") List<Name> names) {
        super(id, name);
        this.order = order;
        this.names = names;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets the order in which this encounter method should be sorted within the referenced encounter method type.
     *
     * @return the order in which this encounter method should be sorted within the referenced encounter method type.
     */
    public int getOrder() {
        return order;
    }
}
