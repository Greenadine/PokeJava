package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.pokemon.Gender;
import dev.greenadine.pokejava.model.pokemon.GrowthRate;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface PokeApiService {

    //region Resources

    //region Genders
    @GET("gender/")
    Call<List<Gender>> getGenderList(@Query("offset") int offset, @Query("limit") int limit);

    @GET("gender/{id}/")
    Call<Gender> getGender(@Path("id") int id);
    //endergion

    //region Growth rates
    @GET("growth-rate/")
    Call<List<GrowthRate>> getGrowthRateList(@Query("offset") int offset, @Query("limit") int limit);

    @GET("growth-rate/{id}/")
    Call<GrowthRate> getGrowthRate(@Path("id") int id);
    //endregion

    //region Types
    @GET("type/")
    Call<List<Type>> getTypeList(@Query("offset") int offset, @Query("limit") int limit);

    @GET("type/{id}/")
    Call<Type> getType(@Path("id") int id);
    //endregion

    //endregion
}
