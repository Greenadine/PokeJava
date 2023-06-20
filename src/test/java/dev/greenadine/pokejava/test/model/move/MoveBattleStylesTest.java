package dev.greenadine.pokejava.test.model.move;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.move.MoveBattleStyle;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveBattleStylesTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_MoveBattleStyle_List() {
        NamedApiResourceList moveBattleStyleList = API.getMoveBattleStyles(0, 0);

        assertTrue(moveBattleStyleList.getCount() > 0);
    }

    @Test
    void Get_MoveBattleStyle_By_Id() {
        MoveBattleStyle moveBattleStyle = API.getMoveBattleStyleById(1);

        assertEquals(1, moveBattleStyle.getId());
        assertEquals("attack", moveBattleStyle.getName());
    }

    @Test
    void Get_MoveBattleStyle_By_Name() {
        MoveBattleStyle moveBattleStyle = API.getMoveBattleStyleByName("attack");

        assertEquals(1, moveBattleStyle.getId());
        assertEquals("attack", moveBattleStyle.getName());
    }
}
