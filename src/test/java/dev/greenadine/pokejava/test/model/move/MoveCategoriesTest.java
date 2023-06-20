package dev.greenadine.pokejava.test.model.move;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.move.MoveCategory;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveCategoriesTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_MoveCategory_List() {
        NamedApiResourceList moveCategoryList = API.getMoveCategories(0, 0);

        assertTrue(moveCategoryList.getCount() > 0);
    }

    @Test
    void Get_MoveCategory_By_Id() {
        MoveCategory moveCategory = API.getMoveCategoryById(1);

        assertEquals(1, moveCategory.getId());
        assertEquals("ailment", moveCategory.getName());
    }

    @Test
    void Get_MoveCategory_By_Name() {
        MoveCategory moveCategory = API.getMoveCategoryByName("ailment");

        assertEquals(1, moveCategory.getId());
        assertEquals("ailment", moveCategory.getName());
    }
}
