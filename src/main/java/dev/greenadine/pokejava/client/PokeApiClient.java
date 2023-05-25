package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.pokemon.type.Type;
import retrofit2.Call;

import java.io.IOException;
import java.util.List;

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
    public Type getType(int id) {
        return result(service.getType(id));
    }

    @Override
    public List<Type> getTypeList(int offset, int limit) {
        return result(service.getTypeList(offset, limit));
    }
}
