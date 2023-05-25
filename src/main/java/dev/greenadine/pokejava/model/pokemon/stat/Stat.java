package dev.greenadine.pokejava.model.pokemon.stat;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.resource.ApiResource;
import dev.greenadine.pokejava.model.resource.NamedApiResource;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;

import java.util.List;

/**
 * Represents a stat.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class Stat extends NamedApiResource {

    private final int gameIndex;
    private final boolean isBattleOnly;
    private final MoveStatAffectSets affectingMoves;
    private final NatureStatAffectSets affectingNatures;
    private final List<ApiResource> characteristics;
    private final NamedApiResource moveDamageClass;
    private final List<Name> names;

    @JsonCreator
    public Stat(@JsonProperty("id") int id,
                @JsonProperty("name") String name,
                @JsonProperty("game_index") int gameIndex,
                @JsonProperty("is_battle_only") boolean isBattleOnly,
                @JsonProperty("affecting_moves") MoveStatAffectSets affectingMoves,
                @JsonProperty("affecting_natures") NatureStatAffectSets affectingNatures,
                @JsonProperty("characteristics") List<ApiResource> characteristics,
                @JsonProperty("move_damage_class") NamedApiResource moveDamageClass,
                @JsonProperty("names") List<Name> names) {
        super(id, "stat", name);

        this.gameIndex = gameIndex;
        this.isBattleOnly = isBattleOnly;
        this.affectingMoves = affectingMoves;
        this.affectingNatures = affectingNatures;
        this.characteristics = characteristics;
        this.moveDamageClass = moveDamageClass;
        this.names = names;
    }

    /**
     * Gets the game index of the stat.
     *
     * @return the game index of the stat.
     */
    public int getGameIndex() {
        return gameIndex;
    }

    /**
     * Gets whether this stat only exists within a battle.
     *
     * @return {@code true} if this stat only exists within a battle; {@code false} otherwise.
     */
    public boolean isBattleOnly() {
        return isBattleOnly;
    }

    /**
     * Gets a list of moves which affect this stat positively and negatively.
     *
     * @return a list of moves which affect this stat positively and negatively.
     */
    public MoveStatAffectSets getAffectingMoves() {
        return affectingMoves;
    }

    /**
     * Gets a list of natures which affect this stat positively and negatively.
     *
     * @return a list of natures which affect this stat positively and negatively.
     */
    public NatureStatAffectSets getAffectingNatures() {
        return affectingNatures;
    }

    /**
     * Gets the characteristics that are set on a Pokémon when its highest base stat is this stat.
     *
     * @return the characteristics that are set on a Pokémon when its highest base stat is this stat.
     */
    public List<ApiResource> getCharacteristics() {
        return characteristics;
    }

    /**
     * Gets the class of damage this stat is directly related to.
     *
     * @return the class of damage this stat is directly related to.
     */
    public NamedApiResource getMoveDamageClass() {
        return moveDamageClass;
    }

    /**
     * Gets the name of this stat listed in different languages.
     *
     * @return the name of this stat listed in different languages.
     */
    public List<Name> getNames() {
        return names;
    }
}
