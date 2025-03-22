package unittests.resources.move;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.move.MoveCategory;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MoveCategoryTest extends PokeApiUnitTest {

    @Test
    void Get_MoveCategory_List() {
        final NamedApiResourceList moveCategoryList = api.getMoveCategories();

        assertTrue(moveCategoryList.getCount() > 0);
    }

    @Test
    void Get_MoveCategory_By_Id() {
        final MoveCategory moveCategory = api.getMoveCategoryById(1);

        assertEquals(1, moveCategory.getId());
        assertEquals("ailment", moveCategory.getName());
    }

    @Test
    void Get_MoveCategory_By_Name() {
        final MoveCategory moveCategory = api.getMoveCategoryByName("ailment");

        assertEquals(1, moveCategory.getId());
        assertEquals("ailment", moveCategory.getName());
    }
}
