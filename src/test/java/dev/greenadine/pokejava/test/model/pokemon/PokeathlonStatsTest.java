package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.pokemon.pokeathlon.PokeathlonStat;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokeathlonStatsTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_PokeathlonStat_List() {
        NamedApiResourceList pokeathlonStats = API.getPokeathlonStats(0, 0);

        assertTrue(pokeathlonStats.getCount() > 0);
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
