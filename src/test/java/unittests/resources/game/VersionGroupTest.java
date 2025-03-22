package unittests.resources.game;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.game.VersionGroup;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VersionGroupTest extends PokeApiUnitTest {

    @Test
    void Get_VersionGroup_List() {
        final NamedApiResourceList versionGroupList = api.getContestTypes();

        assertTrue(versionGroupList.getCount() > 0);
    }

    @Test
    void Get_VersionGroup_By_Id() {
        final VersionGroup contestType = api.getVersionGroupById(1);

        assertEquals(1, contestType.getId());
        assertEquals("red-blue", contestType.getName());
    }

    @Test
    void Get_VersionGroup_By_Name() {
        final VersionGroup contestType = api.getVersionGroupByName("red-blue");

        assertEquals(1, contestType.getId());
        assertEquals("red-blue", contestType.getName());
    }
}
