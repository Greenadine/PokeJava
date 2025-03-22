package unittests.resources.game;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.game.Version;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VersionTest extends PokeApiUnitTest {

    @Test
    void Get_Version_List() {
        final NamedApiResourceList versionList = api.getContestTypes();

        assertTrue(versionList.getCount() > 0);
    }

    @Test
    void Get_Version_By_Id() {
        final Version version = api.getVersionById(1);

        assertEquals(1, version.getId());
        assertEquals("red", version.getName());
    }

    @Test
    void Get_Version_By_Name() {
        final Version version = api.getVersionByName("red");

        assertEquals(1, version.getId());
        assertEquals("red", version.getName());
    }
}
