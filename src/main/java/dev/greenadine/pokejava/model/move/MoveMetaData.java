package dev.greenadine.pokejava.model.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Move metadata refers to the data that determines certain effects of a move.
 *
 * @param ailment the status ailment this move inflicts on its target.
 * @param category the category of move this move falls under, e.g. damage or ailment.
 * @param minHits the minimum number of times this move hits. Null if it always only hits once.
 * @param maxHits the maximum number of times this move hits. Null if it always only hits once.
 * @param minTurns the minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
 * @param maxTurns the maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
 * @param drain the amount of HP gained by the attacking Pokemon when it uses this move.
 * @param healing the amount of HP gained by the attacking Pokemon when it uses this move.
 * @param critRate the likelihood this attack will cause a critical hit.
 * @param ailmentChance the likelihood this attack will cause a status ailment.
 * @param flinchChance the likelihood this attack will cause the target Pokémon to flinch.
 * @param statChance the likelihood this attack will cause a stat change in the target Pokémon.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record MoveMetaData(@JsonProperty("ailment") NamedApiResource ailment,
                           @JsonProperty("category") NamedApiResource category,
                           @JsonProperty("min_hits") int minHits,
                           @JsonProperty("max_hits") int maxHits,
                           @JsonProperty("min_turns") int minTurns,
                           @JsonProperty("max_turns") int maxTurns,
                           @JsonProperty("drain") int drain,
                           @JsonProperty("healing") int healing,
                           @JsonProperty("crit_rate") int critRate,
                           @JsonProperty("ailment_chance") int ailmentChance,
                           @JsonProperty("flinch_chance") int flinchChance,
                           @JsonProperty("stat_chance") int statChance) {
}
