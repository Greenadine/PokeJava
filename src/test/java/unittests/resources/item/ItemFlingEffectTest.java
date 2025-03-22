package unittests.resources.item;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.item.ItemFlingEffect;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemFlingEffectTest extends PokeApiUnitTest {

    @Test
    void Get_ItemFlingEffect_List() {
        final NamedApiResourceList itemFlingEffectList = api.getItemFlingEffects();

        assertTrue(itemFlingEffectList.getCount() > 0);
    }

    @Test
    void Get_ItemFlingEffect_By_Id() {
        final ItemFlingEffect itemFlingEffect = api.getItemFlingEffectById(1);

        assertEquals(1, itemFlingEffect.getId());
        assertEquals("badly-poison", itemFlingEffect.getName());
    }

    @Test
    void Get_ItemFlingEffect_By_Name() {
        final ItemFlingEffect itemFlingEffect = api.getItemFlingEffectByName("badly-poison");

        assertEquals(1, itemFlingEffect.getId());
        assertEquals("badly-poison", itemFlingEffect.getName());
    }
}
