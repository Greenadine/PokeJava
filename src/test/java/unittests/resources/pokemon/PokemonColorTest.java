package unittests.resources.pokemon;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.PokemonColor;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokemonColorTest extends PokeApiUnitTest {

    @Test
    void Get_PokemonColor_List() {
        final NamedApiResourceList pokemonColors = api.getPokemonColors();

        assertTrue(pokemonColors.getCount() > 0);
    }

    @Test
    void Get_PokemonColor_By_Id() {
        final PokemonColor color = api.getPokemonColorById(1);

        assertEquals(1, color.getId());
        assertEquals("black", color.getName());
    }

    @Test
    void Get_PokemonColor_By_Name() {
        final PokemonColor color = api.getPokemonColorByName("black");

        assertEquals(1, color.getId());
        assertEquals("black", color.getName());
    }
}
