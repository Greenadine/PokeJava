package unittests.resources;

import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.game.Generation;
import dev.greenadine.pokejava.resource.pokemon.ability.Ability;
import unittests.PokeApiUnitTest;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiResourceTest extends PokeApiUnitTest {

    @Test
    public void Get_Full_Resource_Object() {
        final Ability ability = api.getAbilityById(1);
        assertEquals("stench", ability.getName());

        final NamedApiResource abilityGeneration = ability.getGeneration();
        final Generation generation = api.getGeneration(abilityGeneration);
        assertEquals("generation-iii", generation.getName());
    }
}
