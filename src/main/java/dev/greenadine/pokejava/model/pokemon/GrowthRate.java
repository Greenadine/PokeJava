package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;
import dev.greenadine.pokejava.model.common.Description;

import java.util.List;

/**
 * Represents a Pokémon growth rate.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class GrowthRate extends NamedApiResource {

    private final String formula;
    private final List<Description> descriptions;
    private final List<GrowthRateExperienceLevel> levels;
    private final List<NamedApiResource> pokemonSpecies;

    protected GrowthRate(@JsonProperty("id") int id,
                         @JsonProperty("name") String name,
                         @JsonProperty("formula") String formula,
                         @JsonProperty("descriptions") List<Description> descriptions,
                         @JsonProperty("levels") List<GrowthRateExperienceLevel> levels,
                         @JsonProperty("pokemon_species") List<NamedApiResource> pokemonSpecies) {
        super(id, "growth-rate", name);

        this.formula = formula;
        this.descriptions = descriptions;
        this.levels = levels;
        this.pokemonSpecies = pokemonSpecies;
    }

    /**
     * Gets the formula used to calculate the rate at which the Pokémon species gains level.
     *
     * @return the formula used to calculate the rate at which the Pokémon species gains level.
     */
    public String getFormula() {
        return formula;
    }

    /**
     * Gets the descriptions of this growth rate listed in different languages.
     *
     * @return the descriptions of this growth rate listed in different languages.
     */
    public List<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * Gets the levels and the amount of experienced needed to attain them based on this growth rate.
     *
     * @return the levels and the amount of experienced needed to attain them based on this growth rate.
     */
    public List<GrowthRateExperienceLevel> getLevels() {
        return levels;
    }

    /**
     * Gets the Pokémon species that gain levels at this growth rate.
     *
     * @return the Pokémon species that gain levels at this growth rate.
     */
    public List<NamedApiResource> getPokemonSpecies() {
        return pokemonSpecies;
    }
}
