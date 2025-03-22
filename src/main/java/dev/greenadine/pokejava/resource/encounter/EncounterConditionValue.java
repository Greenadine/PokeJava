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
 * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
 */
@ResourcePath("encounter-condition-value")
public final class EncounterConditionValue extends NamedApiResource implements NameLocalized {

    private final NamedApiResource condition;
    private final List<Name> names;

    @JsonCreator
    private EncounterConditionValue(@JsonProperty("id") int id,
                                    @JsonProperty("name") String name,
                                    @JsonProperty("condition") NamedApiResource condition,
                                    @JsonProperty("names") List<Name> names) {
        super(id, name);
        this.condition = condition;
        this.names = names;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets the condition this encounter condition value pertains to.
     *
     * @return the condition this encounter condition value pertains to.
     */
    public @NotNull NamedApiResource getCondition() {
        return condition;
    }
}
