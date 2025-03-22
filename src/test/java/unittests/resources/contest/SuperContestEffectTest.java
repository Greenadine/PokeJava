package unittests.resources.contest;

import dev.greenadine.pokejava.resource.ApiResourceList;
import dev.greenadine.pokejava.resource.contest.SuperContestEffect;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SuperContestEffectTest extends PokeApiUnitTest {

    @Test
    void Get_SuperContestEffect_List() {
        final ApiResourceList berryFirmnessList = api.getSuperContestEffects();

        assertTrue(berryFirmnessList.getCount() > 0);
    }

    @Test
    void Get_SuperContestEffect_By_Id() {
        final SuperContestEffect berryFirmness = api.getSuperContestEffectById(1);

        assertEquals(1, berryFirmness.getId());
    }
}
