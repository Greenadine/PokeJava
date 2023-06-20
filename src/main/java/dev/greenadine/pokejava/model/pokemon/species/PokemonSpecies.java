package dev.greenadine.pokejava.model.pokemon.species;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.Category;
import dev.greenadine.pokejava.model.common.Description;
import dev.greenadine.pokejava.model.common.FlavorText;
import dev.greenadine.pokejava.model.common.Name;
import dev.greenadine.pokejava.model.common.resource.ApiResource;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Represents a Pokémon species.
 *
 * @see <a href="https://pokeapi.co/docs/v2#pokemonspecies">Pokémon Species</a>
 *
 * @since 0.1.0
 * @author Greenadine
 */
@Category("pokemon-species")
public class PokemonSpecies extends NamedApiResource {

    //region Fields
    private final int order;
    private final int genderRate;
    private final int captureRate;
    private final int baseHappiness;
    private final boolean isBaby;
    private final boolean isLegendary;
    private final boolean isMythical;
    private final int hatchCounter;
    private final boolean hasGenderDifferences;
    private final boolean formsSwitchable;
    private final NamedApiResource growthRate;
    private final List<PokemonSpeciesDexEntry> pokedexNumbers;
    private final List<NamedApiResource> eggGroups;
    private final NamedApiResource color;
    private final NamedApiResource shape;
    private final NamedApiResource evolvesFromSpecies;
    private final ApiResource evolutionChain;
    private final NamedApiResource habitat;
    private final NamedApiResource generation;
    private final List<Name> names;
    private final List<PalParkEncounterArea> palParkEncounters;
    private final List<FlavorText> flavorTextEntries;
    private final List<Description> formDescriptions;
    private final List<Genus> genera;
    private final List<PokemonSpeciesVariety> varieties;
    //endregion

    @JsonCreator
    public PokemonSpecies(@JsonProperty("id") int id,
                          @JsonProperty("name") String name,
                          @JsonProperty("order") int order,
                          @JsonProperty("gender_rate") int genderRate,
                          @JsonProperty("capture_rate") int captureRate,
                          @JsonProperty("base_happiness") int baseHappiness,
                          @JsonProperty("is_baby") boolean isBaby,
                          @JsonProperty("is_legendary") boolean isLegendary,
                          @JsonProperty("is_mythical") boolean isMythical,
                          @JsonProperty("hatch_counter") int hatchCounter,
                          @JsonProperty("has_gender_differences") boolean hasGenderDifferences,
                          @JsonProperty("forms_switchable") boolean formsSwitchable,
                          @JsonProperty("growth_rate") NamedApiResource growthRate,
                          @JsonProperty("pokedex_numbers") List<PokemonSpeciesDexEntry> pokedexNumbers,
                          @JsonProperty("egg_groups") List<NamedApiResource> eggGroups,
                          @JsonProperty("color") NamedApiResource color,
                          @JsonProperty("shape") NamedApiResource shape,
                          @JsonProperty("evolves_from_species") NamedApiResource evolvesFromSpecies,
                          @JsonProperty("evolution_chain") ApiResource evolutionChain,
                          @JsonProperty("habitat") NamedApiResource habitat,
                          @JsonProperty("generation") NamedApiResource generation,
                          @JsonProperty("names") List<Name> names,
                          @JsonProperty("pal_park_encounters") List<PalParkEncounterArea> palParkEncounters,
                          @JsonProperty("flavor_text_entries") List<FlavorText> flavorTextEntries,
                          @JsonProperty("form_descriptions") List<Description> formDescriptions,
                          @JsonProperty("genera") List<Genus> genera,
                          @JsonProperty("varieties") List<PokemonSpeciesVariety> varieties) {
        super(id, name);

        this.order = order;
        this.genderRate = genderRate;
        this.captureRate = captureRate;
        this.baseHappiness = baseHappiness;
        this.isBaby = isBaby;
        this.isLegendary = isLegendary;
        this.isMythical = isMythical;
        this.hatchCounter = hatchCounter;
        this.hasGenderDifferences = hasGenderDifferences;
        this.formsSwitchable = formsSwitchable;
        this.growthRate = growthRate;
        this.pokedexNumbers = pokedexNumbers;
        this.eggGroups = eggGroups;
        this.color = color;
        this.shape = shape;
        this.evolvesFromSpecies = evolvesFromSpecies;
        this.evolutionChain = evolutionChain;
        this.habitat = habitat;
        this.generation = generation;
        this.names = names;
        this.palParkEncounters = palParkEncounters;
        this.flavorTextEntries = flavorTextEntries;
        this.formDescriptions = formDescriptions;
        this.genera = genera;
        this.varieties = varieties;
    }

    /**
     * Gets the order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
     *
     * @return the order in which species should be sorted.
     */
    public int getOrder() {
        return order;
    }

    /**
     * Gets the chance of this Pokémon species being female, in eighths; or -1 for genderless.
     *
     * @return the chance of this Pokémon species being female.
     */
    public int getGenderRate() {
        return genderRate;
    }

