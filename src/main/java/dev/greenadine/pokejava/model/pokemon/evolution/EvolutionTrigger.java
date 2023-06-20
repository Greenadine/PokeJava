package dev.greenadine.pokejava.model.pokemon.evolution;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.Category;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Represents an evolution trigger.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@Category("evolution-trigger")
public class EvolutionTrigger extends NamedApiResource {

    private final List<Name> names;
    private final List<NamedApiResource> pokemonSpecies;

    public EvolutionTrigger(@JsonProperty("id") int id,
                            @JsonProperty("name") String name,
                            @JsonProperty("names") List<Name> names,
                            @JsonProperty("pokemon_species") List<NamedApiResource> pokemonSpecies) {
        super(id, name);

        this.names = names;
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
     * Gets the localized names for this evolution trigger.
     *
     * @return the localized names for this evolution trigger.
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Gets the Pokémon species that result from this evolution trigger.
     *
     * @return the Pokémon species that result from this evolution trigger.
     */
    public List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }
}
