package unittests.resources.location;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.location.Location;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LocationTest extends PokeApiUnitTest {

    @Test
    void Get_Location_List() {
        final NamedApiResourceList locationList = api.getLocations();

        assertTrue(locationList.getCount() > 0);
    }

    @Test
    void Get_Location_By_Id() {
        final Location location = api.getLocationById(1);

        assertEquals(1, location.getId());
        assertEquals("canalave-city", location.getName());
    }

    @Test
    void Get_Location_By_Name() {
        final Location location = api.getLocationByName("canalave-city");

        assertEquals(1, location.getId());
        assertEquals("canalave-city", location.getName());
    }
}
