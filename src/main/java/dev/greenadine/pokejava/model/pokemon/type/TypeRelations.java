package dev.greenadine.pokejava.model.pokemon.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

import java.util.List;

public record TypeRelations(@JsonProperty("no_damage_to") List<NamedApiResource> noDamageTo,
                            @JsonProperty("half_damage_to") List<NamedApiResource> halfDamageTo,
                            @JsonProperty("double_damage_to") List<NamedApiResource> doubleDamageTo,
                            @JsonProperty("no_damage_from") List<NamedApiResource> noDamageFrom,
                            @JsonProperty("half_damage_from") List<NamedApiResource> halfDamageFrom,
                            @JsonProperty("double_damage_from") List<NamedApiResource> doubleDamageFrom) {
}
