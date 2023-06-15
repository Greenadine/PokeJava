package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.Description;
import dev.greenadine.pokejava.model.resource.ApiResource;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

import java.util.List;

/**
 * Represents a characteristic.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class Characteristic extends ApiResource {

    private final int geneModulo;
    private final int[] possibleValues;
    private final NamedApiResource highestStat;
    private final List<Description> descriptions;

    @JsonCreator
    public Characteristic(@JsonProperty("id") int id,
                          @JsonProperty("gene_modulo") int geneModulo,
                          @JsonProperty("possible_values") int[] possibleValues,
                          @JsonProperty("highest_stat") NamedApiResource highestStat,
                          @JsonProperty("descriptions") List<Description>  descriptions) {
        super(id, "characteristic");

        this.geneModulo = geneModulo;
        this.possibleValues = possibleValues;
        this.highestStat = highestStat;
        this.descriptions = descriptions;
    }

    /**
     * Gets the gene modulo of the characteristic.
     *
     * @return the gene modulo of the characteristic.
     */
    public int getGeneModulo() {
        return geneModulo;
    }

    /**
     * Gets the possible values of the characteristic.
     *
     * @return the possible values of the characteristic.
     */
    public int[] getPossibleValues() {
        return possibleValues;
    }

    /**
     * Gets the highest stat of the characteristic.
     *
     * @return the highest stat of the characteristic.
     */
    public NamedApiResource getHighestStat() {
        return highestStat;
    }

    /**
     * Gets the descriptions of the characteristic.
     *
     * @return the descriptions of the characteristic.
     */
    public List<Description>  getDescriptions() {
        return descriptions;
    }
}
