package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.ApiResourceList;
import dev.greenadine.pokejava.model.pokemon.Characteristic;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CharacteristicsTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_Characteristic_List() {
        ApiResourceList characteristics = API.getCharacteristics(0, 0);

        assertTrue(characteristics.getCount() > 0);
    }

    @Test
    void Get_Characteristic() {
        Characteristic characteristic = API.getCharacteristic(1);

        assertEquals(1, characteristic.getId());
        assertEquals(0, characteristic.getGeneModulo());
    }
}
