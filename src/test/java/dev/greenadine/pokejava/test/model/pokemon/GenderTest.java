package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.pokemon.gender.Gender;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenderTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_Gender_List() {
        NamedApiResourceList genders = API.getGenders(0, 0);

        assertTrue(genders.getCount() > 0);
    }

    @Test
    void Get_Gender_By_Id() {
        Gender gender = API.getGenderById(1);

        assertEquals(1, gender.getId());
        assertEquals("female", gender.getName());
        assertEquals("bulbasaur", gender.getSpeciesGenderRelationList().get(0).pokemonSpecies().getName());
        assertEquals("wormadam", gender.getRequiredForEvolution().get(0).getName());
    }

    @Test
    void Get_Gender_By_Name() {
        Gender gender = API.getGenderByName("female");

        assertEquals(1, gender.getId());
        assertEquals("female", gender.getName());
        assertEquals("bulbasaur", gender.getSpeciesGenderRelationList().get(0).pokemonSpecies().getName());
        assertEquals("wormadam", gender.getRequiredForEvolution().get(0).getName());
    }
}
