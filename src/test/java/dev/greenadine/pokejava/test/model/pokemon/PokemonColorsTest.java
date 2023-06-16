package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.pokemon.PokemonColor;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonColorsTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_PokemonColor_List() {
        NamedApiResourceList pokemonColors = API.getPokemonColorList(0, -1);

        assertEquals(10, pokemonColors.getCount());
    }

    @Test
    void Get_PokemonColor_By_Id() {
        PokemonColor color = API.getPokemonColorById(1);

        assertEquals(1, color.getId());
        assertEquals("black", color.getName());
    }

    @Test
    void Get_PokemonColor_By_Name() {
        PokemonColor color = API.getPokemonColorByName("black");

        assertEquals(1, color.getId());
        assertEquals("black", color.getName());
    }
}
