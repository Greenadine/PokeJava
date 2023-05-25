package dev.greenadine.pokejava.test.model;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.client.PokeApiClient;
import dev.greenadine.pokejava.model.pokemon.GrowthRate;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrowthRateTest {

    private final PokeApi API = new PokeApiClient();

    @Test
    void Single() {
        GrowthRate growthRate = API.getGrowthRate(1);

        assertEquals(1, growthRate.getId());
        assertEquals("slow", growthRate.getName());
        assertEquals("\\frac{5x^3}{4}", growthRate.getFormula());
    }

    @Test
    void List() {
        List<GrowthRate> growthRates = API.getGrowthRateList(0, -1);

        assertEquals(5, growthRates.size());
    }
}
