package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.pokemon.type.Type;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface PokeApiService {

    //region Resources

    //region Types
    @GET("type/")
    Call<List<Type>> getTypeList(@Query("offset") int offset, @Query("limit") int limit);

    @GET("type/{id}/")
    Call<Type> getType(@Path("id") int id);
    //endregion

    //endregion
}
