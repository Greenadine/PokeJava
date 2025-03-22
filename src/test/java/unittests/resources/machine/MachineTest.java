package unittests.resources.machine;

import dev.greenadine.pokejava.resource.ApiResourceList;
import dev.greenadine.pokejava.resource.machine.Machine;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MachineTest extends PokeApiUnitTest {

    @Test
    void Get_Machine_List() {
        final ApiResourceList contestTypeList = api.getMachines();

        assertTrue(contestTypeList.getCount() > 0);
    }

    @Test
    void Get_Machine_By_Id() {
        final Machine contestType = api.getMachineById(1);

        assertEquals(1, contestType.getId());
    }
}
