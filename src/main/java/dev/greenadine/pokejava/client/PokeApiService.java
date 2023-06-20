package dev.greenadine.pokejava.client;

import dev.greenadine.pokejava.model.common.resource.ApiResourceList;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.move.MoveLearnMethod;
import dev.greenadine.pokejava.model.move.MoveTarget;
import dev.greenadine.pokejava.model.pokemon.*;
import dev.greenadine.pokejava.model.pokemon.ability.Ability;
import dev.greenadine.pokejava.model.pokemon.evolution.EvolutionChain;
import dev.greenadine.pokejava.model.pokemon.evolution.EvolutionTrigger;
import dev.greenadine.pokejava.model.pokemon.form.PokemonForm;
import dev.greenadine.pokejava.model.pokemon.gender.Gender;
import dev.greenadine.pokejava.model.pokemon.growthrate.GrowthRate;
import dev.greenadine.pokejava.model.pokemon.nature.Nature;
import dev.greenadine.pokejava.model.pokemon.pokeathlon.PokeathlonStat;
import dev.greenadine.pokejava.model.pokemon.shape.PokemonShape;
import dev.greenadine.pokejava.model.pokemon.species.PokemonSpecies;
import dev.greenadine.pokejava.model.pokemon.stat.Stat;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Represents the PokeAPI service.
 *
 * @see PokeApi
 * @see PokeApiClient
 * @see PokeApiServiceFactory
 *
 * @since 0.1.0
 * @author Greenadine
 */
public interface PokeApiService {

    //region Resources

    //region Stats
    @GET("stat/")
    Call<NamedApiResourceList> getStats(@Query("offset") int offset, @Query("limit") int limit);

    @GET("stat/{id}/")
    Call<Stat> getStatById(@Path("id") int id);

    @GET("stat/{name}/")
    Call<Stat> getStatByName(@Path("name") String name);
    //endregion

    //region Genders
    @GET("gender/")
    Call<NamedApiResourceList> getGenders(@Query("offset") int offset, @Query("limit") int limit);

    @GET("gender/{id}/")
    Call<Gender> getGenderById(@Path("id") int id);

    @GET("gender/{name}/")
    Call<Gender> getGenderByName(@Path("name") String name);
    //endregion

    //region Growth rates
    @GET("growth-rate/")
    Call<NamedApiResourceList> getGrowthRates(@Query("offset") int offset, @Query("limit") int limit);

    @GET("growth-rate/{id}/")
    Call<GrowthRate> getGrowthRateById(@Path("id") int id);

    @GET("growth-rate/{name}/")
    Call<GrowthRate> getGrowthRateByName(@Path("name") String name);
    //endregion

    //region Types
    @GET("type/")
    Call<NamedApiResourceList> getTypes(@Query("offset") int offset, @Query("limit") int limit);

    @GET("type/{id}/")
    Call<Type> getTypeById(@Path("id") int id);

    @GET("type/{name}/")
    Call<Type> getTypeByName(@Path("name") String name);
    //endregion

    //region Abilities
    @GET("ability/")
    Call<NamedApiResourceList> getAbility(@Query("offset") int offset, @Query("limit") int limit);

    @GET("ability/{id}/")
    Call<Ability> getAbilityById(@Path("id") int id);

    @GET("ability/{name}/")
    Call<Ability> getAbilityByName(@Path("name") String name);
    //endregion

    //region Characteristics
    @GET("characteristic/")
    Call<ApiResourceList> getCharacteristic(@Query("offset") int offset, @Query("limit") int limit);

    @GET("characteristic/{id}/")
    Call<Characteristic> getCharacteristic(@Path("id") int id);
    //endregion

    //region Egg groups
    @GET("egg-group/")
    Call<NamedApiResourceList> getEggGroup(@Query("offset") int offset, @Query("limit") int limit);

    @GET("egg-group/{id}/")
    Call<EggGroup> getEggGroupById(@Path("id") int id);

    @GET("egg-group/{name}/")
    Call<EggGroup> getEggGroupByName(@Path("name") String name);
    //endregion

    //region Natures
    @GET("nature/")
    Call<NamedApiResourceList> getNature(@Query("offset") int offset, @Query("limit") int limit);

    @GET("nature/{id}/")
    Call<Nature> getNatureById(@Path("id") int id);

    @GET("nature/{name}/")
    Call<Nature> getNatureByName(@Path("name") String name);
    //endregion

