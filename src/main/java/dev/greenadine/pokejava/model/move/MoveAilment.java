package dev.greenadine.pokejava.model.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourceCategory;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Move ailments are status conditions caused by moves used during battle.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@ResourceCategory("move-ailment")
public class MoveAilment extends NamedApiResource {

    private final List<NamedApiResource> moves;
    private final List<Name> names;

    protected MoveAilment(@JsonProperty("id") int id,
                          @JsonProperty("name") String name,
                          @JsonProperty("moves") List<NamedApiResource> moves,
                          @JsonProperty("names") List<Name> names) {
        super(id, name);

        this.moves = moves;
        this.names = names;
    }

    /**
     * Gets the moves that cause this ailment.
     *
     * @return the moves that cause this ailment.
     */
    public List<NamedApiResource> getMoves() {
        return moves;
    }

    /**
     * Gets the name of this move ailment listed in different languages.
     *
     * @return the name of this move ailment listed in different languages.
     */
    public List<Name> getNames() {
        return names;
    }
}
