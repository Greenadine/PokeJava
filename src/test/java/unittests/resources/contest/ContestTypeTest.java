package unittests.resources.contest;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.contest.ContestType;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContestTypeTest extends PokeApiUnitTest {

    @Test
    void Get_ContestType_List() {
        final NamedApiResourceList contestTypeList = api.getContestTypes();

        assertTrue(contestTypeList.getCount() > 0);
    }

    @Test
    void Get_ContestType_By_Id() {
        final ContestType contestType = api.getContestTypeById(1);

        assertEquals(1, contestType.getId());
        assertEquals("cool", contestType.getName());
    }

    @Test
    void Get_ContestType_By_Name() {
        final ContestType contestType = api.getContestTypeByName("cool");

        assertEquals(1, contestType.getId());
        assertEquals("cool", contestType.getName());
    }
}
