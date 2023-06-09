package dev.greenadine.pokejava.model.pokemon.gender;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

public record SpeciesGenderRelation(@JsonProperty("pokemon_species") NamedApiResource pokemonSpecies,
                                    @JsonProperty("rate") int rate) {
}
