package dev.greenadine.pokejava.model.pokemon.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

public record TypePokemonRelation(@JsonProperty("slot") int slot,
                                  @JsonProperty("pokemon") NamedApiResource pokemon) {
}
