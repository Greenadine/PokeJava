package dev.greenadine.pokejava.model.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourceCategory;
import dev.greenadine.pokejava.model.common.Description;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Damage classes moves can have, e.g. physical, special, or non-damaging.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@ResourceCategory("move-damage-class")
public class MoveDamageClass extends NamedApiResource {

    private final List<Description> descriptions;
    private final List<NamedApiResource> moves;
    private final List<Name> names;

    protected MoveDamageClass(@JsonProperty("id") int id,
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
     * Gets the description of this move damage class listed in different languages.
     *
     * @return the description of this move damage class listed in different languages.
     */
    public List<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * Gets the moves that are of this damage class.
     *
     * @return the moves that are of this damage class.
     */
    public List<NamedApiResource> getMoves() {
        return moves;
    }

    /**
     * Gets the name of this move damage class listed in different languages.
     *
     * @return the name of this move damage class listed in different languages.
     */
    public List<Name> getNames() {
        return names;
    }
}
