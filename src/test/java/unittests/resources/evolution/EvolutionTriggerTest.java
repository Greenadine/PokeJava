package unittests.resources.evolution;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.evolution.EvolutionTrigger;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvolutionTriggerTest extends PokeApiUnitTest {

    @Test
    void Get_EvolutionTrigger_List() {
        final NamedApiResourceList evolutionTriggerList = api.getEvolutionTriggers();

        assertTrue(evolutionTriggerList.getCount() > 0);
    }

    @Test
    void Get_EvolutionTrigger_By_Id() {
        final EvolutionTrigger evolutionTrigger = api.getEvolutionTriggerById(1);

        assertEquals(1, evolutionTrigger.getId());
        assertEquals("level-up", evolutionTrigger.getName());
    }

    @Test
    void Get_EvolutionTrigger_By_Name() {
        final EvolutionTrigger evolutionTrigger = api.getEvolutionTriggerByName("level-up");

        assertEquals(1, evolutionTrigger.getId());
        assertEquals("level-up", evolutionTrigger.getName());
    }
}
