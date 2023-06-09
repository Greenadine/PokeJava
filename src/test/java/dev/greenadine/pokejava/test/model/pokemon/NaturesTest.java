package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.pokemon.nature.Nature;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NaturesTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_Nature_List() {
        NamedApiResourceList natures = API.getNatures(0, 0);

        assertTrue(natures.getCount() > 0);
    }

    @Test
    void Get_Nature_By_Id() {
        Nature nature = API.getNatureById(1);

        assertEquals(1, nature.getId());
        assertEquals("hardy", nature.getName());
    }

    @Test
    void Get_Nature_By_Name() {
        Nature nature = API.getNatureByName("hardy");

        assertEquals(1, nature.getId());
        assertEquals("hardy", nature.getName());
    }
}
