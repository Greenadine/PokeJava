package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.ApiResourceList;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.pokemon.evolution.EvolutionChain;
import dev.greenadine.pokejava.model.pokemon.evolution.EvolutionTrigger;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvolutionsTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_Evolution_Chain_List() {
        ApiResourceList evolutionChains = API.getEvolutionChains(0, 0);

        assertTrue(evolutionChains.getCount() > 0);
    }

    @Test
    void Get_Evolution_Chain_By_Id() {
        EvolutionChain evolutionChain = API.getEvolutionChainById(1);

        assertNotNull(evolutionChain.getChain());
    }

    @Test
    void Get_Evolution_Trigger_List() {
        NamedApiResourceList evolutionTriggers = API.getEvolutionTriggers(0, 0);

        assertTrue(evolutionTriggers.getCount() > 0);
    }

    @Test
    void Get_Evolution_Trigger_By_Id() {
        EvolutionTrigger evolutionTrigger = API.getEvolutionTriggerById(1);

        assertTrue(evolutionTrigger.getNames().size() > 0);
    }

    @Test
    void Get_Evolution_Trigger_By_Name() {
        EvolutionTrigger evolutionTrigger = API.getEvolutionTriggerByName("level-up");

        assertTrue(evolutionTrigger.getNames().size() > 0);
    }
}
