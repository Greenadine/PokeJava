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
package dev.greenadine.pokejava.resource.move;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.ApiResource;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.machine.MachineVersionDetail;
import dev.greenadine.pokejava.resource.common.Name;
import dev.greenadine.pokejava.resource.common.VerboseEffect;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.pokemon.ability.AbilityEffectChange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well,
 * usually for the purpose of removing obstacles or exploring new areas.
 */
@ResourcePath("move")
public final class Move extends NamedApiResource implements NameLocalized {

    private final int accuracy;
    private final int effectChance;
    private final int pp;
    private final int priority;
    private final int power;
    private final ContestComboSets contestCombos;
    private final NamedApiResource contestType;
    private final ApiResource contestEffect;
    private final NamedApiResource damageClass;
    private final List<VerboseEffect> effectEntries;
    private final List<AbilityEffectChange> effectChanges;
    private final List<NamedApiResource> learnedByPokemon;
    private final List<MoveFlavorText> flavorTextEntries;
    private final NamedApiResource generation;
    private final List<MachineVersionDetail> machines;
    private final MoveMetaData meta;
    private final List<Name> names;
    private final List<PastMoveStatValues> pastValues;
    private final List<MoveStatChange> statChanges;
    private final NamedApiResource superContestEffect;
    private final NamedApiResource target;
    private final NamedApiResource type;

    @JsonCreator
    private Move(@JsonProperty("id") int id,
                 @JsonProperty("name") String name,
                 @JsonProperty("accuracy") int accuracy,
                 @JsonProperty("effect_chance") int effectChance,
                 @JsonProperty("pp") int pp,
                 @JsonProperty("priority") int priority,
                 @JsonProperty("power") int power,
                 @JsonProperty("contest_combos") ContestComboSets contestCombos,
                 @JsonProperty("contest_type") NamedApiResource contestType,
                 @JsonProperty("contest_effect") ApiResource contestEffect,
                 @JsonProperty("damage_class") NamedApiResource damageClass,
                 @JsonProperty("effect_entries") List<VerboseEffect> effectEntries,
                 @JsonProperty("effect_changes") List<AbilityEffectChange> effectChanges,
                 @JsonProperty("learned_by_pokemon") List<NamedApiResource> learnedByPokemon,
                 @JsonProperty("flavor_text_entries") List<MoveFlavorText> flavorTextEntries,
                 @JsonProperty("generation") NamedApiResource generation,
                 @JsonProperty("machines") List<MachineVersionDetail> machines,
                 @JsonProperty("meta") MoveMetaData meta,
                 @JsonProperty("names") List<Name> names,
                 @JsonProperty("past_values") List<PastMoveStatValues> pastValues,
                 @JsonProperty("stat_changes") List<MoveStatChange> statChanges,
                 @JsonProperty("super_contest_effect") NamedApiResource superContestEffect,
                 @JsonProperty("target") NamedApiResource target,
                 @JsonProperty("type") NamedApiResource type) {
        super(id, name);
        this.accuracy = accuracy;
        this.effectChance = effectChance;
        this.pp = pp;
        this.priority = priority;
        this.power = power;
        this.contestCombos = contestCombos;
        this.contestType = contestType;
        this.contestEffect = contestEffect;
        this.damageClass = damageClass;
        this.effectEntries = effectEntries;
        this.effectChanges = effectChanges;
        this.learnedByPokemon = learnedByPokemon;
        this.flavorTextEntries = flavorTextEntries;
        this.generation = generation;
        this.machines = machines;
        this.meta = meta;
        this.names = names;
        this.pastValues = pastValues;
        this.statChanges = statChanges;
        this.superContestEffect = superContestEffect;
        this.target = target;
        this.type = type;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets the percent value of how likely this move is to be successful.
     *
     * @return the percent value of how likely this move is to be successful.
     */
    public int getAccuracy() {
        return accuracy;
    }

    /**
     * Gets the percent value of how likely it is this moves effect will happen.
     *
     * @return the percent value of how likely it is this moves effect will happen.
     */
    public int getEffectChance() {
        return effectChance;
    }

    /**
     * Gets the amount of power points; the number of times this move can be used.
     *
     * @return the amount of power points this move has.
     */
    public int getPp() {
        return pp;
    }

    /**
     * Gets the order in which the move is executed during battle.
     *
     * @return a value between -8 and 8, with 8 being the highest priority.
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Gets the base power of this move.
     *
     * @return the base power of this move, or 0 if it does not have a base power.
     */
    public int getPower() {
        return power;
    }

    /**
     * Gets a detail of normal and super contest combos that require this move.
     *
     * @return a detail of normal and super contest combos that require this move.
     */
    public @Nullable ContestComboSets getContestCombos() {
        return contestCombos;
    }

    /**
     * Gets the type of appeal this move gives a Pokémon when used in a contest.
     *
     * @return the type of appeal this move gives a Pokémon when used in a contest.
     */
    public @Nullable NamedApiResource getContestType() {
        return contestType;
    }

    /**
     * Gets the effect the move has when used in a contest.
     *
     * @return the effect the move has when used in a contest.
     */
    public @Nullable ApiResource getContestEffect() {
        return contestEffect;
    }

    /**
     * Gets the type of damage the move inflicts on the target, e.g. physical.
     *
     * @return the type of damage the move inflicts on the target, e.g. physical.
     */
    public @NotNull NamedApiResource getDamageClass() {
        return damageClass;
    }

    /**
     * Gets the effect of this move listed in different languages.
     *
     * @return the effect of this move listed in different languages.
     */
    public @NotNull List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }

