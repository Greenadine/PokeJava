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
import dev.greenadine.pokejava.resource.common.Name;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups.
 */
@ResourcePath("egg-group")
public final class EggGroup extends NamedApiResource implements NameLocalized {

    private final List<Name> names;
    private final List<NamedApiResource> pokemonSpecies;

    @JsonCreator
    private EggGroup(@JsonProperty("id") int id,
                     @JsonProperty("name") String name,
                     @JsonProperty("names") List<Name> names,
                     @JsonProperty("pokemon_species") List<NamedApiResource> pokemonSpecies) {
        super(id, name);
        this.names = names;
        this.pokemonSpecies = pokemonSpecies;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets all Pokémon species that are members of this egg group.
     *
     * @return all Pokémon species that are members of this egg group.
     */
    public @NotNull List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }
}
