package dev.greenadine.pokejava.model.pokemon.ability;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.Effect;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

import java.util.List;

/**
 * Represents how a Pokémon's ability changes in effect when it is used on a Pokémon.
 *
 * @param effectEntries the previous effect of this ability listed in different languages.
 * @param versionGroup the version group in which the previous effect of this ability originated.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record AbilityEffectChange(@JsonProperty("effect_entries") List<Effect> effectEntries,
                                  @JsonProperty("version_group") NamedApiResource versionGroup) {
}
