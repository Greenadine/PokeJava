package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a characteristic.
 *
 * @param id the ID of the characteristic.
 * @param geneModulo the gene modulo of the characteristic.
 * @param possibleValues the possible values of the characteristic.
 * @param highestStat the highest stat of the characteristic.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record Characteristic(@JsonProperty("id") int id,
                             @JsonProperty("gene_modulo") int geneModulo,
                             @JsonProperty("possible_values") int[] possibleValues,
                             @JsonProperty("highest_stat") int highestStat) {
}
