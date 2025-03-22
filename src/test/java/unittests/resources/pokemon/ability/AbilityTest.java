package unittests.resources.pokemon.ability;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.ability.Ability;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbilityTest extends PokeApiUnitTest {

    @Test
    void Get_Ability_List() {
        final NamedApiResourceList abilities = api.getAbilities();

        assertTrue(abilities.getCount() > 0);
    }

    @Test
    void Get_Ability_By_Id() {
        final Ability ability = api.getAbilityById(1);

        assertEquals(1, ability.getId());
        assertEquals("stench", ability.getName());
    }

    @Test
    void Get_Ability_By_Name() {
        final Ability ability = api.getAbilityByName("stench");

        assertEquals(1, ability.getId());
        assertEquals("stench", ability.getName());
    }
}
