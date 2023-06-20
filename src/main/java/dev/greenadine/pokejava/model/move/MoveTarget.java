package dev.greenadine.pokejava.model.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourceCategory;
import dev.greenadine.pokejava.model.common.Description;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Move targets are categories that moves fall into, which determines how moves can be used.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@ResourceCategory("move-target")
public class MoveTarget extends NamedApiResource {

    private final List<Description> descriptions;
    private final List<NamedApiResource> moves;
    private final List<Name> names;

    protected MoveTarget(@JsonProperty("id") int id,
                         @JsonProperty("name") String name,
                         @JsonProperty("descriptions") List<Description> descriptions,
                         @JsonProperty("moves") List<NamedApiResource> moves,
                         @JsonProperty("names") List<Name> names) {
        super(id, name);

        this.descriptions = descriptions;
        this.moves = moves;
        this.names = names;
    }

    /**
     * Gets the description of this move target listed in different languages.
     *
     * @return the description of this move target listed in different languages.
     */
    public List<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * Gets the moves that are directed at this move target.
     *
     * @return the moves that are directed at this move target.
     */
    public List<NamedApiResource> getMoves() {
        return moves;
    }

    /**
     * Gets the name of this move target listed in different languages.
     *
     * @return the name of this move target listed in different languages.
     */
    public List<Name> getNames() {
        return names;
    }
}
