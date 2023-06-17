package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.pokemon.*;
import dev.greenadine.pokejava.model.pokemon.ability.Ability;
import dev.greenadine.pokejava.model.pokemon.form.PokemonForm;
import dev.greenadine.pokejava.model.pokemon.gender.Gender;
import dev.greenadine.pokejava.model.pokemon.growthrate.GrowthRate;
import dev.greenadine.pokejava.model.pokemon.nature.Nature;
import dev.greenadine.pokejava.model.pokemon.pokeathlon.PokeathlonStat;
import dev.greenadine.pokejava.model.pokemon.shape.PokemonShape;
import dev.greenadine.pokejava.model.pokemon.species.PokemonSpecies;
import dev.greenadine.pokejava.model.pokemon.stat.Stat;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import dev.greenadine.pokejava.model.common.resource.ApiResourceList;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

import java.io.IOException;

/**
 * Represents the PokeAPI client.
 *
 * @see PokeApi
 * @see PokeApiService
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class PokeApiClient implements PokeApi {

    private final PokeApiService service;

    public PokeApiClient() {
        service = PokeApiServiceFactory.getDefaultService();
    }

    //region Resources

    //region Stats
    @Override
    public NamedApiResourceList getStats(int offset, int limit) {
        return result(service.getStats(offset, limit));
    }

    @Override
    public Stat getStatById(int id) {
        return result(service.getStatById(id));
    }

    @Override
    public Stat getStatByName(@NotNull String name) {
        return result(service.getStatByName(name));
    }
    //endregion

    //region Genders
    @Override
    public NamedApiResourceList getGenders(int offset, int limit) {
        return result(service.getGenders(offset, limit));
    }

    @Override
    public Gender getGenderById(int id) {
        return result(service.getGenderById(id));
    }

    @Override
    public Gender getGenderByName(@NotNull String name) {
        return result(service.getGenderByName(name));
    }
    //endregion

    //region Growth rates
    @Override
    public NamedApiResourceList getGrowthRates(int offset, int limit) {
        return result(service.getGrowthRates(offset, limit));
    }

    @Override
    public GrowthRate getGrowthRateById(int id) {
        return result(service.getGrowthRateById(id));
    }

    @Override
    public GrowthRate getGrowthRateByName(@NotNull String name) {
        return result(service.getGrowthRateByName(name));
    }
    //endregion

    //region Types
    @Override
    public NamedApiResourceList getTypes(int offset, int limit) {
        return result(service.getTypes(offset, limit));
    }

    @Override
    public Type getTypeById(int id) {
        return result(service.getTypeById(id));
    }

    @Override
    public Type getTypeByName(@NotNull String name) {
        return result(service.getTypeByName(name));
    }
    //endregion

    //region Abilities
    @Override
    public NamedApiResourceList getAbilities(int offset, int limit) {
        return result(service.getAbility(offset, limit));
    }

    @Override
    public Ability getAbilityById(int id) {
        return result(service.getAbilityById(id));
    }

    @Override
    public Ability getAbilityByName(@NotNull String name) {
        return result(service.getAbilityByName(name));
    }
    //endregion

    //region Characteristics
    @Override
    public ApiResourceList getCharacteristics(int offset, int limit) {
        return result(service.getCharacteristic(offset, limit));
    }

    @Override
    public Characteristic getCharacteristic(int id) {
        return result(service.getCharacteristic(id));
    }
    //endregion

    //region Egg groups
    @Override
    public NamedApiResourceList getEggGroups(int offset, int limit) {
        return result(service.getEggGroup(offset, limit));
    }

    @Override
    public EggGroup getEggGroupById(int id) {
        return result(service.getEggGroupById(id));
    }

    @Override
    public EggGroup getEggGroupByName(@NotNull String name) {
        return result(service.getEggGroupByName(name));
    }
    //endregion

    //region Natures
    @Override
    public NamedApiResourceList getNatures(int offset, int limit) {
        return result(service.getNature(offset, limit));
    }

    @Override
    public Nature getNatureById(int id) {
        return result(service.getNatureById(id));
    }

    @Override
    public Nature getNatureByName(@NotNull String name) {
        return result(service.getNatureByName(name));
    }
    //endregion

    //region Pokeathlon stats
    @Override
    public NamedApiResourceList getPokeathlonStats(int offset, int limit) {
        return result(service.getPokeathlonStat(offset, limit));
    }

    @Override
    public PokeathlonStat getPokeathlonStatById(int id) {
        return result(service.getPokeathlonStatById(id));
    }

    @Override
    public PokeathlonStat getPokeathlonStatByName(@NotNull String name) {
        return result(service.getPokeathlonStatByName(name));
    }
    //endregion

    //region Pokémon colors
    @Override
    public NamedApiResourceList getPokemonColors(int offset, int limit) {
        return result(service.getPokemonColor(offset, limit));
    }

    @Override
    public PokemonColor getPokemonColorById(int id) {
        return result(service.getPokemonColorById(id));
    }

    @Override
    public PokemonColor getPokemonColorByName(@NotNull String name) {
        return result(service.getPokemonColorByName(name));
    }
    //endregion

    //region Pokémon habitats
    @Override
    public NamedApiResourceList getPokemonHabitats(int offset, int limit) {
        return result(service.getPokemonHabitat(offset, limit));
    }

    @Override
    public PokemonHabitat getPokemonHabitatById(int id) {
        return result(service.getPokemonHabitatById(id));
    }

    @Override
    public PokemonHabitat getPokemonHabitatByName(@NotNull String name) {
        return result(service.getPokemonHabitatByName(name));
    }
    //endregion

    //region Pokémon shapes
    @Override
    public NamedApiResourceList getPokemonShapes(int offset, int limit) {
        return result(service.getPokemonShape(offset, limit));
    }

    @Override
    public PokemonShape getPokemonShapeById(int id) {
        return result(service.getPokemonShapeById(id));
    }

    @Override
    public PokemonShape getPokemonShapeByName(@NotNull String name) {
        return result(service.getPokemonShapeByName(name));
    }
    //endregion

    //region Pokémon species
    @Override
    public NamedApiResourceList getPokemonSpecies(int offset, int limit) {
        return result(service.getPokemonSpecies(offset, limit));
    }

    @Override
    public PokemonSpecies getPokemonSpeciesById(int id) {
        return result(service.getPokemonSpeciesById(id));
    }

    @Override
    public PokemonSpecies getPokemonSpeciesByName(@NotNull String name) {
        return result(service.getPokemonSpeciesByName(name));
    }
    //endregion
    
    //region Pokémon forms
    @Override
    public NamedApiResourceList getPokemonForms(int offset, int limit) {
        return result(service.getPokemonForms(offset, limit));
    }
    
    @Override
    public PokemonForm getPokemonFormById(int id) {
        return result(service.getPokemonFormById(id));
    }
    
    @Override
    public PokemonForm getPokemonFormByName(@NotNull String name) {
        return result(service.getPokemonFormByName(name));
    }
    //endregion

    /**
     * Executes the call synchronously and returns the result.
     *
     * @param call the call to execute.
     *
     * @return the result of the call.
     *
     * @param <T> the type of the result.
     */
    private <T> T result(Call<T> call) {
        try {
            return call.execute().body();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
