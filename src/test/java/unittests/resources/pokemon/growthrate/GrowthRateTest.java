package unittests.resources.pokemon.growthrate;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.growthrate.GrowthRate;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GrowthRateTest extends PokeApiUnitTest {

    @Test
    void Get_GrowthRate_List() {
        final NamedApiResourceList growthRates = api.getGrowthRates();

        assertTrue(growthRates.getCount() > 0);
    }

    @Test
    void Get_GrowthRate_By_Id() {
        final GrowthRate growthRate = api.getGrowthRateById(1);

        assertEquals(1, growthRate.getId());
        assertEquals("slow", growthRate.getName());
        assertEquals("\\frac{5x^3}{4}", growthRate.getFormula());
    }

    @Test
    void Get_GrowthRate_By_Name() {
        final GrowthRate growthRate = api.getGrowthRateByName("slow");

        assertEquals(1, growthRate.getId());
        assertEquals("slow", growthRate.getName());
        assertEquals("\\frac{5x^3}{4}", growthRate.getFormula());
    }
}
