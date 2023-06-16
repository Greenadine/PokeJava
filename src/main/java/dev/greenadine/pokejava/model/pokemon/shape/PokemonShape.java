package dev.greenadine.pokejava.model.pokemon.shape;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

import java.util.List;

/**
 * Represents a Pokémon shape.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class PokemonShape extends NamedApiResource {

    private final List<AwesomeName> awesoneNames;
    private final List<Name> names;
    private final List<NamedApiResource> pokemonSpecies;

    public PokemonShape(@JsonProperty("id") int id,
                        @JsonProperty("name") String name,
                        @JsonProperty("awesome_names") List<AwesomeName> awesomeNames,
                        @JsonProperty("names") List<Name> names,
                        @JsonProperty("pokemon_species") List<NamedApiResource> pokemonSpecies) {
        super(id, "pokemon-shape", name);

        this.awesoneNames = awesomeNames;
        this.names = names;
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
     * Gets the "scientific" names of the Pokémon shape.
     *
     * @return the "scientific" names of the Pokémon shape.
     */
    public List<AwesomeName> getAwesomeNames() {
        return awesoneNames;
    }

    /**
     * Gets the names of the Pokémon shape in different languages.
     *
     * @return the names of the Pokémon shape in different languages.
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Gets the Pokémon species that have this shape.
     *
     * @return the Pokémon species that have this shape.
     */
    public List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }
}
