package dev.greenadine.pokejava.test.model;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.client.PokeApiClient;
import dev.greenadine.pokejava.model.pokemon.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenderTest {

    private final PokeApi API = new PokeApiClient();

    @Test
    void test() {
        Gender gender = API.getGender(1);

        assertEquals(1, gender.getId());
        assertEquals("female", gender.getName());
        assertEquals("bulbasaur", gender.getSpeciesGenderRelationList().get(0).pokemonSpecies().getName());
        assertEquals("wormadam", gender.getRequiredForEvolution().get(0).getName());
    }
}
