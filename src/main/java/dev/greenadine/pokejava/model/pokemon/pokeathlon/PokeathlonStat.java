package dev.greenadine.pokejava.model.pokemon.pokeathlon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

import java.util.List;

/**
 * Represents a Pokéathlon stat.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class PokeathlonStat extends NamedApiResource {

    private final List<Name> names;
    private final NaturePokeathlonStatAffectSets affectingNatures;

    @JsonCreator
    public PokeathlonStat(@JsonProperty("int") int id,
                          @JsonProperty("name") String name,
                          @JsonProperty("names") List<Name> names,
                          @JsonProperty("affecting_natures") NaturePokeathlonStatAffectSets affectingNatures) {
        super(id, "pokeathlon-stat", name);

        this.names = names;
        this.affectingNatures = affectingNatures;
    }

    /**
     * Gets the name of this Pokéathlon stat listed in different languages.
     *
     * @return the name of this Pokéathlon stat listed in different languages.
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Gets the nature that effects this Pokéathlon stat positively or negatively.
     *
     * @return the nature that effects this Pokéathlon stat positively or negatively.
     */
    public NaturePokeathlonStatAffectSets getAffectingNatures() {
        return affectingNatures;
    }
}
