package dev.greenadine.pokejava.model.pokemon.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

import java.util.List;

/**
 * Represents how effective a type is towards another type.
 *
 * @param noDamageTo a list of types which have no effect on the referenced type.
 * @param halfDamageTo a list of types which have half damage on the referenced type.
 * @param doubleDamageTo a list of types which have double damage on the referenced type.
 * @param noDamageFrom a list of types which the referenced type has no effect on.
 * @param halfDamageFrom a list of types which have half damage from the referenced type.
 * @param doubleDamageFrom a list of types which have double damage from the referenced type.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record TypeRelations(@JsonProperty("no_damage_to") List<NamedApiResource> noDamageTo,
                            @JsonProperty("half_damage_to") List<NamedApiResource> halfDamageTo,
                            @JsonProperty("double_damage_to") List<NamedApiResource> doubleDamageTo,
                            @JsonProperty("no_damage_from") List<NamedApiResource> noDamageFrom,
                            @JsonProperty("half_damage_from") List<NamedApiResource> halfDamageFrom,
                            @JsonProperty("double_damage_from") List<NamedApiResource> doubleDamageFrom) {
}
