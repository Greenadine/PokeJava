package dev.greenadine.pokejava.test.model.move;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.move.MoveAilment;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveAilmentsTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_MoveAilment_List() {
        NamedApiResourceList moveAilmentList = API.getMoveAilments(0, 0);

        assertTrue(moveAilmentList.getCount() > 0);
    }

    @Test
    void Get_MoveAilment_By_Id() {
        MoveAilment moveAilment = API.getMoveAilmentById(1);

        assertEquals(1, moveAilment.getId());
        assertEquals("paralysis", moveAilment.getName());
    }

    @Test
    void Get_MoveAilment_By_Name() {
        MoveAilment moveAilment = API.getMoveAilmentByName("paralysis");

        assertEquals(1, moveAilment.getId());
        assertEquals("paralysis", moveAilment.getName());
    }
}
