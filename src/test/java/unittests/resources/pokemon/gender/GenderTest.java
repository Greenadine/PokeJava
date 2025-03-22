package unittests.resources.pokemon.gender;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.gender.Gender;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenderTest extends PokeApiUnitTest {

    @Test
    void Get_Gender_List() {
        final NamedApiResourceList genders = api.getGenders();

        assertTrue(genders.getCount() > 0);
    }

    @Test
    void Get_Gender_By_Id() {
        final Gender gender = api.getGenderById(1);

        assertEquals(1, gender.getId());
        assertEquals("female", gender.getName());
        assertEquals("bulbasaur", gender.getPokemonSpecies().get(0).pokemonSpecies().getName());
        assertEquals("wormadam", gender.getRequiredForEvolution().get(0).getName());
    }

    @Test
    void Get_Gender_By_Name() {
        final Gender gender = api.getGenderByName("female");

        assertEquals(1, gender.getId());
        assertEquals("female", gender.getName());
        assertEquals("bulbasaur", gender.getPokemonSpecies().get(0).pokemonSpecies().getName());
        assertEquals("wormadam", gender.getRequiredForEvolution().get(0).getName());
    }
}
