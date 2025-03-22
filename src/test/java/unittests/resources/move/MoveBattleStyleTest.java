package unittests.resources.move;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.move.MoveBattleStyle;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveBattleStyleTest extends PokeApiUnitTest {

    @Test
    void Get_MoveBattleStyle_List() {
        final NamedApiResourceList moveBattleStyleList = api.getMoveBattleStyles();

        assertTrue(moveBattleStyleList.getCount() > 0);
    }

    @Test
    void Get_MoveBattleStyle_By_Id() {
        final MoveBattleStyle moveBattleStyle = api.getMoveBattleStyleById(1);

        assertEquals(1, moveBattleStyle.getId());
        assertEquals("attack", moveBattleStyle.getName());
    }

    @Test
    void Get_MoveBattleStyle_By_Name() {
        final MoveBattleStyle moveBattleStyle = api.getMoveBattleStyleByName("attack");

        assertEquals(1, moveBattleStyle.getId());
        assertEquals("attack", moveBattleStyle.getName());
    }
}
