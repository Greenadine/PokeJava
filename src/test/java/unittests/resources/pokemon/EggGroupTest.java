package unittests.resources.pokemon;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.EggGroup;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EggGroupTest extends PokeApiUnitTest {

    @Test
    void Get_EggGroup_List() {
        final NamedApiResourceList eggGroups = api.getEggGroups();

        assertTrue(eggGroups.getCount() > 0);
    }

    @Test
    void Get_EggGroup_By_Id() {
        final EggGroup eggGroup = api.getEggGroupById(1);

        assertEquals(1, eggGroup.getId());
        assertEquals("monster", eggGroup.getName());
    }

    @Test
    void Get_EggGroup_By_Name() {
        final EggGroup eggGroup = api.getEggGroupByName("monster");

        assertEquals(1, eggGroup.getId());
        assertEquals("monster", eggGroup.getName());
    }
}
