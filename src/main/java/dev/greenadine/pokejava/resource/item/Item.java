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
import dev.greenadine.pokejava.resource.ApiResource;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.*;
import dev.greenadine.pokejava.resource.machine.MachineVersionDetail;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or
 * to access a new area.
 */
@ResourcePath("item")
public final class Item extends NamedApiResource implements NameLocalized {

    private final int cost;
    private final Integer flingPower;
    private final NamedApiResource flingEffect;
    private final List<NamedApiResource> attributes;
    private final NamedApiResource category;
    private final List<VerboseEffect> effectEntries;
    private final List<VersionGroupFlavorText> flavorTextEntries;
    private final List<GenerationGameIndex> gameIndices;
    private final List<Name> names;
    private final ItemSprites sprites;
    private final List<ItemHolderPokemon> heldByPokemon;
    private final ApiResource babyTriggerFor;
    private final List<MachineVersionDetail> machines;

    @JsonCreator
    private Item(@JsonProperty("id") int id,
                 @JsonProperty("name") String name,
                 @JsonProperty("cost") int cost,
                 @JsonProperty("fling_power") Integer flingPower,
                 @JsonProperty("fling_effect") NamedApiResource flingEffect,
                 @JsonProperty("attributes") List<NamedApiResource> attributes,
                 @JsonProperty("category") NamedApiResource category,
                 @JsonProperty("effect_entries") List<VerboseEffect> effectEntries,
                 @JsonProperty("flavor_text_entries") List<VersionGroupFlavorText> flavorTextEntries,
                 @JsonProperty("game_indices") List<GenerationGameIndex> gameIndices,
                 @JsonProperty("names") List<Name> names,
                 @JsonProperty("sprites") ItemSprites sprites,
                 @JsonProperty("held_by_pokemon") List<ItemHolderPokemon> heldByPokemon,
                 @JsonProperty("baby_trigger_for") ApiResource babyTriggerFor,
                 @JsonProperty("machines") List<MachineVersionDetail> machines) {
        super(id, name);
        this.cost = cost;
        this.flingPower = flingPower;
        this.flingEffect = flingEffect;
        this.attributes = attributes;
        this.category = category;
        this.effectEntries = effectEntries;
        this.flavorTextEntries = flavorTextEntries;
        this.gameIndices = gameIndices;
        this.names = names;
        this.sprites = sprites;
        this.heldByPokemon = heldByPokemon;
        this.babyTriggerFor = babyTriggerFor;
        this.machines = machines;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets the cost of the item in stores.
     *
     * @return the cost of the item.
     */
    public int getCost() {
        return cost;
    }

    /**
     * Gets the power of the move Fling when used with this item.
     *
     * @return the power of the move Fling.
     */
    public @NotNull Integer getFlingPower() {
        return flingPower;
    }

    /**
     * Gets the effect of the move Fling when used with this item.
     *
     * @return the effect of the move Fling.
     */
    public @Nullable NamedApiResource getFlingEffect() {
        return flingEffect;
    }

    /**
     * Gets a list of attributes this item has.
     *
     * @return a list of attributes.
     */
    public @NotNull List<NamedApiResource> getAttributes() {
        return attributes;
    }

    /**
     * Gets the category of items this item falls into.
     *
     * @return the category of items.
     */
    public @NotNull NamedApiResource getCategory() {
        return category;
    }

    /**
     * Gets a list of effect descriptions of the item.
     *
     * @return a list of effect descriptions.
     */
    public @NotNull List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }

    /**
     * Gets a list of flavor text entries of the item.
     *
     * @return a list of flavor text entries.
     */
    public @NotNull List<VersionGroupFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    /**
     * Gets a list of generation game indices of the item.
     *
     * @return a list of generation game indices.
     */
    public @NotNull List<GenerationGameIndex> getGameIndices() {
        return gameIndices;
    }

    /**
     * Gets the sprites of the item.
     *
     * @return the sprites of the item.
     */
    public @NotNull ItemSprites getSprites() {
        return sprites;
    }

    /**
     * Gets a list of Pokémon that might be found in the wild holding the item.
     *
     * @return a list of Pokémon.
     */
    public @Nullable List<ItemHolderPokemon> getHeldByPokemon() {
        return heldByPokemon;
    }

    /**
     * Gets the item that a Pokémon would be holding when mating that would result in the Pokémon producing an egg that would hatch into this Pokémon.
     *
     * @return the item that a Pokémon would be holding.
     */
    public @Nullable ApiResource getBabyTriggerFor() {
        return babyTriggerFor;
    }

    /**
     * Gets a list of the machines related to the item.
     *
     * @return a list of machines.
     */
    public @Nullable List<MachineVersionDetail> getMachines() {
        return machines;
    }
}
