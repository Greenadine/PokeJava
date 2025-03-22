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
package dev.greenadine.pokejava.resource.pokemon.shape;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.common.Name;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * A Pokémon shape.
 */
@ResourcePath("pokemon-shape")
public final class PokemonShape extends NamedApiResource implements NameLocalized {

    private final List<AwesomeName> awesomeNames;
    private final List<Name> names;
    private final List<NamedApiResource> pokemonSpecies;

    @JsonCreator
    private PokemonShape(@JsonProperty("id") int id,
                         @JsonProperty("name") String name,
                         @JsonProperty("awesome_names") List<AwesomeName> awesomeNames,
                         @JsonProperty("names") List<Name> names,
                         @JsonProperty("pokemon_species") List<NamedApiResource> pokemonSpecies) {
        super(id, name);
        this.awesomeNames = awesomeNames;
        this.names = names;
        this.pokemonSpecies = pokemonSpecies;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets the "scientific" names of the Pokémon shape.
     *
     * @return the "scientific" names of the Pokémon shape.
     */
    public @NotNull List<AwesomeName> getAwesomeNames() {
        return awesomeNames;
    }

    /**
     * Gets the Pokémon species that have this shape.
     *
     * @return the Pokémon species that have this shape.
     */
    public @NotNull List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }
}
