package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.pokemon.Characteristic;
import dev.greenadine.pokejava.model.pokemon.EggGroup;
import dev.greenadine.pokejava.model.pokemon.Gender;
import dev.greenadine.pokejava.model.pokemon.GrowthRate;
import dev.greenadine.pokejava.model.pokemon.ability.Ability;
import dev.greenadine.pokejava.model.pokemon.nature.Nature;
import dev.greenadine.pokejava.model.pokemon.pokeathlon.PokeathlonStat;
import dev.greenadine.pokejava.model.pokemon.stat.Stat;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import dev.greenadine.pokejava.model.resource.ApiResourceList;
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

    //region Characteristics
    @GET("characteristic/")
    Call<ApiResourceList> getCharacteristicList(@Query("offset") int offset, @Query("limit") int limit);

    @GET("characteristic/{id}/")
    Call<Characteristic> getCharacteristic(@Path("id") int id);
    //endregion

    //region Egg groups
    @GET("egg-group/")
    Call<NamedApiResourceList> getEggGroupList(@Query("offset") int offset, @Query("limit") int limit);

    @GET("egg-group/{id}/")
    Call<EggGroup> getEggGroupById(@Path("id") int id);

    @GET("egg-group/{name}/")
    Call<EggGroup> getEggGroupByName(@Path("name") String name);
    //endregion

    //region Natures
    @GET("nature/")
    Call<NamedApiResourceList> getNatureList(@Query("offset") int offset, @Query("limit") int limit);

    @GET("nature/{id}/")
    Call<Nature> getNatureById(@Path("id") int id);

    @GET("nature/{name}/")
    Call<Nature> getNatureByName(@Path("name") String name);
    //endregion

    //region Pokeathlon stats
    @GET("pokeathlon-stat/")
    Call<NamedApiResourceList> getPokeathlonStatList(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokeathlon-stat/{id}/")
    Call<PokeathlonStat> getPokeathlonStatById(@Path("id") int id);

    @GET("pokeathlon-stat/{name}/")
    Call<PokeathlonStat> getPokeathlonStatByName(@Path("name") String name);
    //endregion

    //endregion
}
