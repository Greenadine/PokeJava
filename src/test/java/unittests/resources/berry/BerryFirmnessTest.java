package unittests.resources.berry;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.berry.BerryFirmness;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BerryFirmnessTest extends PokeApiUnitTest {

    @Test
    void Get_BerryFirmness_List() {
        final NamedApiResourceList berryFirmnessList = api.getBerryFirmnesses();

        assertTrue(berryFirmnessList.getCount() > 0);
    }

    @Test
    void Get_BerryFirmness_By_Id() {
        final BerryFirmness berryFirmness = api.getBerryFirmnessById(1);

        assertEquals(1, berryFirmness.getId());
        assertEquals("very-soft", berryFirmness.getName());
    }

    @Test
    void Get_BerryFirmness_By_Name() {
        final BerryFirmness berryFirmness = api.getBerryFirmnessByName("very-soft");

        assertEquals(1, berryFirmness.getId());
        assertEquals("very-soft", berryFirmness.getName());
    }
}
