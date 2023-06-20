package dev.greenadine.pokejava.test.model.move;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.move.MoveLearnMethod;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveLearnMethodsTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_MoveLearnMethod_List() {
        NamedApiResourceList moveLearnMethodList = API.getMoveLearnMethods(0, 0);

        assertTrue(moveLearnMethodList.getCount() > 0);
    }

    @Test
    void Get_MoveLearnMethod_By_Id() {
        MoveLearnMethod moveLearnMethod = API.getMoveLearnMethodById(1);

        assertEquals(1, moveLearnMethod.getId());
        assertEquals("level-up", moveLearnMethod.getName());
    }

    @Test
    void Get_MoveLearnMethod_By_Name() {
        MoveLearnMethod moveLearnMethod = API.getMoveLearnMethodByName("level-up");

        assertEquals(1, moveLearnMethod.getId());
        assertEquals("level-up", moveLearnMethod.getName());
    }
}
