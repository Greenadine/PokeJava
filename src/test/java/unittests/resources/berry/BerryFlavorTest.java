package unittests.resources.berry;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.berry.BerryFlavor;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BerryFlavorTest extends PokeApiUnitTest {

    @Test
    void Get_BerryFlavor_List() {
        final NamedApiResourceList berryFlavorList = api.getBerryFlavors();

        assertTrue(berryFlavorList.getCount() > 0);
    }

    @Test
    void Get_BerryFlavor_By_Id() {
        final BerryFlavor berryFlavor = api.getBerryFlavorById(1);

        assertEquals(1, berryFlavor.getId());
        assertEquals("spicy", berryFlavor.getName());
    }

    @Test
    void Get_BerryFlavor_By_Name() {
        final BerryFlavor berryFlavor = api.getBerryFlavorByName("spicy");

        assertEquals(1, berryFlavor.getId());
        assertEquals("spicy", berryFlavor.getName());
    }
}
