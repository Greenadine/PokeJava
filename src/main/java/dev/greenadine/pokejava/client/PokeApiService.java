package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.pokemon.Gender;
import dev.greenadine.pokejava.model.pokemon.GrowthRate;
import dev.greenadine.pokejava.model.pokemon.ability.Ability;
import dev.greenadine.pokejava.model.pokemon.stat.Stat;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Represents the PokeAPI service.
 *
 * @since 0.1.0
 * @see PokeApi
 * @see PokeApiClient
 * @see PokeApiServiceFactory
 * @author Greenadine
 */
public interface PokeApiService {

    //region Resources

    //region Stats
    @GET("stat/")
    Call<NamedApiResourceList> getStatList(@Query("offset") int offset, @Query("limit") int limit);

    @GET("stat/{id}/")
    Call<Stat> getStatById(@Path("id") int id);

    @GET("stat/{name}/")
    Call<Stat> getStatByName(@Path("name") String name);
    //endregion

    //region Genders
    @GET("gender/")
    Call<NamedApiResourceList> getGenderList(@Query("offset") int offset, @Query("limit") int limit);

    @GET("gender/{id}/")
    Call<Gender> getGenderById(@Path("id") int id);

    @GET("gender/{name}/")
    Call<Gender> getGenderByName(@Path("name") String name);
    //endregion

    //region Growth rates
    @GET("growth-rate/")
    Call<NamedApiResourceList> getGrowthRateList(@Query("offset") int offset, @Query("limit") int limit);

    @GET("growth-rate/{id}/")
    Call<GrowthRate> getGrowthRateById(@Path("id") int id);

    @GET("growth-rate/{name}/")
    Call<GrowthRate> getGrowthRateByName(@Path("name") String name);
    //endregion

    //region Types
    @GET("type/")
    Call<NamedApiResourceList> getTypeList(@Query("offset") int offset, @Query("limit") int limit);

    @GET("type/{id}/")
    Call<Type> getTypeById(@Path("id") int id);

    @GET("type/{name}/")
    Call<Type> getTypeByName(@Path("name") String name);
    //endregion

    //region Abilities
    @GET("ability/")
    Call<NamedApiResourceList> getAbilityList(@Query("offset") int offset, @Query("limit") int limit);

    @GET("ability/{id}/")
    Call<Ability> getAbilityById(@Path("id") int id);

    @GET("ability/{name}/")
    Call<Ability> getAbilityByName(@Path("name") String name);

    //endregion
}
