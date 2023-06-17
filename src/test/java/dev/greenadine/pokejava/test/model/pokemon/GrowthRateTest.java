package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.pokemon.growthrate.GrowthRate;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GrowthRateTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_GrowthRate_List() {
        NamedApiResourceList growthRates = API.getGrowthRates(0, 0);

        assertTrue(growthRates.getCount() > 0);
    }

    @Test
    void Get_GrowthRate_By_Id() {
        GrowthRate growthRate = API.getGrowthRateById(1);

        assertEquals(1, growthRate.getId());
        assertEquals("slow", growthRate.getName());
        assertEquals("\\frac{5x^3}{4}", growthRate.getFormula());
    }

    @Test
    void Get_GrowthRate_By_Name() {
        GrowthRate growthRate = API.getGrowthRateByName("slow");

        assertEquals(1, growthRate.getId());
        assertEquals("slow", growthRate.getName());
        assertEquals("\\frac{5x^3}{4}", growthRate.getFormula());
    }
}
