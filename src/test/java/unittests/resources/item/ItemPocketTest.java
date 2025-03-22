package unittests.resources.item;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.item.ItemPocket;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemPocketTest extends PokeApiUnitTest {

    @Test
    void Get_ItemPocket_List() {
        final NamedApiResourceList contestTypeList = api.getItemPockets();

        assertTrue(contestTypeList.getCount() > 0);
    }

    @Test
    void Get_ItemPocket_By_Id() {
        final ItemPocket itemPocket = api.getItemPocketById(1);

        assertEquals(1, itemPocket.getId());
        assertEquals("misc", itemPocket.getName());
    }

    @Test
    void Get_ItemPocket_By_Name() {
        final ItemPocket itemPocket = api.getItemPocketByName("misc");

        assertEquals(1, itemPocket.getId());
        assertEquals("misc", itemPocket.getName());
    }
}
