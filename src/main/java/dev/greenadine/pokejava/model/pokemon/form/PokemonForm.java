package dev.greenadine.pokejava.model.pokemon.form;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.Category;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;
import dev.greenadine.pokejava.model.pokemon.PokemonFormType;

import java.util.List;

/**
 * Represents a single Pokémon form.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@Category("pokemon-form")
public class PokemonForm extends NamedApiResource {

    //region Fields
    private final int order;
    private final int formOrder;
    private final boolean isDefault;
    private final boolean isBattleOnly;
    private final boolean isMega;
    private final String formName;
    private final NamedApiResource pokemon;
    private final List<PokemonFormType> types;
    private final PokemonFormSprites sprites;
    private final NamedApiResource versionGroup;
    private final List<Name> names;
    private final List<Name> formNames;
    //endregion

    @JsonCreator
    public PokemonForm(@JsonProperty("id") int id,
                       @JsonProperty("name") String name,
                       @JsonProperty("order") int order,
                       @JsonProperty("form_order") int formOrder,
                       @JsonProperty("is_default") boolean isDefault,
                       @JsonProperty("is_battle_only") boolean isBattleOnly,
                       @JsonProperty("is_mega") boolean isMega,
                       @JsonProperty("form_name") String formName,
                       @JsonProperty("pokemon")  NamedApiResource pokemon,
                       @JsonProperty("types")  List<PokemonFormType> types,
                       @JsonProperty("sprites")  PokemonFormSprites sprites,
                       @JsonProperty("version_group") NamedApiResource versionGroup,
                       @JsonProperty("names") List<Name> names,
                       @JsonProperty("form_names") List<Name> formNames) {
        super(id, name);

        this.order = order;
        this.formOrder = formOrder;
        this.isDefault = isDefault;
        this.isBattleOnly = isBattleOnly;
        this.isMega = isMega;
        this.formName = formName;
        this.pokemon = pokemon;
        this.types = types;
        this.sprites = sprites;
        this.versionGroup = versionGroup;
        this.names = names;
        this.formNames = formNames;
    }

    /**
     * Gets the order in which forms should be sorted within all forms.
     *
     * @return the order in which forms should be sorted within all forms.
     */
    public int getOrder() {
        return order;
    }

    /**
     * Gets the order in which forms should be sorted within a species' forms.
     *
     * @return the order in which forms should be sorted within a species' forms.
     */
    public int getFormOrder() {
        return formOrder;
    }

    /**
     * Gets whether this form is the default form for the Pokémon.
     *
     * @return true if this form is the default form for the Pokémon.
     */
    public boolean isDefault() {
        return isDefault;
    }

    /**
     * Gets whether this form can only be used in battle.
     *
     * @return true if this form can only be used in battle.
     */
    public boolean isBattleOnly() {
        return isBattleOnly;
    }

    /**
     * Gets whether this form is a mega evolution.
     *
     * @return true if this form is a mega evolution.
     */
    public boolean isMega() {
        return isMega;
    }

    /**
     * Gets the name of this form.
     *
     * @return the name of this form.
     */
    public String getFormName() {
        return formName;
    }

    /**
     * Gets the Pokémon that can take on this form.
     *
     * @return the Pokémon that can take on this form.
     */
    public NamedApiResource getPokemon() {
        return pokemon;
    }

    /**
     * Gets the different types this form has.
     *
     * @return the different types this form has.
     */
    public List<PokemonFormType> getTypes() {
        return types;
    }

    /**
     * Gets the sprites of this form.
     *
     * @return the sprites of this form.
     */
    public PokemonFormSprites getSprites() {
        return sprites;
    }

    /**
     * Gets the version group this form was introduced in.
     *
     * @return the version group this form was introduced in.
     */
    public NamedApiResource getVersionGroup() {
        return versionGroup;
    }

    /**
     * Gets the names of this form.
     *
     * @return the names of this form.
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Gets the form names of this form.
     *
     * @return the form names of this form.
     */
    public List<Name> getFormNames() {
        return formNames;
    }
}
