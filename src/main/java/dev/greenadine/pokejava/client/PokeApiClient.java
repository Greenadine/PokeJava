package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.pokemon.Characteristic;
import dev.greenadine.pokejava.model.pokemon.EggGroup;
import dev.greenadine.pokejava.model.pokemon.Gender;
import dev.greenadine.pokejava.model.pokemon.GrowthRate;
import dev.greenadine.pokejava.model.pokemon.ability.Ability;
import dev.greenadine.pokejava.model.pokemon.nature.Nature;
import dev.greenadine.pokejava.model.pokemon.stat.Stat;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import dev.greenadine.pokejava.model.resource.ApiResourceList;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

import java.io.IOException;

/**
 * Represents the PokeAPI client.
 *
 * @since 0.1.0
 * @see PokeApi
 * @see PokeApiService
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
    public NamedApiResourceList getStatList(int offset, int limit) {
        return result(service.getStatList(offset, limit));
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
    public NamedApiResourceList getGenderList(int offset, int limit) {
        return result(service.getGenderList(offset, limit));
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
    public NamedApiResourceList getGrowthRateList(int offset, int limit) {
        return result(service.getGrowthRateList(offset, limit));
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
    public NamedApiResourceList getTypeList(int offset, int limit) {
        return result(service.getTypeList(offset, limit));
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
    public NamedApiResourceList getAbilityList(int offset, int limit) {
        return result(service.getAbilityList(offset, limit));
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
    public ApiResourceList getCharacteristicList(int offset, int limit) {
        return result(service.getCharacteristicList(offset, limit));
    }

    @Override
    public Characteristic getCharacteristic(int id) {
        return result(service.getCharacteristic(id));
    }
    //endregion

    //region Egg groups
    @Override
    public NamedApiResourceList getEggGroupList(int offset, int limit) {
        return result(service.getEggGroupList(offset, limit));
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
    public NamedApiResourceList getNatureList(int offset, int limit) {
        return result(service.getNatureList(offset, limit));
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
