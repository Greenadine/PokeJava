package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.Category;
import dev.greenadine.pokejava.model.common.VersionGameIndex;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;
import dev.greenadine.pokejava.model.pokemon.form.PokemonForm;
import dev.greenadine.pokejava.model.pokemon.species.PokemonSpecies;
import dev.greenadine.pokejava.model.pokemon.sprites.PokemonSprites;

import java.util.List;

/**
 * Represents a single Pokémon.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@Category("pokemon")
public class Pokemon extends NamedApiResource {

    private final int baseExperience;
    private final int height;
    private final boolean isDefault;
    private final int order;
    private final int weight;
    private final List<PokemonAbility> abilities;
    private final List<PokemonForm> forms;
    private final List<VersionGameIndex> gameIndices;
    private final List<PokemonHeldItem> heldItems;
    private final String locationAreaEncounters;
    private final List<PokemonMove> moves;
    private final List<PokemonTypePast> pastTypes;
    private final PokemonSprites sprites;
    private final PokemonSpecies species;
    private final List<PokemonStat> stats;
    private final List<PokemonType> types;

    @JsonCreator
    public Pokemon(@JsonProperty("id") int id,
                   @JsonProperty("name") String name,
                   @JsonProperty("base_experience") int baseExperience,
                   @JsonProperty("height") int height,
                   @JsonProperty("is_default") boolean isDefault,
                   @JsonProperty("order") int order,
                   @JsonProperty("weight") int weight,
                   @JsonProperty("abilities") List<PokemonAbility> abilities,
                   @JsonProperty("forms") List<PokemonForm> forms,
                   @JsonProperty("game_indices") List<VersionGameIndex> gameIndices,
                   @JsonProperty("held_items") List<PokemonHeldItem> heldItems,
                   @JsonProperty("location_area_encounters") String locationAreaEncounters,
                   @JsonProperty("moves") List<PokemonMove> moves,
                   @JsonProperty("past_types") List<PokemonTypePast> pastTypes,
                   @JsonProperty("sprites") PokemonSprites sprites,
                   @JsonProperty("species") PokemonSpecies species,
                   @JsonProperty("stats") List<PokemonStat> stats,
                   @JsonProperty("types") List<PokemonType> types) {
        super(id, name);

        this.baseExperience = baseExperience;
        this.height = height;
        this.isDefault = isDefault;
        this.order = order;
        this.weight = weight;
        this.abilities = abilities;
        this.forms = forms;
        this.gameIndices = gameIndices;
        this.heldItems = heldItems;
        this.locationAreaEncounters = locationAreaEncounters;
        this.moves = moves;
        this.pastTypes = pastTypes;
        this.sprites = sprites;
        this.species = species;
        this.stats = stats;
        this.types = types;
    }

    /**
     * Gets the base experience gained for defeating this Pokémon.
     *
     * @return the base experience gained for defeating this Pokémon.
     */
    public int getBaseExperience() {
        return baseExperience;
    }

    /**
     * Gets the height of this Pokémon in decimetres.
     *
     * @return the height of this Pokémon in decimetres.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets whether this Pokémon is the default form.
     *
     * @return {@code true} if this Pokémon is the default form, {@code false} otherwise.
     */
    public boolean isDefault() {
        return isDefault;
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
     * Gets the weight of this Pokémon in hectograms.
     *
     * @return the weight of this Pokémon in hectograms.
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Gets a list of abilities this Pokémon could potentially have.
     *
     * @return a list of abilities this Pokémon could potentially have.
     */
    public List<PokemonAbility> getAbilities() {
        return abilities;
    }

    /**
     * Gets a list of forms this Pokémon can take on.
     *
     * @return a list of forms this Pokémon can take on.
     */
    public List<PokemonForm> getForms() {
        return forms;
    }

    /**
     * Gets a list of game indices relevant to Pokémon item by generation.
     *
     * @return a list of game indices relevant to Pokémon item by generation.
     */
    public List<VersionGameIndex> getGameIndices() {
        return gameIndices;
    }

    /**
     * Gets a list of items this Pokémon may be holding when encountered.
     *
     * @return a list of items this Pokémon may be holding when encountered.
     */
    public List<PokemonHeldItem> getHeldItems() {
        return heldItems;
    }

    /**
     * Gets a link to a list of location areas, as well as encounter details pertaining to specific versions.
     *
     * @return a link to a list of location areas, as well as encounter details pertaining to specific versions.
     */
    public String getLocationAreaEncounters() {
        return locationAreaEncounters;
    }

    /**
     * Gets a list of moves along with learn methods and level details pertaining to specific version groups.
     *
     * @return a list of moves along with learn methods and level details pertaining to specific version groups.
     */
    public List<PokemonMove> getMoves() {
        return moves;
    }

    /**
     * Gets a list of past types this Pokémon has had.
     *
     * @return a list of past types this Pokémon has had.
     */
    public List<PokemonTypePast> getPastTypes() {
        return pastTypes;
    }

    /**
     * Gets a set of sprites used to depict this Pokémon in the game.
     *
     * @return a set of sprites used to depict this Pokémon in the game.
     */
    public PokemonSprites getSprites() {
        return sprites;
    }

    /**
     * Gets the species this Pokémon belongs to.
     *
     * @return the species this Pokémon belongs to.
     */
    public PokemonSpecies getSpecies() {
        return species;
    }

    /**
     * Gets a list of base stat values for this Pokémon.
     *
     * @return a list of base stat values for this Pokémon.
     */
    public List<PokemonStat> getStats() {
        return stats;
    }

    /**
     * Gets a list of details showing types this Pokémon has.
     *
     * @return a list of details showing types this Pokémon has.
     */
    public List<PokemonType> getTypes() {
        return types;
    }
}
