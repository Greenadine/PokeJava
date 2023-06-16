package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

import java.util.List;

/**
 * Represents a color used for sorting Pokémon in a Pokédex,
 * which is usually the color most apparent or covering each Pokémon's body.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class PokemonColor extends NamedApiResource {

    private final List<Name> names;
    private final List<NamedApiResource> pokemonSpecies;

    @JsonCreator
    public PokemonColor(@JsonProperty("id") int id,
                        @JsonProperty("name") String name,
                        @JsonProperty("names") List<Name> names,
                        @JsonProperty("pokemon_species") List<NamedApiResource> pokemonSpecies) {
        super(id, "pokemon-species", name);

        this.names = names;
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
     * Gets the names of the color in different languages.
     *
     * @return the names of the color in different languages.
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Gets the Pokémon species that have this color.
     *
     * @return the Pokémon species that have this color.
     */
    public List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }
}
