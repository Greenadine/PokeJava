package unittests.resources.contest;

import dev.greenadine.pokejava.resource.ApiResourceList;
import dev.greenadine.pokejava.resource.contest.ContestEffect;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContestEffectTest extends PokeApiUnitTest {

    @Test
    void Get_ContestEffect_List() {
        final ApiResourceList contestEffectList = api.getContestEffects();

        assertTrue(contestEffectList.getCount() > 0);
    }

    @Test
    void Get_ContestEffect_By_Id() {
        final ContestEffect contestEffect = api.getContestEffectById(1);

        assertEquals(1, contestEffect.getId());
    }
}
