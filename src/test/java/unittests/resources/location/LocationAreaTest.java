package unittests.resources.location;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.location.LocationArea;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LocationAreaTest extends PokeApiUnitTest {

    @Test
    void Get_LocationArea_List() {
        final NamedApiResourceList locationAreaList = api.getLocationAreas();

        assertTrue(locationAreaList.getCount() > 0);
    }

    @Test
    void Get_LocationArea_By_Id() {
        final LocationArea locationArea = api.getLocationAreaById(1);

        assertEquals(1, locationArea.getId());
        assertEquals("canalave-city-area", locationArea.getName());
    }

    @Test
    void Get_LocationArea_By_Name() {
        final LocationArea locationArea = api.getLocationAreaByName("canalave-city-area");

        assertEquals(1, locationArea.getId());
        assertEquals("canalave-city-area", locationArea.getName());
    }
}
