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
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.Name;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * A color used for sorting Pokémon in a Pokédex, which is usually the color most apparent or covering each Pokémon's body.
 */
@ResourcePath("pokemon-color")
public final class PokemonColor extends NamedApiResource implements NameLocalized {

    private final List<NamedApiResource> pokemonSpecies;
    private final List<Name> names;

    @JsonCreator
    private PokemonColor(@JsonProperty("id") int id,
                         @JsonProperty("name") String name,
                         @JsonProperty("pokemon_species") List<NamedApiResource> pokemonSpecies,
                         @JsonProperty("names") List<Name> names) {
        super(id, name);
        this.pokemonSpecies = pokemonSpecies;
        this.names = names;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets the Pokémon species that have this color.
     *
     * @return the Pokémon species that have this color.
     */
    public @NotNull List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }
}
