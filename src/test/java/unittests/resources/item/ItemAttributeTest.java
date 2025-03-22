package unittests.resources.item;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.item.ItemAttribute;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemAttributeTest extends PokeApiUnitTest {

    @Test
    void Get_ItemAttribute_List() {
        final NamedApiResourceList itemAttributeList = api.getItemAttributes();

        assertTrue(itemAttributeList.getCount() > 0);
    }

    @Test
    void Get_ItemAttribute_By_Id() {
        final ItemAttribute itemAttribute = api.getItemAttributeById(1);

        assertEquals(1, itemAttribute.getId());
        assertEquals("countable", itemAttribute.getName());
    }

    @Test
    void Get_ItemAttribute_By_Name() {
        final ItemAttribute itemAttribute = api.getItemAttributeByName("countable");

        assertEquals(1, itemAttribute.getId());
        assertEquals("countable", itemAttribute.getName());
    }
}
