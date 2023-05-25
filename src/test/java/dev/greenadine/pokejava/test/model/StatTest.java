package dev.greenadine.pokejava.test.model;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.pokemon.stat.Stat;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatTest {

    private final PokeApi API = Main.API;

    @Test
    void Single() {
        Stat stat = API.getStat(1);

        assertEquals(1, stat.getId());
        assertEquals("hp", stat.getName());
        assertEquals(1, stat.getGameIndex());
    }

    @Test
    void List() {
        NamedApiResourceList list = API.getStatList(1, 0);

        assertEquals(8, list.getCount());
        assertEquals("attack", list.getResults().get(0).getName());
    }
}
