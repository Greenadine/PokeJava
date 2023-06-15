package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

import java.util.List;

/**
 * Represents a gender of a Pokémon species.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class Gender extends NamedApiResource {

    private final List<SpeciesGenderRelation> speciesGenderRelationList;
    private final List<NamedApiResource> requiredForEvolution;

    public Gender(@JsonProperty("id") int id,
                  @JsonProperty("name") String name,
                  @JsonProperty("pokemon_species_details") List<SpeciesGenderRelation> speciesGenderRelationList,
                  @JsonProperty("required_for_evolution") List<NamedApiResource> requiredForEvolution) {
        super(id, "gender", name);

        this.speciesGenderRelationList = speciesGenderRelationList;
        this.requiredForEvolution = requiredForEvolution;
    }

    /**
     * Gets all relations between Pokémon and the gender.
     *
     * @return the relations between Pokémon and the gender.
     */
    public List<SpeciesGenderRelation> getSpeciesGenderRelationList() {
        return speciesGenderRelationList;
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
