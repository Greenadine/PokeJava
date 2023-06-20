package dev.greenadine.pokejava.test.model.move;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.move.Move;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovesTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_Moves_List() {
        NamedApiResourceList moves = API.getMoves(0, 0);

        assertTrue(moves.getCount() > 0);
    }

    @Test
    void Get_Move_By_Id() {
        Move move = API.getMoveById(1);

        assertEquals(1, move.getId());
        assertEquals("pound", move.getName());
    }

    @Test
    void Get_Move_By_Name() {
        Move move = API.getMoveByName("pound");

        assertEquals(1, move.getId());
        assertEquals("pound", move.getName());
    }
}
