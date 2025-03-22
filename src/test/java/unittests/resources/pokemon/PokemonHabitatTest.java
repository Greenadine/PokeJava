package unittests.resources.pokemon;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.PokemonHabitat;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokemonHabitatTest extends PokeApiUnitTest {

    @Test
    void Get_PokemonHabitat_List() {
        final NamedApiResourceList pokemonHabitats = api.getPokemonHabitats();

        assertTrue(pokemonHabitats.getCount() > 0);
    }

    @Test
    void Get_PokemonHabitat_By_Id() {
        final PokemonHabitat habitat = api.getPokemonHabitatById(1);

        assertEquals(1, habitat.getId());
        assertEquals("cave", habitat.getName());
    }

    @Test
    void Get_PokemonHabitat_By_Name() {
        final PokemonHabitat habitat = api.getPokemonHabitatByName("cave");

        assertEquals(1, habitat.getId());
        assertEquals("cave", habitat.getName());
    }
}
