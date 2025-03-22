package unittests.resources.encounter;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.encounter.EncounterConditionValue;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EncounterConditionValueTest extends PokeApiUnitTest {

    @Test
    void Get_EncounterConditionValue_List() {
        final NamedApiResourceList encounterConditionValueList = api.getEncounterConditionValues();

        assertTrue(encounterConditionValueList.getCount() > 0);
    }

    @Test
    void Get_EncounterConditionValue_By_Id() {
        final EncounterConditionValue encounterConditionValue = api.getEncounterConditionValueById(1);

        assertEquals(1, encounterConditionValue.getId());
        assertEquals("swarm-yes", encounterConditionValue.getName());
    }

    @Test
    void Get_EncounterConditionValue_By_Name() {
        final EncounterConditionValue encounterConditionValue = api.getEncounterConditionValueByName("swarm-yes");

        assertEquals(1, encounterConditionValue.getId());
        assertEquals("swarm-yes", encounterConditionValue.getName());
    }
}
