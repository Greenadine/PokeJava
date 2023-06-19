package dev.greenadine.pokejava.model.pokemon.evolution;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Represents a link in an evolution chain.
 *
 * @param isBaby whether this link is for a baby Pokémon. This would only ever be true on the base link.
 * @param species the Pokémon species at this point in the evolution chain.
 * @param evolutionDetails the details for evolving this Pokémon species.
 * @param evolvesTo the next stage in this evolution chain.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record ChainLink(@JsonProperty("is_baby") boolean isBaby,
                        @JsonProperty("species") NamedApiResource species,
                        @JsonProperty("evolution_details") List<EvolutionDetail> evolutionDetails,
                        @JsonProperty("evolves_to") List<ChainLink> evolvesTo) {
}
