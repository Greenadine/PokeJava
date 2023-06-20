package dev.greenadine.pokejava.model.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.VerboseEffect;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Past move stat values are used to describe move power and type effectiveness in past games.
 *
 * @param accuracy the percent value of how likely this move is to be successful.
 * @param effectChance the percent value of how likely it is this moves effect will happen.
 * @param power the base power of this move with a value of 0 if it does not have a base power.
 * @param pp the effect of this move listed in different languages.
 * @param effectEntries the elemental type of this move.
 * @param type the version group in which these move stat values were in effect.
 * @param versionGroup the version group in which these move stat values were in effect.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record PastMoveStatValues(@JsonProperty("accuracy") int accuracy,
                                 @JsonProperty("effect_chance") int effectChance,
                                 @JsonProperty("power") int power,
                                 @JsonProperty("pp") int pp,
                                 @JsonProperty("effect_entries") List<VerboseEffect> effectEntries,
                                 @JsonProperty("type") NamedApiResource type,
                                 @JsonProperty("version_group") NamedApiResource versionGroup) {
}
