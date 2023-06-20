package dev.greenadine.pokejava.model.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourceCategory;
import dev.greenadine.pokejava.model.common.MachineVersionDetail;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.VerboseEffect;
import dev.greenadine.pokejava.model.common.resource.ApiResource;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;
import dev.greenadine.pokejava.model.pokemon.ability.AbilityEffectChange;

import java.util.List;

/**
 * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@ResourceCategory("move")
public class Move extends NamedApiResource {

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
    private final List<Name> names;
    private final List<PastMoveStatValues> pastValues;
    private final List<MoveStatChange> statChanges;
    private final NamedApiResource superContestEffect;
    private final NamedApiResource target;
    private final NamedApiResource type;


    protected Move(@JsonProperty("id") int id,
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
        this.names = names;
        this.pastValues = pastValues;
        this.statChanges = statChanges;
        this.superContestEffect = superContestEffect;
        this.target = target;
        this.type = type;
    }

    /**
     * Gets the accuracy of this move.
     *
     * @return the accuracy of this move.
     */
    public int getAccuracy() {
        return accuracy;
    }

    /**
     * Gets the chance of this move causing an effect on the target.
     *
     * @return the chance of this move causing an effect on the target.
     */
    public int getEffectChance() {
        return effectChance;
    }

    /**
     * Gets the amount of power points this move has.
     *
     * @return the amount of power points this move has.
     */
    public int getPp() {
        return pp;
    }

    /**
     * Gets the priority of this move.
     *
     * @return the priority of this move.
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Gets the base power of this move.
     *
     * @return the base power of this move.
     */
    public int getPower() {
        return power;
    }

    /**
     * Gets the contest combos for this move.
     *
     * @return the contest combos for this move.
     */
    public ContestComboSets getContestCombos() {
        return contestCombos;
    }

    /**
     * Gets the contest type for this move.
     *
     * @return the contest type for this move.
     */
    public NamedApiResource getContestType() {
        return contestType;
    }

    /**
     * Gets the contest effect for this move.
     *
     * @return the contest effect for this move.
     */
    public ApiResource getContestEffect() {
        return contestEffect;
    }

    /**
     * Gets the damage class of this move.
     *
     * @return the damage class of this move.
     */
    public NamedApiResource getDamageClass() {
        return damageClass;
    }

    /**
     * Gets the effect entries of this move.
     *
     * @return the effect entries of this move.
     */
    public List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }

    /**
     * Gets the effect changes of this move.
     *
     * @return the effect changes of this move.
     */
    public List<AbilityEffectChange> getEffectChanges() {
        return effectChanges;
    }

    /**
     * Gets the Pokémon that learn this move by level up.
     *
     * @return the Pokémon that learn this move by level up.
     */
    public List<NamedApiResource> getLearnedByPokemon() {
        return learnedByPokemon;
    }

    /**
     * Gets the flavor text entries of this move.
     *
     * @return the flavor text entries of this move.
     */
    public List<MoveFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    /**
     * Gets the generation this move was introduced in.
     *
     * @return the generation this move was introduced in.
     */
    public NamedApiResource getGeneration() {
        return generation;
    }

    /**
     * Gets the machines that teach this move.
     *
     * @return the machines that teach this move.
     */
    public List<MachineVersionDetail> getMachines() {
        return machines;
    }

    /**
     * Gets the localized names of this move.
     *
     * @return the localized names of this move.
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Gets the past stat values of this move.
     *
     * @return the past stat values of this move.
     */
    public List<PastMoveStatValues> getPastValues() {
        return pastValues;
    }

    /**
     * Gets the stat changes of this move.
     *
     * @return the stat changes of this move.
     */
    public List<MoveStatChange> getStatChanges() {
        return statChanges;
    }

    /**
     * Gets the super contest effect of this move.
     *
     * @return the super contest effect of this move.
     */
    public NamedApiResource getSuperContestEffect() {
        return superContestEffect;
    }

    /**
     * Gets the target of this move.
     *
     * @return the target of this move.
     */
    public NamedApiResource getTarget() {
        return target;
    }

    /**
     * Gets the type of this move.
     *
     * @return the type of this move.
     */
    public NamedApiResource getType() {
        return type;
    }
}
