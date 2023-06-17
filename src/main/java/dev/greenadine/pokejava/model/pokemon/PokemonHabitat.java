package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Represents a habitat in which a Pokémon can be found.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class PokemonHabitat extends NamedApiResource {

    private final List<Name> names;
    private final List<NamedApiResource> pokemonSpecies;

    @JsonCreator
    public PokemonHabitat(@JsonProperty("id") int id,
                          @JsonProperty("name") String name,
                          @JsonProperty("names") List<Name> names,
                          @JsonProperty("pokemon_species") List<NamedApiResource> pokemonSpecies) {
        super(id, "pokemon-habitat", name);

        this.names = names;
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
     * Gets the names of the habitat in different languages.
     *
     * @return the names of the habitat in different languages.
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Gets the Pokémon species that can be found in this habitat.
     *
     * @return the Pokémon species that can be found in this habitat.
     */
    public List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }
}
