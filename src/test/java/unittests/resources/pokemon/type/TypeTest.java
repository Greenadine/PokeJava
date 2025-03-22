package unittests.resources.pokemon.type;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.type.Type;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TypeTest extends PokeApiUnitTest {

    @Test
    void Get_Type_List() {
        final NamedApiResourceList types = api.getTypes();

        assertTrue(types.getCount() > 0);
    }

    @Test
    void Get_Type_By_Id() {
        final Type type = api.getTypeById(1);

        assertEquals(1, type.getId());
        assertEquals("normal", type.getName());
    }

    @Test
    void Get_Type_By_Name() {
        final Type type = api.getTypeByName("normal");

        assertEquals(1, type.getId());
        assertEquals("normal", type.getName());
    }
}
