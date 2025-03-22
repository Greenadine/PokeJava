package unittests.resources.item;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.item.Item;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemTest extends PokeApiUnitTest {

    @Test
    void Get_Item_List() {
        final NamedApiResourceList itemList = api.getItems();

        assertTrue(itemList.getCount() > 0);
    }

    @Test
    void Get_Item_By_Id() {
        final Item item = api.getItemById(1);

        assertEquals(1, item.getId());
        assertEquals("master-ball", item.getName());
    }

    @Test
    void Get_Item_By_Name() {
        final Item item = api.getItemByName("master-ball");

        assertEquals(1, item.getId());
        assertEquals("master-ball", item.getName());
    }
}
