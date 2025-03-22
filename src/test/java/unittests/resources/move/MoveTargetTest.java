package unittests.resources.move;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.move.MoveTarget;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveTargetTest extends PokeApiUnitTest {

    @Test
    void Get_MoveTarget_List() {
        final NamedApiResourceList moveTargetList = api.getMoveTargets();

        assertTrue(moveTargetList.getCount() > 0);
    }

    @Test
    void Get_MoveTarget_By_Id() {
        final MoveTarget moveTarget = api.getMoveTargetById(1);

        assertEquals(1, moveTarget.getId());
        assertEquals("specific-move", moveTarget.getName());
    }

    @Test
    void Get_MoveTarget_By_Name() {
        final MoveTarget moveTarget = api.getMoveTargetByName("specific-move");

        assertEquals(1, moveTarget.getId());
        assertEquals("specific-move", moveTarget.getName());
    }
}
