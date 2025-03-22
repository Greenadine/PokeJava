package unittests.resources.pokemon.pokeathlon;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.pokeathlon.PokeathlonStat;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokeathlonStatTest extends PokeApiUnitTest {

    @Test
    void Get_PokeathlonStat_List() {
        final NamedApiResourceList pokeathlonStats = api.getPokeathlonStats();

        assertTrue(pokeathlonStats.getCount() > 0);
    }

    @Test
    void Get_PokeathlonStat_By_Id() {
        final PokeathlonStat pokeathlonStat = api.getPokeathlonStatById(1);

        assertEquals(1, pokeathlonStat.getId());
        assertEquals("speed", pokeathlonStat.getName());
    }

    @Test
    void Get_PokeathlonStat_By_Name() {
        final PokeathlonStat pokeathlonStat = api.getPokeathlonStatByName("speed");

        assertEquals(1, pokeathlonStat.getId());
        assertEquals("speed", pokeathlonStat.getName());
    }
}
