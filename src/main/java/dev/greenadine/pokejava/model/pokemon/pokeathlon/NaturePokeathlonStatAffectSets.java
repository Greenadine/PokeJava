package dev.greenadine.pokejava.model.pokemon.pokeathlon;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Represents how a nature affects a Pokéathlon stat.
 *
 * @param increase a list of natures and how they change the referenced Pokéathlon stat.
 * @param decrease a list of natures and how they change the referenced Pokéathlon stat.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record NaturePokeathlonStatAffectSets(@JsonProperty("increase") List<NaturePokeathlonStatEffect> increase,
                                             @JsonProperty("decrease") List<NaturePokeathlonStatEffect> decrease) {
}
