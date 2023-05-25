package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.pokemon.Gender;
import dev.greenadine.pokejava.model.pokemon.GrowthRate;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;
import retrofit2.Call;

import java.io.IOException;

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

    @Override
    public Gender getGender(int id) {
        return result(service.getGender(id));
    }

    @Override
    public NamedApiResourceList getGenderList(int offset, int limit) {
        return result(service.getGenderList(offset, limit));
    }

    @Override
    public GrowthRate getGrowthRate(int id) {
        return result(service.getGrowthRate(id));
    }

    @Override
    public NamedApiResourceList getGrowthRateList(int offset, int limit) {
        return result(service.getGrowthRateList(offset, limit));
    }

    @Override
    public Type getType(int id) {
        return result(service.getType(id));
    }

    @Override
    public NamedApiResourceList getTypeList(int offset, int limit) {
        return result(service.getTypeList(offset, limit));
    }
}
