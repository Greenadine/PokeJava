package unittests.resources.pokemon.nature;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.nature.Nature;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NatureTest extends PokeApiUnitTest {

    @Test
    void Get_Nature_List() {
        final NamedApiResourceList natures = api.getNatures();

        assertTrue(natures.getCount() > 0);
    }

    @Test
    void Get_Nature_By_Id() {
        final Nature nature = api.getNatureById(1);

        assertEquals(1, nature.getId());
        assertEquals("hardy", nature.getName());
    }

    @Test
    void Get_Nature_By_Name() {
        final Nature nature = api.getNatureByName("hardy");

        assertEquals(1, nature.getId());
        assertEquals("hardy", nature.getName());
    }
}
