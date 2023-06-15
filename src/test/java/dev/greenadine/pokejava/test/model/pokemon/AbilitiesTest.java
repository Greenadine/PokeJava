package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.pokemon.ability.Ability;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbilitiesTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_Ability_List() {
        NamedApiResourceList abilities = API.getAbilityList(0, -1);

        assertEquals(358, abilities.getCount());
    }

    @Test
    void Get_Ability_By_Id() {
        Ability ability = API.getAbilityById(1);

        assertEquals(1, ability.getId());
        assertEquals("stench", ability.getName());
    }

    @Test
    void Get_Ability_By_Name() {
        Ability ability = API.getAbilityByName("stench");

        assertEquals(1, ability.getId());
        assertEquals("stench", ability.getName());
    }
}
