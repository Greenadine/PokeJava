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
package dev.greenadine.pokejava.resource.pokemon.gender;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NamedApiResource;

import java.util.List;

/**
 * Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines.
 */
@ResourcePath("gender")
public final class Gender extends NamedApiResource {

    private final List<PokemonSpeciesGender> pokemonSpecies;
    private final List<NamedApiResource> requiredForEvolution;

    @JsonCreator
    private Gender(@JsonProperty("id") int id,
                   @JsonProperty("name") String name,
                   @JsonProperty("pokemon_species_details") List<PokemonSpeciesGender> pokemonSpecies,
                   @JsonProperty("required_for_evolution") List<NamedApiResource> requiredForEvolution) {
        super(id, name);
        this.pokemonSpecies = pokemonSpecies;
        this.requiredForEvolution = requiredForEvolution;
    }

    /**
     * Gets all relations between Pokémon and the gender.
     *
     * @return the relations between Pokémon and the gender.
     */
    public List<PokemonSpeciesGender> getPokemonSpecies() {
        return pokemonSpecies;
    }

    /**
     * Gets the Pokémon that have to be the gender to evolve.
     *
     * @return the Pokémon that have to be the gender to evolve.
     */
    public List<NamedApiResource> getRequiredForEvolution() {
        return requiredForEvolution;
    }
}
