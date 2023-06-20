package dev.greenadine.pokejava.model.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourceCategory;
import dev.greenadine.pokejava.model.common.Description;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Methods by which Pokémon can learn moves.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@ResourceCategory("move-learn-method")
public class MoveLearnMethod extends NamedApiResource {

    private final List<Description> descriptions;
    private final List<Name> names;
    private final List<NamedApiResource> versionGroups;

    protected MoveLearnMethod(@JsonProperty("id") int id,
                              @JsonProperty("name") String name,
                              @JsonProperty("descriptions") List<Description> descriptions,
                              @JsonProperty("names") List<Name> names,
                              @JsonProperty("version_groups") List<NamedApiResource> versionGroups) {
        super(id, name);

        this.descriptions = descriptions;
        this.names = names;
        this.versionGroups = versionGroups;
    }

    /**
     * Gets the description of this move learn method listed in different languages.
     *
     * @return the description of this move learn method listed in different languages.
     */
    public List<Description> getDescriptions() {
        return descriptions;
    }

    /**
     * Gets the name of this move learn method listed in different languages.
     *
     * @return the name of this move learn method listed in different languages.
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Gets the version groups that this move learn method can be used in.
     *
     * @return the version groups that this move learn method can be used in.
     */
    public List<NamedApiResource> getVersionGroups() {
        return versionGroups;
    }
}
