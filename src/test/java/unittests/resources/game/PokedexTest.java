package unittests.resources.game;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.game.Pokedex;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokedexTest extends PokeApiUnitTest {

    @Test
    void Get_Pokedex_List() {
        final NamedApiResourceList pokedexList = api.getPokedexes();

        assertTrue(pokedexList.getCount() > 0);
    }

    @Test
    void Get_Pokedex_By_Id() {
        final Pokedex pokedex = api.getPokedexById(1);

        assertEquals(1, pokedex.getId());
        assertEquals("national", pokedex.getName());
    }

    @Test
    void Get_Pokedex_By_Name() {
        final Pokedex pokedex = api.getPokedexByName("national");

        assertEquals(1, pokedex.getId());
        assertEquals("national", pokedex.getName());
    }
}
