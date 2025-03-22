package unittests.resources.pokemon;

import dev.greenadine.pokejava.resource.ApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.Characteristic;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CharacteristicTest extends PokeApiUnitTest {

    @Test
    void Get_Characteristic_List() {
        final ApiResourceList characteristics = api.getCharacteristics();

        assertTrue(characteristics.getCount() > 0);
    }

    @Test
    void Get_Characteristic() {
        final Characteristic characteristic = api.getCharacteristicById(1);

        assertEquals(1, characteristic.getId());
        assertEquals(0, characteristic.getGeneModulo());
    }
}
