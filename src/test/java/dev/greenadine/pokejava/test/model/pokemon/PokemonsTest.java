package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.pokemon.Pokemon;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokemonsTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_Pokemon_List() {
        NamedApiResourceList pokemon = API.getPokemon(0, 0);

        assertTrue(pokemon.getCount() > 0);
    }

    @Test
    void Get_Pokemon_By_Id() {
        Pokemon pokemon = API.getPokemonById(1);

        assertEquals(1, pokemon.getId());
        assertEquals("bulbasaur", pokemon.getName());
    }

    @Test
    void Get_Pokemon_By_Name() {
        Pokemon pokemon = API.getPokemonByName("bulbasaur");

        assertEquals(1, pokemon.getId());
        assertEquals("bulbasaur", pokemon.getName());
    }

    @Test
    void Pokemon_Sprites() {
        Pokemon pokemon = API.getPokemonById(1);

        assertNotNull(pokemon.getSprites().versions().getGeneration("generation-v").getGame("black-white").animated().backDefault());
    }
}
