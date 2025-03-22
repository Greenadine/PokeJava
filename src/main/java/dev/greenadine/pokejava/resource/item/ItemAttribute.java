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
import dev.greenadine.pokejava.resource.DescriptionLocalized;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.Description;
import dev.greenadine.pokejava.resource.common.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Item attributes define particular aspects of items, e.g. "usable in battle" or "consumable".
 */
@ResourcePath("item-attribute")
public final class ItemAttribute extends NamedApiResource implements NameLocalized, DescriptionLocalized {

    private final List<NamedApiResource> items;
    private final List<Name> names;
    private final List<Description> descriptions;

    @JsonCreator
    private ItemAttribute(@JsonProperty("id") int id,
                          @JsonProperty("name") String name,
                          @JsonProperty("items") List<NamedApiResource> items,
                          @JsonProperty("names") List<Name> names,
                          @JsonProperty("descriptions") List<Description> descriptions) {
        super(id, name);
        this.items = items;
        this.names = names;
        this.descriptions = descriptions;
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
     * Gets a list of items that have this attribute.
     *
     * @return a list of items that have this attribute.
     */
    public @Nullable List<NamedApiResource> getItems() {
        return items;
    }
}
