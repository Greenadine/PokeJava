package unittests.resources.item;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.item.ItemCategory;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemCategoryTest extends PokeApiUnitTest {

    @Test
    void Get_ItemCategory_List() {
        final NamedApiResourceList itemCategoryList = api.getItemCategories();

        assertTrue(itemCategoryList.getCount() > 0);
    }

    @Test
    void Get_ItemCategory_By_Id() {
        final ItemCategory itemCategory = api.getItemCategoryById(1);

        assertEquals(1, itemCategory.getId());
        assertEquals("stat-boosts", itemCategory.getName());
    }

    @Test
    void Get_ItemCategory_By_Name() {
        final ItemCategory itemCategory = api.getItemCategoryByName("stat-boosts");

        assertEquals(1, itemCategory.getId());
        assertEquals("stat-boosts", itemCategory.getName());
    }
}
