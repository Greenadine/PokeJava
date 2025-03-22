package unittests.resources.berry;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.berry.Berry;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BerryTest extends PokeApiUnitTest {

    @Test
    void Get_Berry_List() {
        final NamedApiResourceList berryList = api.getBerries();

        assertTrue(berryList.getCount() > 0);
    }

    @Test
    void Get_Berry_By_Id() {
        final Berry berry = api.getBerryById(1);

        assertEquals(1, berry.getId());
        assertEquals("cheri", berry.getName());
    }

    @Test
    void Get_Berry_By_Name() {
        final Berry berry = api.getBerryByName("cheri");

        assertEquals(1, berry.getId());
        assertEquals("cheri", berry.getName());
    }
}
