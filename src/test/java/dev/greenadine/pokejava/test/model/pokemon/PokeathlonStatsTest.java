package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.pokemon.pokeathlon.PokeathlonStat;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokeathlonStatsTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_PokeathlonStat_List() {
        NamedApiResourceList pokeathlonStats = API.getPokeathlonStatList(0, -1);

        assertEquals(5, pokeathlonStats.getCount());
    }

    @Test
    void Get_PokeathlonStat_By_Id() {
        PokeathlonStat pokeathlonStat = API.getPokeathlonStatById(1);

        assertEquals(1, pokeathlonStat.getId());
        assertEquals("speed", pokeathlonStat.getName());
    }

    @Test
    void Get_PokeathlonStat_By_Name() {
        PokeathlonStat pokeathlonStat = API.getPokeathlonStatByName("speed");

        assertEquals(1, pokeathlonStat.getId());
        assertEquals("speed", pokeathlonStat.getName());
    }
}
