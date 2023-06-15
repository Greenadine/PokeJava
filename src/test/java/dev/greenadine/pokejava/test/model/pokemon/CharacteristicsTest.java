package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.pokemon.Characteristic;
import dev.greenadine.pokejava.model.resource.ApiResourceList;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacteristicsTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_Characteristic_List() {
        ApiResourceList characteristics = API.getCharacteristicList(0, -1);

        assertEquals(30, characteristics.getCount());
    }

    @Test
    void Get_Characteristic() {
        Characteristic characteristic = API.getCharacteristic(1);

        assertEquals(1, characteristic.getId());
        assertEquals(0, characteristic.getGeneModulo());
    }
}
