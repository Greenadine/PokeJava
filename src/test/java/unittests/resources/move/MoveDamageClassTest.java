package unittests.resources.move;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.move.MoveDamageClass;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveDamageClassTest extends PokeApiUnitTest {

    @Test
    void Get_MoveDamageClass_List() {
        final NamedApiResourceList moveDamageClassList = api.getMoveDamageClasses();

        assertTrue(moveDamageClassList.getCount() > 0);
    }

    @Test
    void Get_MoveDamageClass_By_Id() {
        final MoveDamageClass moveDamageClass = api.getMoveDamageClassById(1);

        assertEquals(1, moveDamageClass.getId());
        assertEquals("status", moveDamageClass.getName());
    }

    @Test
    void Get_MoveDamageClass_By_Name() {
        final MoveDamageClass moveDamageClass = api.getMoveDamageClassByName("status");

        assertEquals(1, moveDamageClass.getId());
        assertEquals("status", moveDamageClass.getName());
    }
}
