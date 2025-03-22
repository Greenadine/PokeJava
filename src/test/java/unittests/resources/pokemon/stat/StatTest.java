package unittests.resources.pokemon.stat;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.stat.Stat;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StatTest extends PokeApiUnitTest {

    @Test
    void Get_Stat_List() {
        final NamedApiResourceList stats = api.getStats();

        assertTrue(stats.getCount() > 0);
    }

    @Test
    void Get_Stat_By_Id() {
        final Stat stat = api.getStatById(1);

        assertEquals(1, stat.getId());
        assertEquals("hp", stat.getName());
        assertEquals(1, stat.getGameIndex());
    }

    @Test
    void Get_Stat_By_Name() {
        final Stat stat = api.getStatByName("hp");

        assertEquals(1, stat.getId());
        assertEquals("hp", stat.getName());
        assertEquals(1, stat.getGameIndex());
    }
}
