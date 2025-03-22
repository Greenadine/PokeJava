package unittests.resources.move;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.move.MoveLearnMethod;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveLearnMethodTest extends PokeApiUnitTest {

    @Test
    void Get_MoveLearnMethod_List() {
        final NamedApiResourceList moveLearnMethodList = api.getMoveLearnMethods();

        assertTrue(moveLearnMethodList.getCount() > 0);
    }

    @Test
    void Get_MoveLearnMethod_By_Id() {
        final MoveLearnMethod moveLearnMethod = api.getMoveLearnMethodById(1);

        assertEquals(1, moveLearnMethod.getId());
        assertEquals("level-up", moveLearnMethod.getName());
    }

    @Test
    void Get_MoveLearnMethod_By_Name() {
        final MoveLearnMethod moveLearnMethod = api.getMoveLearnMethodByName("level-up");

        assertEquals(1, moveLearnMethod.getId());
        assertEquals("level-up", moveLearnMethod.getName());
    }
}
