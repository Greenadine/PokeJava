package dev.greenadine.pokejava.test.model;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.pokemon.GrowthRate;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrowthRateTest {

    private final PokeApi API = Main.API;

    @Test
    void Single() {
        GrowthRate growthRate = API.getGrowthRate(1);

        assertEquals(1, growthRate.getId());
        assertEquals("slow", growthRate.getName());
        assertEquals("\\frac{5x^3}{4}", growthRate.getFormula());
    }

    @Test
    void List() {
        NamedApiResourceList growthRates = API.getGrowthRateList(0, -1);

        assertEquals(6, growthRates.getCount());
    }
}
