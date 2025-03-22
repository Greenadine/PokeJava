package unittests.resources.location;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.location.PalParkArea;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalParkAreaTest extends PokeApiUnitTest {

    @Test
    void Get_PalParkArea_List() {
        final NamedApiResourceList palParkAreaList = api.getPalParkAreas();

        assertTrue(palParkAreaList.getCount() > 0);
    }

    @Test
    void Get_PalParkArea_By_Id() {
        final PalParkArea palParkArea = api.getPalParkAreaById(1);

        assertEquals(1, palParkArea.getId());
        assertEquals("forest", palParkArea.getName());
    }

    @Test
    void Get_PalParkArea_By_Name() {
        final PalParkArea palParkArea = api.getPalParkAreaByName("forest");

        assertEquals(1, palParkArea.getId());
        assertEquals("forest", palParkArea.getName());
    }
}
