package dev.greenadine.pokejava.model.pokemon.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.NamedApiResource;
import dev.greenadine.pokejava.model.common.GenerationGameIndex;
import dev.greenadine.pokejava.model.common.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Represents a Pokémon type.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Type extends NamedApiResource {

    private final TypeRelations damageRelations;
    private final List<GenerationGameIndex> gameIndices;
    private final NamedApiResource generation;
    private final NamedApiResource moveDamageClass;
    private final List<Name> names;
    private final List<TypePokemonRelation> pokemon;
    private final List<NamedApiResource> moves;

    @JsonCreator
    public Type(@JsonProperty("id") int id,
                @JsonProperty("name") String name,
                @JsonProperty("damage_relations") TypeRelations damageRelations,
                @JsonProperty("game_indices") List<GenerationGameIndex> gameIndices,
                @JsonProperty("generation") NamedApiResource generation,
                @JsonProperty("move_damage_class") NamedApiResource moveDamageClass,
                @JsonProperty("names") List<Name> names,
                @JsonProperty("pokemon") List<TypePokemonRelation> pokemon,
                @JsonProperty("moves") List<NamedApiResource> moves) {
        super(id, "type", name);

        this.damageRelations = damageRelations;
        this.gameIndices = gameIndices;
        this.generation = generation;
        this.moveDamageClass = moveDamageClass;
        this.names = names;
        this.pokemon = pokemon;
        this.moves = moves;
    }

    /**
     * Gets the damage relations of the type.
     *
     * @return the damage relations of the type.
     */
    @NotNull
    public TypeRelations getDamageRelations() {
        return damageRelations;
    }

    /**
     * Gets the game indices of the type.
     *
     * @return the game indices of the type.
     */
    @NotNull
    public List<GenerationGameIndex> getGameIndices() {
        return gameIndices;
    }

    /**
     * Gets the generation of the type.
     *
     * @return the generation of the type.
     */
    @NotNull
    public NamedApiResource getGeneration() {
        return generation;
    }

    /**
     * Gets the move damage class of the type.
     *
     * @return the move damage class of the type.
     */
    @Nullable
    public NamedApiResource getMoveDamageClass() {
        return moveDamageClass;
    }

    /**
     * Gets the names of the type.
     *
     * @return the names of the type.
     */
    @NotNull
    public List<Name> getNames() {
        return names;
    }

    /**
     * Gets the Pokémon that have the type.
     *
     * @return the Pokémon that have the type.
     */
    @NotNull
    public List<TypePokemonRelation> getPokemon() {
        return pokemon;
    }

    /**
     * Gets the moves that have the type.
     *
     * @return the moves that have the type.
     */
    @NotNull
    public List<NamedApiResource> getMoves() {
        return moves;
    }
}
