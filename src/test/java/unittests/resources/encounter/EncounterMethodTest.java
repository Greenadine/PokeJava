package unittests.resources.encounter;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.encounter.EncounterMethod;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EncounterMethodTest extends PokeApiUnitTest {

    @Test
    void Get_EncounterMethod_List() {
        final NamedApiResourceList encounterMethodList = api.getEncounterMethods();

        assertTrue(encounterMethodList.getCount() > 0);
    }

    @Test
    void Get_EncounterMethod_By_Id() {
        final EncounterMethod encounterMethod = api.getEncounterMethodById(1);

        assertEquals(1, encounterMethod.getId());
        assertEquals("walk", encounterMethod.getName());
    }

    @Test
    void Get_EncounterMethod_By_Name() {
        final EncounterMethod encounterMethod = api.getEncounterMethodByName("walk");

        assertEquals(1, encounterMethod.getId());
        assertEquals("walk", encounterMethod.getName());
    }
}
