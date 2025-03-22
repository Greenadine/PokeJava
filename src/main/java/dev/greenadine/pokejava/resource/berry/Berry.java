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
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon.
 */
@ResourcePath("berry")
public final class Berry extends NamedApiResource {
    
    private final int growthTime;
    private final int maxHarvest;
    private final int naturalGiftPower;
    private final int size;
    private final int smoothness;
    private final int soilDryness;
    private final NamedApiResource firmness;
    private final List<BerryFlavorMap> flavors;
    private final NamedApiResource item;
    private final NamedApiResource naturalGiftType;

    @JsonCreator
    private Berry(@JsonProperty("id") int id,
                  @JsonProperty("name") String name,
                  @JsonProperty("growth_time") int growthTime,
                  @JsonProperty("max_harvest") int maxHarvest,
                  @JsonProperty("natural_gift_power") int naturalGiftPower,
                  @JsonProperty("size") int size,
                  @JsonProperty("smoothness") int smoothness,
                  @JsonProperty("soil_dryness") int soilDryness,
                  @JsonProperty("firmness") NamedApiResource firmness,
                  @JsonProperty("flavors") List<BerryFlavorMap> flavors,
                  @JsonProperty("item") NamedApiResource item,
                  @JsonProperty("natural_gift_type") NamedApiResource naturalGiftType) {
        super(id, name);
        this.growthTime = growthTime;
        this.maxHarvest = maxHarvest;
        this.naturalGiftPower = naturalGiftPower;
        this.size = size;
        this.smoothness = smoothness;
        this.soilDryness = soilDryness;
        this.firmness = firmness;
        this.flavors = flavors;
        this.item = item;
        this.naturalGiftType = naturalGiftType;
    }

    /**
     * Gets the time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
     * 
     * @return the time it takes the tree to grow one stage, in hours.
     */
    public int getGrowthTime() {
        return growthTime;
    }

    /**
     * Gets the maximum number of these berries that can grow on one tree in Generation IV.
     * 
     * @return the maximum number of these berries that can grow on one tree in Generation IV.
     */
    public int getMaxHarvest() {
        return maxHarvest;
    }

    /**
     * Gets the power of the move "Natural Gift" when used with this berry.
     * 
     * @return the power of the move "Natural Gift" when used with this berry.
     */
    public int getNaturalGiftPower() {
        return naturalGiftPower;
    }

    /**
     * Gets the size of this berry, in millimeters.
     * 
     * @return the size of this berry, in millimeters.
     */
    public int getSize() {
        return size;
    }

    /**
     * Gets the smoothness of this berry, used in making Pokéblocks or poffins.
     * 
     * @return the smoothness of this berry, used in making Pokéblocks or poffins.
     */
    public int getSmoothness() {
        return smoothness;
    }

    /**
     * Gets the soil dryness of this berry, used in growing it.
     * 
     * @return the soil dryness of this berry, used in growing it.
     */
    public int getSoilDryness() {
        return soilDryness;
    }

    /**
     * Gets the firmness of this berry, used in making Pokéblocks or poffins.
     * 
     * @return the firmness of this berry, used in making Pokéblocks or poffins.
     */
    public @NotNull NamedApiResource getFirmness() {
        return firmness;
    }

    /**
     * Gets a list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
     * 
     * @return a list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
     */
    public @NotNull List<BerryFlavorMap> getFlavors() {
        return flavors;
    }

    /**
     * Berries are actually items. This is a reference to the item specific data for this berry.
     *
     * @return the item specific data for this berry.
     */
    public @NotNull NamedApiResource getItem() {
        return item;
    }

    /**
     * The type inherited by "Natural Gift" when used with this Berry.
     *
     * @return the type inherited by "Natural Gift" when used with this Berry.
     */
    public @NotNull NamedApiResource getNaturalGiftType() {
        return naturalGiftType;
    }
}
