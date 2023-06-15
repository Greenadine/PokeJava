package dev.greenadine.pokejava.model.pokemon.ability;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.VerboseEffect;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

/**
 * Represents a Pokémon ability.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class Ability extends NamedApiResource {

    private final boolean isMainSeries;
    private final NamedApiResource generation;
    private final Name[] names;
    private final VerboseEffect[] effectEntries;
    private final AbilityEffectChange[] effectChanges;
    private final AbilityFlavorText[] flavorTextEntries;
    private final AbilityPokemon[] pokemon;

    @JsonCreator
    public Ability(@JsonProperty("id") int id, @JsonProperty("name") String name,
                   @JsonProperty("is_main_series") boolean isMainSeries,
                   @JsonProperty("generation") NamedApiResource generation,
                   @JsonProperty("names") Name[] names,
                   @JsonProperty("effect_entries") VerboseEffect[] effectEntries,
                   @JsonProperty("effect_changes") AbilityEffectChange[] effectChanges,
                   @JsonProperty("flavor_text_entries") AbilityFlavorText[] flavorTextEntries,
                   @JsonProperty("pokemon") AbilityPokemon[] pokemon) {
        super(id, "ability", name);

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
     * Gets the name of the ability listed in different languages.
     *
     * @return the name of the ability listed in different languages.
     */
    public Name[] getNames() {
        return names;
    }

    /**
     * Gets the effect of the ability listed in different languages.
     *
     * @return the effect of the ability listed in different languages.
     */
    public VerboseEffect[] getEffectEntries() {
        return effectEntries;
    }

    /**
     * Gets the list of previous effects this ability has had across version groups.
     *
     * @return an array of previous effects this ability has had across version groups.
     */
    public AbilityEffectChange[] getEffectChanges() {
        return effectChanges;
    }

    /**
     * Gets the flavor text of the ability listed in different languages.
     *
     * @return the flavor text of the ability listed in different languages.
     */
    public AbilityFlavorText[] getFlavorTextEntries() {
        return flavorTextEntries;
    }

    /**
     * Gets a list of Pokémon that could potentially have this ability.
     *
     * @return an array of Pokémon that could potentially have this ability.
     */
    public AbilityPokemon[] getPokemon() {
        return pokemon;
    }
}