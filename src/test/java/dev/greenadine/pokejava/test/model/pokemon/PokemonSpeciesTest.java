package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.pokemon.species.PokemonSpecies;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokemonSpeciesTest {

    private final PokeApi pokeApi = Main.API;

    @Test
    void Get_PokemonSpecies_List() {
        NamedApiResourceList pokemonSpecies = pokeApi.getPokemonSpecies(0, 0);

        assertTrue(pokemonSpecies.getCount() > 0);
    }

    @Test
    void Get_PokemonSpecies_By_Id() {
        PokemonSpecies pokemonSpecies = pokeApi.getPokemonSpeciesById(1);

        assertEquals(1, pokemonSpecies.getId());
        assertEquals("bulbasaur", pokemonSpecies.getName());
    }

    @Test
    void Get_PokemonSpecies_By_Name() {
        PokemonSpecies pokemonSpecies = pokeApi.getPokemonSpeciesByName("bulbasaur");

        assertEquals(1, pokemonSpecies.getId());
        assertEquals("bulbasaur", pokemonSpecies.getName());
    }
}