    /**
     * Gets the list of previous effects this move has had across version groups of the games.
     *
     * @return the list of previous effects this move has had across version groups of the games.
     */
    public @Nullable List<AbilityEffectChange> getEffectChanges() {
        return effectChanges;
    }

    /**
     * Gets a list of Pokémon that can learn this move.
     *
     * @return a list of Pokémon that can learn this move.
     */
    public @NotNull List<NamedApiResource> getLearnedByPokemon() {
        return learnedByPokemon;
    }

    /**
     * Gets the flavor text of this move listed in different languages.
     *
     * @return the flavor text of this move listed in different languages.
     */
    public @NotNull List<MoveFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    /**
     * Gets the generation in which this move was introduced.
     *
     * @return the generation in which this move was introduced.
     */
    public @NotNull NamedApiResource getGeneration() {
        return generation;
    }

    /**
     * Gets the machines that teach this move.
     *
     * @return the machines that teach this move.
     */
    public @Nullable List<MachineVersionDetail> getMachines() {
        return machines;
    }

    /**
     * Gets metadata about this move.
     *
     * @return metadata about this move.
     */
    public @NotNull MoveMetaData getMeta() {
        return meta;
    }

    /**
     * Gets a list of move resource value changes across version groups of the game.
     *
     * @return a list of move resource value changes across version groups of the game.
     */
    public @Nullable List<PastMoveStatValues> getPastValues() {
        return pastValues;
    }

    /**
     * Gets a list of stats this moves effects and how much it effects them.
     *
     * @return a list of stats this moves effects and how much it effects them.
     */
    public @Nullable List<MoveStatChange> getStatChanges() {
        return statChanges;
    }

    /**
     * Gets the effect the move has when used in a super contest.
     *
     * @return the effect the move has when used in a super contest.
     */
    public @Nullable NamedApiResource getSuperContestEffect() {
        return superContestEffect;
    }

    /**
     * Gets the type of target that will receive the effects of the attack.
     *
     * @return the type of target that will receive the effects of the attack.
     */
    public @NotNull NamedApiResource getTarget() {
        return target;
    }

    /**
     * Gets the elemental type of this move.
     *
     * @return the elemental type of this move.
     */
    public @NotNull NamedApiResource getType() {
        return type;
    }
}
