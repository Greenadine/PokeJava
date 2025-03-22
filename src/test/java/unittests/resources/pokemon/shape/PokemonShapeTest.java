package unittests.resources.pokemon.shape;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.shape.PokemonShape;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokemonShapeTest extends PokeApiUnitTest {

    @Test
    void Get_PokemonShape_List() {
        final NamedApiResourceList pokemonShapes = api.getPokemonShapes();

        assertTrue(pokemonShapes.getCount() > 0);
    }

    @Test
    void Get_PokemonShape_By_Id() {
        final PokemonShape shape = api.getPokemonShapeById(1);

        assertEquals(1, shape.getId());
        assertEquals("ball", shape.getName());
    }

    @Test
    void Get_PokemonShape_By_Name() {
        final PokemonShape shape = api.getPokemonShapeByName("ball");

        assertEquals(1, shape.getId());
        assertEquals("ball", shape.getName());
    }
}
