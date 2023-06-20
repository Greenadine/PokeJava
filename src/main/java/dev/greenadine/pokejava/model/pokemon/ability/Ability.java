package dev.greenadine.pokejava.model.pokemon.ability;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourceCategory;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.VerboseEffect;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Represents a Pokémon ability.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@ResourceCategory("ability")
public class Ability extends NamedApiResource {

    private final boolean isMainSeries;
    private final NamedApiResource generation;
    private final List<Name> names;
    private final List<VerboseEffect> effectEntries;
    private final List<AbilityEffectChange> effectChanges;
    private final List<AbilityFlavorText> flavorTextEntries;
    private final List<AbilityPokemon> pokemon;

    @JsonCreator
    public Ability(@JsonProperty("id") int id, @JsonProperty("name") String name,
                   @JsonProperty("is_main_series") boolean isMainSeries,
                   @JsonProperty("generation") NamedApiResource generation,
                   @JsonProperty("names") List<Name> names,
                   @JsonProperty("effect_entries") List<VerboseEffect> effectEntries,
                   @JsonProperty("effect_changes") List<AbilityEffectChange> effectChanges,
                   @JsonProperty("flavor_text_entries") List<AbilityFlavorText> flavorTextEntries,
                   @JsonProperty("pokemon") List<AbilityPokemon> pokemon) {
        super(id, name);

        this.isMainSeries = isMainSeries;
        this.generation = generation;
        this.names = names;
        this.effectEntries = effectEntries;
        this.effectChanges = effectChanges;
        this.flavorTextEntries = flavorTextEntries;
        this.pokemon = pokemon;
    }

    /**
     * Gets whether the ability was introduced in the main series of the video games.
     *
     * @return true if the ability was introduced in the main series of the video games.
     */
    public boolean isMainSeries() {
        return isMainSeries;
    }

    /**
     * Gets the generation this ability was introduced in.
     *
     * @return the generation this ability was introduced in.
     */
    public NamedApiResource getGeneration() {
        return generation;
    }

    /**
     * Gets the names of the ability listed in different languages.
     *
     * @return the names of the ability listed in different languages.
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Gets the effect of the ability listed in different languages.
     *
     * @return the effect of the ability listed in different languages.
     */
    public List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }

    /**
     * Gets the previous effects this ability has had across version groups.
     *
     * @return the previous effects this ability has had across version groups.
     */
    public List<AbilityEffectChange> getEffectChanges() {
        return effectChanges;
    }

    /**
     * Gets the flavor text of the ability listed in different languages.
     *
     * @return the flavor text of the ability listed in different languages.
     */
    public List<AbilityFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    /**
     * Gets the Pokémon that could potentially have this ability.
     *
     * @return the Pokémon that could potentially have this ability.
     */
    public List<AbilityPokemon> getPokemon() {
        return pokemon;
    }
}