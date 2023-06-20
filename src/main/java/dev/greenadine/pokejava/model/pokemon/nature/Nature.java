package dev.greenadine.pokejava.model.pokemon.nature;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.Category;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Represents a Pokémon's nature.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@Category("nature")
public class Nature extends NamedApiResource {

    private final NamedApiResource decreasedStat;
    private final NamedApiResource increasedStat;
    private final NamedApiResource hatesFlavor;
    private final NamedApiResource likesFlavor;
    private final List<NatureStatChange> pokeathlonStatChanges;
    private final List<MoveBattleStylePreference> moveBattleStylePreferences;
    private final List<Name> names;

    @JsonCreator
    public Nature(@JsonProperty("id") int id,
                  @JsonProperty("name") String name,
                  @JsonProperty("decreased_stat") NamedApiResource decreasedStat,
                  @JsonProperty("increased_stat") NamedApiResource increasedStat,
                  @JsonProperty("hates_flavor") NamedApiResource hatesFlavor,
                  @JsonProperty("likes_flavor") NamedApiResource likesFlavor,
                  @JsonProperty("pokeathlon_stat_changes") List<NatureStatChange> pokeathlonStatChanges,
                  @JsonProperty("move_battle_style_preferences") List<MoveBattleStylePreference> moveBattleStylePreferences,
                  @JsonProperty("names") List<Name> names) {
        super(id, name);

        this.decreasedStat = decreasedStat;
        this.increasedStat = increasedStat;
        this.hatesFlavor = hatesFlavor;
        this.likesFlavor = likesFlavor;
        this.pokeathlonStatChanges = pokeathlonStatChanges;
        this.moveBattleStylePreferences = moveBattleStylePreferences;
        this.names = names;
    }

    /**
     * Gets the stat decreased by 10% in Pokémon with this nature.
     *
     * @return the stat decreased by 10% in Pokémon with this nature.
     */
    public NamedApiResource getDecreasedStat() {
        return decreasedStat;
    }

    /**
     * Gets the stat increased by 10% in Pokémon with this nature.
     *
     * @return the stat increased by 10% in Pokémon with this nature.
     */
    public NamedApiResource getIncreasedStat() {
        return increasedStat;
    }

    /**
     * Gets the flavor hated by Pokémon with this nature.
     *
     * @return the flavor hated by Pokémon with this nature.
     */
    public NamedApiResource getHatesFlavor() {
        return hatesFlavor;
    }

    /**
     * Gets the flavor liked by Pokémon with this nature.
     *
     * @return the flavor liked by Pokémon with this nature.
     */
    public NamedApiResource getLikesFlavor() {
        return likesFlavor;
    }

    /**
     * Gets the stat changes that will be caused by breeding a Pokémon with this nature with another Pokémon.
     *
     * @return the stat changes that will be caused by breeding a Pokémon with this nature with another Pokémon.
     */
    public List<NatureStatChange> getPokeathlonStatChanges() {
        return pokeathlonStatChanges;
    }

    /**
     * Gets the battle styles that get double the normal boost in Pokémon with this nature.
     *
     * @return the battle styles that get double the normal boost in Pokémon with this nature.
     */
    public List<MoveBattleStylePreference> getMoveBattleStylePreferences() {
        return moveBattleStylePreferences;
    }

    /**
     * Gets the name of this nature listed in different languages.
     *
     * @return the name of this nature listed in different languages.
     */
    public List<Name> getNames() {
        return names;
    }
}
