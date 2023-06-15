package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.pokemon.EggGroup;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EggGroupsTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_EggGroup_List() {
        NamedApiResourceList eggGroups = API.getEggGroupList(0, -1);

        assertEquals(15, eggGroups.getCount());
    }

    @Test
    void Get_EggGroup_By_Id() {
        EggGroup eggGroup = API.getEggGroupById(1);

        assertEquals(1, eggGroup.getId());
        assertEquals("monster", eggGroup.getName());
    }

    @Test
    void Get_EggGroup_By_Name() {
        EggGroup eggGroup = API.getEggGroupByName("monster");

        assertEquals(1, eggGroup.getId());
        assertEquals("monster", eggGroup.getName());
    }
}
