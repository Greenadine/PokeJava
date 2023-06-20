package dev.greenadine.pokejava.test.model.move;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.move.MoveTarget;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveTargetsTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_MoveTarget_List() {
        NamedApiResourceList moveTargetList = API.getMoveTargets(0, 0);

        assertTrue(moveTargetList.getCount() > 0);
    }

    @Test
    void Get_MoveTarget_By_Id() {
        MoveTarget moveTarget = API.getMoveTargetById(1);

        assertEquals(1, moveTarget.getId());
        assertEquals("specific-move", moveTarget.getName());
    }

    @Test
    void Get_MoveTarget_By_Name() {
        MoveTarget moveTarget = API.getMoveTargetByName("specific-move");

        assertEquals(1, moveTarget.getId());
        assertEquals("specific-move", moveTarget.getName());
    }
}
