package unittests.resources.encounter;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.encounter.EncounterCondition;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EncounterConditionTest extends PokeApiUnitTest {

    @Test
    void Get_EncounterCondition_List() {
        final NamedApiResourceList encounterConditionList = api.getEncounterConditions();

        assertTrue(encounterConditionList.getCount() > 0);
    }

    @Test
    void Get_EncounterCondition_By_Id() {
        final EncounterCondition encounterCondition = api.getEncounterConditionById(1);

        assertEquals(1, encounterCondition.getId());
        assertEquals("swarm", encounterCondition.getName());
    }

    @Test
    void Get_EncounterCondition_By_Name() {
        final EncounterCondition encounterCondition = api.getEncounterConditionByName("swarm");

        assertEquals(1, encounterCondition.getId());
        assertEquals("swarm", encounterCondition.getName());
    }
}
