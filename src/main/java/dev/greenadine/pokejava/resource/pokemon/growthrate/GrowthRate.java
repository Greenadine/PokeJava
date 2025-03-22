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
package dev.greenadine.pokejava.resource.pokemon.growthrate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.DescriptionLocalized;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.Description;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * A Pokémon growth rate.
 */
@ResourcePath("growth-rate")
public final class GrowthRate extends NamedApiResource implements DescriptionLocalized {

    private final String formula;
    private final List<Description> descriptions;
    private final List<GrowthRateExperienceLevel> levels;
    private final List<NamedApiResource> pokemonSpecies;

    @JsonCreator
    private GrowthRate(@JsonProperty("id") int id,
                       @JsonProperty("name") String name,
                       @JsonProperty("formula") String formula,
                       @JsonProperty("descriptions") List<Description> descriptions,
                       @JsonProperty("levels") List<GrowthRateExperienceLevel> levels,
                       @JsonProperty("pokemon_species") List<NamedApiResource> pokemonSpecies) {
        super(id, name);
        this.formula = formula;
        this.descriptions = descriptions;
        this.levels = levels;
        this.pokemonSpecies = pokemonSpecies;
    }

    @Override
    public @NotNull List<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * Gets the formula used to calculate the rate at which the Pokémon species gains level.
     *
     * @return the formula used to calculate the rate at which the Pokémon species gains level.
     */
    public @NotNull String getFormula() {
        return formula;
    }

    /**
     * Gets the levels and the amount of experienced needed to attain them based on this growth rate.
     *
     * @return the levels and the amount of experienced needed to attain them based on this growth rate.
     */
    public @NotNull List<GrowthRateExperienceLevel> getLevels() {
        return levels;
    }

    /**
     * Gets the Pokémon species that gain levels at this growth rate.
     *
     * @return the Pokémon species that gain levels at this growth rate.
     */
    public @NotNull List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }
}