    /**
     * Gets the base capture rate; up to 255. The higher the number, the easier the catch.
     *
     * @return the base capture rate.
     */
    public int getCaptureRate() {
        return captureRate;
    }

    /**
     * Gets the happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon species.
     *
     * @return the happiness when caught by a normal Pokéball.
     */
    public int getBaseHappiness() {
        return baseHappiness;
    }

    /**
     * Gets whether this is a baby Pokémon species.
     *
     * @return {@code true} if this is a baby Pokémon species, {@code false} otherwise.
     */
    public boolean isBaby() {
        return isBaby;
    }

    /**
     * Gets whether this is a legendary Pokémon species.
     *
     * @return {@code true} if this is a legendary Pokémon species, {@code false} otherwise.
     */
    public boolean isLegendary() {
        return isLegendary;
    }

    /**
     * Gets whether this is a mythical Pokémon species.
     *
     * @return {@code true} if this is a mythical Pokémon species, {@code false} otherwise.
     */
    public boolean isMythical() {
        return isMythical;
    }

    /**
     * Gets the number of cycles it takes for this Pokémon species to hatch from an egg.
     *
     * @return the number of cycles it takes for this Pokémon species to hatch from an egg.
     */
    public int getHatchCounter() {
        return hatchCounter;
    }

    /**
     * Gets whether this Pokémon species has visual gender differences.
     *
     * @return {@code true} if this Pokémon species has visual gender differences, {@code false} otherwise.
     */
    public boolean hasGenderDifferences() {
        return hasGenderDifferences;
    }

    /**
     * Gets whether this Pokémon species has multiple forms and can switch between them.
     *
     * @return {@code true} if this Pokémon species has multiple forms and can switch between them, {@code false} otherwise.
     */
    public boolean formsSwitchable() {
        return formsSwitchable;
    }

    /**
     * Gets the Pokémon species growth rate.
     *
     * @return the Pokémon species growth rate.
     */
    public NamedApiResource getGrowthRate() {
        return growthRate;
    }

    /**
     * Gets the Pokédex numbers of this Pokémon species in each Pokédex.
     *
     * @return the Pokédex numbers of this Pokémon species in each Pokédex.
     */
    public List<PokemonSpeciesDexEntry> getPokedexNumbers() {
        return pokedexNumbers;
    }

    /**
     * Gets the egg groups this Pokémon species is a member of.
     *
     * @return the egg groups this Pokémon species is a member of.
     */
    public List<NamedApiResource> getEggGroups() {
        return eggGroups;
    }

    /**
     * Gets the color of this Pokémon species for Pokédex search.
     *
     * @return the color of this Pokémon species for Pokédex search.
     */
    public NamedApiResource getColor() {
        return color;
    }

    /**
     * Gets the shape of this Pokémon species for Pokédex search.
     *
     * @return the shape of this Pokémon species for Pokédex search.
     */
    public NamedApiResource getShape() {
        return shape;
    }

    /**
     * Gets the Pokémon species that evolves into this Pokémon species.
     *
     * @return the Pokémon species that evolves into this Pokémon species.
     */
    public NamedApiResource getEvolvesFromSpecies() {
        return evolvesFromSpecies;
    }

    /**
     * Gets the evolution chain this Pokémon species is a member of.
     *
     * @return the evolution chain this Pokémon species is a member of.
     */
    public ApiResource getEvolutionChain() {
        return evolutionChain;
    }

    /**
     * Gets the habitat this Pokémon species can be encountered in.
     *
     * @return the habitat this Pokémon species can be encountered in.
     */
    public NamedApiResource getHabitat() {
        return habitat;
    }

    /**
     * Gets the generation this Pokémon species was introduced in.
     *
     * @return the generation this Pokémon species was introduced in.
     */
    public NamedApiResource getGeneration() {
        return generation;
    }

    /**
     * Gets the name of this Pokémon species listed in different languages.
     *
     * @return the name of this Pokémon species listed in different languages.
     */
    public List<Name> getNames() {
        return names;
    }

    /**
     * Gets the Pal Park locations where this Pokémon species can be encountered.
     *
     * @return the Pal Park locations where this Pokémon species can be encountered.
     */
    public List<PalParkEncounterArea> getPalParkEncounters() {
        return palParkEncounters;
    }

    /**
     * Gets the flavor text of this Pokémon species listed in different languages.
     *
     * @return the flavor text of this Pokémon species listed in different languages.
     */
    public List<FlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    /**
     * Gets the form descriptions of this Pokémon species listed in different languages.
     *
     * @return the form descriptions of this Pokémon species listed in different languages.
     */
    public List<Description> getFormDescriptions() {
        return formDescriptions;
    }

    /**
     * Gets the genera of this Pokémon species listed in different languages.
     *
     * @return the genera of this Pokémon species listed in different languages.
     */
    public List<Genus> getGenera() {
        return genera;
    }

    /**
     * Gets the varieties of this Pokémon species.
     *
     * @return the varieties of this Pokémon species.
     */
    public List<PokemonSpeciesVariety> getVarieties() {
        return varieties;
    }
}
