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

import java.util.List;

/**
 * Item categories determine where items will be placed in the players bag.
 */
@ResourcePath("item-category")
public final class ItemCategory extends NamedApiResource implements NameLocalized, DescriptionLocalized {

    private final List<NamedApiResource> items;
    private final List<Name> names;
    private final List<Description> descriptions;
    private final NamedApiResource pocket;

    @JsonCreator
    private ItemCategory(@JsonProperty("id") int id,
                         @JsonProperty("name") String name,
                         @JsonProperty("items") List<NamedApiResource> items,
                         @JsonProperty("names") List<Name> names,
                         @JsonProperty("descriptions") List<Description> descriptions,
                         @JsonProperty("pocket") NamedApiResource pocket) {
        super(id, name);
        this.items = items;
        this.names = names;
        this.descriptions = descriptions;
        this.pocket = pocket;
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
     * Gets a list of items that are a part of this category.
     *
     * @return a list of items that are a part of this category.
     */
    public @NotNull List<NamedApiResource> getItems() {
        return items;
    }

    /**
     * Gets the pocket items in this category would be put in.
     *
     * @return the pocket items in this category would be put in.
     */
    public @NotNull NamedApiResource getPocket() {
        return pocket;
    }
}
