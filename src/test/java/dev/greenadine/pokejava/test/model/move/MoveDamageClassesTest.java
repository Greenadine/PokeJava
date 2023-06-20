package dev.greenadine.pokejava.test.model.move;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.move.MoveDamageClass;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveDamageClassesTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_MoveDamageClass_List() {
        NamedApiResourceList moveDamageClassList = API.getMoveDamageClasses(0, 0);

        assertTrue(moveDamageClassList.getCount() > 0);
    }

    @Test
    void Get_MoveDamageClass_By_Id() {
        MoveDamageClass moveDamageClass = API.getMoveDamageClassById(1);

        assertEquals(1, moveDamageClass.getId());
        assertEquals("status", moveDamageClass.getName());
    }

    @Test
    void Get_MoveDamageClass_By_Name() {
        MoveDamageClass moveDamageClass = API.getMoveDamageClassByName("status");

        assertEquals(1, moveDamageClass.getId());
        assertEquals("status", moveDamageClass.getName());
    }
}
