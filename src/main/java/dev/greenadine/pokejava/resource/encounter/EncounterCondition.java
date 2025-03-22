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
 * Conditions which affect what Pokémon might appear in the wild, e.g., day or night.
 */
@ResourcePath("encounter-condition")
public final class EncounterCondition extends NamedApiResource implements NameLocalized {

    private final List<Name> names;
    private final List<NamedApiResource> values;

    @JsonCreator
    private EncounterCondition(@JsonProperty("id") int id,
                               @JsonProperty("name") String name,
                               @JsonProperty("names") List<Name> names,
                               @JsonProperty("values") List<NamedApiResource> values) {
        super(id, name);
        this.names = names;
        this.values = values;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets the possible values of this encounter condition.
     *
     * @return the possible values of this encounter condition.
     */
    public @NotNull List<NamedApiResource> getValues() {
        return values;
    }
}
