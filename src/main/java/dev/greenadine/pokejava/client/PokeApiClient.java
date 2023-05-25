package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.pokemon.Gender;
import dev.greenadine.pokejava.model.pokemon.GrowthRate;
import dev.greenadine.pokejava.model.pokemon.stat.Stat;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;
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

    private <T> T result(Call<T> call) {
        try {
            return call.execute().body();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    //region Resources

    //region Stats
    @Override
    public NamedApiResourceList getStatList(int offset, int limit) {
        return result(service.getStatList(offset, limit));
    }

    @Override
    public Stat getStat(int id) {
        return result(service.getStat(id));
    }
    //endregion

    //region Genders
    @Override
    public NamedApiResourceList getGenderList(int offset, int limit) {
        return result(service.getGenderList(offset, limit));
    }

    @Override
    public Gender getGender(int id) {
        return result(service.getGender(id));
    }
    //endregion

    //region Growth rates
    @Override
    public NamedApiResourceList getGrowthRateList(int offset, int limit) {
        return result(service.getGrowthRateList(offset, limit));
    }

    @Override
    public GrowthRate getGrowthRate(int id) {
        return result(service.getGrowthRate(id));
    }
    //endregion

    //region Types
    @Override
    public NamedApiResourceList getTypeList(int offset, int limit) {
        return result(service.getTypeList(offset, limit));
    }

    @Override
    public Type getType(int id) {
        return result(service.getType(id));
    }
    //endregion

    //endregion
}
