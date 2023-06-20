package dev.greenadine.pokejava.model.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourceCategory;
import dev.greenadine.pokejava.model.common.Description;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Move categories are properties of moves that determine on what targets it can be used on.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@ResourceCategory("move-category")
public class MoveCategory extends NamedApiResource {

    private final List<NamedApiResource> moves;
    private final List<Description> descriptions;

    protected MoveCategory(@JsonProperty("id") int id,
                           @JsonProperty("name") String name,
                           @JsonProperty("moves") List<NamedApiResource> moves,
                           @JsonProperty("descriptions") List<Description> descriptions) {
        super(id, name);

        this.moves = moves;
        this.descriptions = descriptions;
    }

    /**
     * Gets the moves that are in this category.
     *
     * @return the moves that are in this category.
     */
    public List<NamedApiResource> getMoves() {
        return moves;
    }

    /**
     * Gets the description of this move category listed in different languages.
     *
     * @return the description of this move category listed in different languages.
     */
    public List<Description> getDescriptions() {
        return descriptions;
    }
}
