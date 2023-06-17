package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class EggGroup extends NamedApiResource {

    private final List<Name> names;
    private final List<NamedApiResource> pokemonSpecies;

    @JsonCreator
    public EggGroup(@JsonProperty("id") int id,
                    @JsonProperty("name") String name,
                    @JsonProperty("names") List<Name> names,
                    @JsonProperty("pokemon_species") List<NamedApiResource> pokemonSpecies) {
        super(id, "egg-group", name);

        this.names = names;
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
     * Gets the name of this egg group listed in different languages.
     *
     * @return the name of this egg group listed in different languages.
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Gets all Pokémon species that are members of this egg group.
     *
     * @return all Pokémon species that are members of this egg group.
     */
    public List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }
}
