package unittests.resources.pokemon.evolution;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.evolution.EvolutionTrigger;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvolutionTriggerTest extends PokeApiUnitTest {

    @Test
    void Get_EvolutionTrigger_List() {
        final NamedApiResourceList locationList = api.getEvolutionTriggers();

        assertTrue(locationList.getCount() > 0);
    }

    @Test
    void Get_EvolutionTrigger_By_Id() {
        final EvolutionTrigger location = api.getEvolutionTriggerById(1);

        assertEquals(1, location.getId());
        assertEquals("level-up", location.getName());
    }

    @Test
    void Get_EvolutionTrigger_By_Name() {
        final EvolutionTrigger location = api.getEvolutionTriggerByName("level-up");

        assertEquals(1, location.getId());
        assertEquals("level-up", location.getName());
    }
}
