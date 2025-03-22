package unittests.resources.location;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.location.Region;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegionTest extends PokeApiUnitTest {

    @Test
    void Get_Region_List() {
        final NamedApiResourceList regionList = api.getRegions();

        assertTrue(regionList.getCount() > 0);
    }

    @Test
    void Get_Region_By_Id() {
        final Region region = api.getRegionById(1);

        assertEquals(1, region.getId());
        assertEquals("kanto", region.getName());
    }

    @Test
    void Get_Region_By_Name() {
        final Region region = api.getRegionByName("kanto");

        assertEquals(1, region.getId());
        assertEquals("kanto", region.getName());
    }
}