    //region Pokeathlon stats
    @GET("pokeathlon-stat/")
    Call<NamedApiResourceList> getPokeathlonStat(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokeathlon-stat/{id}/")
    Call<PokeathlonStat> getPokeathlonStatById(@Path("id") int id);

    @GET("pokeathlon-stat/{name}/")
    Call<PokeathlonStat> getPokeathlonStatByName(@Path("name") String name);
    //endregion

    //region Pokémon colors
    @GET("pokemon-color/")
    Call<NamedApiResourceList> getPokemonColor(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokemon-color/{id}/")
    Call<PokemonColor> getPokemonColorById(@Path("id") int id);

    @GET("pokemon-color/{name}/")
    Call<PokemonColor> getPokemonColorByName(@Path("name") String name);
    //endregion

    //region Pokémon habitats
    @GET("pokemon-habitat/")
    Call<NamedApiResourceList> getPokemonHabitat(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokemon-habitat/{id}/")
    Call<PokemonHabitat> getPokemonHabitatById(@Path("id") int id);

    @GET("pokemon-habitat/{name}/")
    Call<PokemonHabitat> getPokemonHabitatByName(@Path("name") String name);
    //endregion

    //region Pokémon shapes
    @GET("pokemon-shape/")
    Call<NamedApiResourceList> getPokemonShape(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokemon-shape/{id}/")
    Call<PokemonShape> getPokemonShapeById(@Path("id") int id);

    @GET("pokemon-shape/{name}/")
    Call<PokemonShape> getPokemonShapeByName(@Path("name") String name);
    //endregion

    //region Pokémon species
    @GET("pokemon-species/")
    Call<NamedApiResourceList> getPokemonSpecies(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokemon-species/{id}/")
    Call<PokemonSpecies> getPokemonSpeciesById(@Path("id") int id);

    @GET("pokemon-species/{name}/")
    Call<PokemonSpecies> getPokemonSpeciesByName(@Path("name") String name);
    //endregion

    //region Pokémon forms
    @GET("pokemon-form/")
    Call<NamedApiResourceList> getPokemonForms(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokemon-form/{id}/")
    Call<PokemonForm> getPokemonFormById(@Path("id") int id);

    @GET("pokemon-form/{name}/")
    Call<PokemonForm> getPokemonFormByName(@Path("name") String name);
    //endregion

    //region Pokémon
    @GET("pokemon/")
    Call<NamedApiResourceList> getPokemon(@Query("offset") int offset, @Query("limit") int limit);

    @GET("pokemon/{id}/")
    Call<Pokemon> getPokemonById(@Path("id") int id);

    @GET("pokemon/{name}/")
    Call<Pokemon> getPokemonByName(@Path("name") String name);
    //endregion

    //region Evolution chains
    @GET("evolution-chain/")
    Call<ApiResourceList> getEvolutionChains(@Query("offset") int offset, @Query("limit") int limit);

    @GET("evolution-chain/{id}/")
    Call<EvolutionChain> getEvolutionChainById(@Path("id") int id);
    //endregion

    //region Evolution triggers
    @GET("evolution-trigger/")
    Call<NamedApiResourceList> getEvolutionTriggers(@Query("offset") int offset, @Query("limit") int limit);

    @GET("evolution-trigger/{id}/")
    Call<EvolutionTrigger> getEvolutionTriggerById(@Path("id") int id);

    @GET("evolution-trigger/{name}/")
    Call<EvolutionTrigger> getEvolutionTriggerByName(@Path("name") String name);
    //endregion

    //region Move targets
    @GET("move-target/")
    Call<NamedApiResourceList> getMoveTargets(@Query("offset") int offset, @Query("limit") int limit);

    @GET("move-target/{id}/")
    Call<MoveTarget> getMoveTargetById(@Path("id") int id);

    @GET("move-target/{name}/")
    Call<MoveTarget> getMoveTargetByName(@Path("name") String name);
    //endregion

    //region Move learn methods
    @GET("move-learn-method/")
    Call<NamedApiResourceList> getMoveLearnMethods(@Query("offset") int offset, @Query("limit") int limit);

    @GET("move-learn-method/{id}/")
    Call<MoveLearnMethod> getMoveLearnMethodById(@Path("id") int id);

    @GET("move-learn-method/{name}/")
    Call<MoveLearnMethod> getMoveLearnMethodByName(@Path("name") String name);
    //endregion

    //endregion
}
