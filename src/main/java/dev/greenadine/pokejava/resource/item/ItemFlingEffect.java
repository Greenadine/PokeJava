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
package dev.greenadine.pokejava.resource.item;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.Effect;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * The various effects of the move "Fling" when used with different items.
 */
@ResourcePath("item-fling-effect")
public final class ItemFlingEffect extends NamedApiResource {

    private final List<Effect> effectEntries;
    private final List<NamedApiResource> items;

    @JsonCreator
    private ItemFlingEffect(@JsonProperty("id") int id,
                            @JsonProperty("name") String name,
                            @JsonProperty("effect_entries") List<Effect> effectEntries,
                            @JsonProperty("items") List<NamedApiResource> items) {
        super(id, name);
        this.effectEntries = effectEntries;
        this.items = items;
    }

    /**
     * Gets the result of this fling effect listed in different languages.
     *
     * @return the result of this fling effect listed in different languages.
     */
    public @NotNull List<Effect> getEffectEntries() {
        return effectEntries;
    }

    /**
     * Gets a list of items that have this fling effect.
     *
     * @return a list of items that have this fling effect.
     */
    public @NotNull List<NamedApiResource> getItems() {
        return items;
    }
}
