/*
 * Copyright © 2025 Kevin "Greenadine" Zuman (kevin@greenadine.dev)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.greenadine.pokejava.resource.pokemon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.ApiResource;
import dev.greenadine.pokejava.resource.DescriptionLocalized;
import dev.greenadine.pokejava.resource.common.Description;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo).
 */
@ResourcePath("characteristic")
public final class Characteristic extends ApiResource implements DescriptionLocalized {

    private final int geneModulo;
    private final int[] possibleValues;
    private final NamedApiResource highestStat;
    private final List<Description> descriptions;

    @JsonCreator
    private Characteristic(@JsonProperty("id") int id,
                           @JsonProperty("gene_modulo") int geneModulo,
                           @JsonProperty("possible_values") int[] possibleValues,
                           @JsonProperty("highest_stat") NamedApiResource highestStat,
                           @JsonProperty("descriptions") List<Description>  descriptions) {
        super(id);
        this.geneModulo = geneModulo;
        this.possibleValues = possibleValues;
        this.highestStat = highestStat;
        this.descriptions = descriptions;
    }

    @Override
    public @NotNull List<Description> getDescriptions() {
        return descriptions;
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
    public @NotNull NamedApiResource getHighestStat() {
        return highestStat;
    }
}
