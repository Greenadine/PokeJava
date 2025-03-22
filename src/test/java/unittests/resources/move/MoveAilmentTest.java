package unittests.resources.move;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.move.MoveAilment;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveAilmentTest extends PokeApiUnitTest {

    @Test
    void Get_MoveAilment_List() {
        final NamedApiResourceList moveAilmentList = api.getMoveAilments();

        assertTrue(moveAilmentList.getCount() > 0);
    }

    @Test
    void Get_MoveAilment_By_Id() {
        final MoveAilment moveAilment = api.getMoveAilmentById(1);

        assertEquals(1, moveAilment.getId());
        assertEquals("paralysis", moveAilment.getName());
    }

    @Test
    void Get_MoveAilment_By_Name() {
        final MoveAilment moveAilment = api.getMoveAilmentByName("paralysis");

        assertEquals(1, moveAilment.getId());
        assertEquals("paralysis", moveAilment.getName());
    }
}
