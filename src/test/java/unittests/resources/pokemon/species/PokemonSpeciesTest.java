package unittests.resources.pokemon.species;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.species.PokemonSpecies;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokemonSpeciesTest extends PokeApiUnitTest {

    @Test
    void Get_PokemonSpecies_List() {
        final NamedApiResourceList pokemonSpecies = api.getPokemonSpecies();

        assertTrue(pokemonSpecies.getCount() > 0);
    }

    @Test
    void Get_PokemonSpecies_By_Id() {
        final PokemonSpecies pokemonSpecies = api.getPokemonSpeciesById(1);

        assertEquals(1, pokemonSpecies.getId());
        assertEquals("bulbasaur", pokemonSpecies.getName());
    }

    @Test
    void Get_PokemonSpecies_By_Name() {
        final PokemonSpecies pokemonSpecies = api.getPokemonSpeciesByName("bulbasaur");

        assertEquals(1, pokemonSpecies.getId());
        assertEquals("bulbasaur", pokemonSpecies.getName());
    }
}
