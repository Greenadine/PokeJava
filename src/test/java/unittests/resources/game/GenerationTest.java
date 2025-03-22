package unittests.resources.game;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.game.Generation;
import org.junit.jupiter.api.Test;
import unittests.PokeApiUnitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenerationTest extends PokeApiUnitTest {

    @Test
    void Get_Generation_List() {
        final NamedApiResourceList generationList = api.getGenerations();

        assertTrue(generationList.getCount() > 0);
    }

    @Test
    void Get_Generation_By_Id() {
        final Generation generation = api.getGenerationById(1);

        assertEquals(1, generation.getId());
        assertEquals("generation-i", generation.getName());
    }

    @Test
    void Get_Generation_By_Name() {
        final Generation generation = api.getGenerationByName("generation-i");

        assertEquals(1, generation.getId());
        assertEquals("generation-i", generation.getName());
    }
}
