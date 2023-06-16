package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.pokemon.shape.PokemonShape;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonShapesTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_PokemonShape_List() {
        NamedApiResourceList pokemonShapes = API.getPokemonShapeList(0, -1);

        assertEquals(14, pokemonShapes.getCount());
    }

    @Test
    void Get_PokemonShape_By_Id() {
        PokemonShape shape = API.getPokemonShapeById(1);

        assertEquals(1, shape.getId());
        assertEquals("ball", shape.getName());
    }

    @Test
    void Get_PokemonShape_By_Name() {
        PokemonShape shape = API.getPokemonShapeByName("ball");

        assertEquals(1, shape.getId());
        assertEquals("ball", shape.getName());
    }
}
