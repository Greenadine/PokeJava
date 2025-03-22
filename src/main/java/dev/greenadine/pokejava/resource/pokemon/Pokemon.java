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
package dev.greenadine.pokejava.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.VersionGameIndex;
import dev.greenadine.pokejava.resource.pokemon.sprite.PokemonSprites;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * A single Pokémon.
 */
@ResourcePath("pokemon")
public final class Pokemon extends NamedApiResource {

    private final int baseExperience;
    private final int height;
    private final boolean isDefault;
    private final int order;
    private final int weight;
    private final List<PokemonAbilityPast> abilities;
    private final List<NamedApiResource> forms;
    private final List<VersionGameIndex> gameIndices;
    private final List<PokemonHeldItem> heldItems;
    private final String locationAreaEncounters;
    private final List<PokemonMove> moves;
    private final List<PokemonTypePast> pastTypes;
    private final List<PokemonAbilityPast> pastAbilities;
    private final PokemonSprites sprites;
    private final PokemonCries cries;
    private final NamedApiResource species;
    private final List<PokemonStat> stats;
    private final List<PokemonType> types;

    @JsonCreator
    private Pokemon(@JsonProperty("id") int id,
                    @JsonProperty("name") String name,
                    @JsonProperty("base_experience") int baseExperience,
                    @JsonProperty("height") int height,
                    @JsonProperty("is_default") boolean isDefault,
                    @JsonProperty("order") int order,
                    @JsonProperty("weight") int weight,
                    @JsonProperty("abilities") List<PokemonAbilityPast> abilities,
                    @JsonProperty("forms") List<NamedApiResource> forms,
                    @JsonProperty("game_indices") List<VersionGameIndex> gameIndices,
                    @JsonProperty("held_items") List<PokemonHeldItem> heldItems,
                    @JsonProperty("location_area_encounters") String locationAreaEncounters,
                    @JsonProperty("moves") List<PokemonMove> moves,
                    @JsonProperty("past_types") List<PokemonTypePast> pastTypes,
                    @JsonProperty("past_abilities") List<PokemonAbilityPast> pastAbilities,
                    @JsonProperty("sprites") PokemonSprites sprites,
                    @JsonProperty("cries") PokemonCries cries,
                    @JsonProperty("species") NamedApiResource species,
                    @JsonProperty("stats") List<PokemonStat> stats,
                    @JsonProperty("types") List<PokemonType> types) {
        super(id, name);
        this.baseExperience = baseExperience;
        this.height = height;
        this.isDefault = isDefault;
        this.order = order;
        this.weight = weight;
        this.abilities = abilities;
        this.forms = forms;
        this.gameIndices = gameIndices;
        this.heldItems = heldItems;
        this.locationAreaEncounters = locationAreaEncounters;
        this.moves = moves;
        this.pastTypes = pastTypes;
        this.pastAbilities = pastAbilities;
        this.sprites = sprites;
        this.cries = cries;
        this.species = species;
        this.stats = stats;
        this.types = types;
    }

    /**
     * Gets the base experience gained for defeating this Pokémon.
     *
     * @return the base experience gained for defeating this Pokémon.
     */
    public int getBaseExperience() {
        return baseExperience;
    }

    /**
     * Gets the height of this Pokémon in decimetres.
     *
     * @return the height of this Pokémon in decimetres.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets whether this Pokémon is the default form.
     *
     * @return {@code true} if this Pokémon is the default form, {@code false} otherwise.
     */
    public boolean isDefault() {
        return isDefault;
    }

    /**
     * Gets the order in which forms should be sorted within all forms.
     *
     * @return the order in which forms should be sorted within all forms.
     */
    public int getOrder() {
        return order;
    }

    /**
     * Gets the weight of this Pokémon in hectograms.
     *
     * @return the weight of this Pokémon in hectograms.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Gets a list of abilities this Pokémon could potentially have.
     *
     * @return a list of abilities this Pokémon could potentially have.
     */
    public @NotNull List<PokemonAbilityPast> getAbilities() {
        return abilities;
    }

    /**
     * Gets a list of forms this Pokémon can take on.
     *
     * @return a list of forms this Pokémon can take on.
     */
    public @NotNull List<NamedApiResource> getForms() {
        return forms;
    }

    /**
     * Gets a list of game indices relevant to Pokémon item by generation.
     *
     * @return a list of game indices relevant to Pokémon item by generation.
     */
    public @NotNull List<VersionGameIndex> getGameIndices() {
        return gameIndices;
    }

    /**
     * Gets a list of items this Pokémon may be holding when encountered.
     *
     * @return a list of items this Pokémon may be holding when encountered.
     */
    public @NotNull List<PokemonHeldItem> getHeldItems() {
        return heldItems;
    }

    /**
     * Gets a link to a list of location areas, as well as encounter details pertaining to specific versions.
     *
     * @return a link to a list of location areas, as well as encounter details pertaining to specific versions.
     */
    public @NotNull String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    /**
     * Gets a list of moves along with learn methods and level details pertaining to specific version groups.
     *
     * @return a list of moves along with learn methods and level details pertaining to specific version groups.
     */
    public @NotNull List<PokemonMove> getMoves() {
        return moves;
    }

    /**
     * Gets a list of past types this Pokémon has had.
     *
     * @return a list of past types this Pokémon has had.
     */
    public @NotNull List<PokemonTypePast> getPastTypes() {
        return pastTypes;
    }

    /**
     * Gets a list of past abilities this Pokémon has had.
     *
     * @return a list of past abilities this Pokémon has had.
     */
    public @NotNull List<PokemonAbilityPast> getPastAbilities() {
        return pastAbilities;
    }

    /**
     * Gets a set of sprites used to depict this Pokémon in the game.
     *
     * @return a set of sprites used to depict this Pokémon in the game.
     */
    public @NotNull PokemonSprites getSprites() {
        return sprites;
    }

    /**
     * A set of cries used to depict this Pokémon in the game.
     *
     * @return a set of cries used to depict this Pokémon in the game.
     */
    public @NotNull PokemonCries getCries() {
        return cries;
    }

    /**
     * Gets the species this Pokémon belongs to.
     *
     * @return the species this Pokémon belongs to.
     */
    public @NotNull NamedApiResource getSpecies() {
        return species;
    }

    /**
     * Gets a list of base stat values for this Pokémon.
     *
     * @return a list of base stat values for this Pokémon.
     */
    public @NotNull List<PokemonStat> getStats() {
        return stats;
    }

    /**
     * Gets a list of details showing types this Pokémon has.
     *
     * @return a list of details showing types this Pokémon has.
     */
    public @NotNull List<PokemonType> getTypes() {
        return types;
    }
}
