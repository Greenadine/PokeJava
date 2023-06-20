package dev.greenadine.pokejava.model.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourceCategory;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Move categories are properties of moves that determine on what targets it can be used on.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@ResourceCategory("move-category")
public class MoveBattleStyle extends NamedApiResource {

    private final List<Name> names;

    protected MoveBattleStyle(@JsonProperty("id") int id,
                              @JsonProperty("name") String name,
                              @JsonProperty("names") List<Name> names) {
        super(id, name);

        this.names = names;
    }

    /**
     * Gets the name of this move battle style listed in different languages.
     *
     * @return the name of this move battle style listed in different languages.
     */
    public List<Name> getNames() {
        return names;
    }
}
