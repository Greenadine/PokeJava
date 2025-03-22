package unittests.resources.pokemon.evolution;

import dev.greenadine.pokejava.resource.ApiResourceList;
import dev.greenadine.pokejava.resource.evolution.EvolutionChain;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvolutionChainTest extends PokeApiUnitTest {

    @Test
    void Get_EvolutionChain_List() {
        final ApiResourceList locationList = api.getEvolutionChains();

        assertTrue(locationList.getCount() > 0);
    }

    @Test
    void Get_EvolutionChain_By_Id() {
        final EvolutionChain location = api.getEvolutionChainById(1);

        assertEquals(1, location.getId());
    }
}
