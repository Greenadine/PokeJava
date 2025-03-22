package unittests.resources.evolution;

import dev.greenadine.pokejava.resource.ApiResourceList;
import dev.greenadine.pokejava.resource.evolution.EvolutionChain;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvolutionChainTest extends PokeApiUnitTest {

    @Test
    void Get_EvolutionChain_List() {
        final ApiResourceList evolutionChainList = api.getEvolutionChains();
    }

    @Test
    void Get_EvolutionChain_By_Id() {
        final EvolutionChain contestType = api.getEvolutionChainById(1);

        assertEquals(1, contestType.getId());
    }
}
