package unittests.resources.move;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.move.Move;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveTest extends PokeApiUnitTest {

    @Test
    void Get_Moves_List() {
        final NamedApiResourceList moves = api.getMoves();

        assertTrue(moves.getCount() > 0);
    }

    @Test
    void Get_Move_By_Id() {
        final Move move = api.getMoveById(1);

        assertEquals(1, move.getId());
        assertEquals("pound", move.getName());
    }

    @Test
    void Get_Move_By_Name() {
        final Move move = api.getMoveByName("pound");

        assertEquals(1, move.getId());
        assertEquals("pound", move.getName());
    }
}
