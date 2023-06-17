package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.pokemon.form.PokemonForm;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokemonFormsTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_PokemonForm_List() {
        NamedApiResourceList pokemonForms = API.getPokemonForms(0, 0);

        assertTrue(pokemonForms.getCount() > 0);
    }

    @Test
    void Get_PokemonForm_By_Id() {
        PokemonForm form = API.getPokemonFormById(1);

        assertEquals(1, form.getId());
        assertEquals("bulbasaur", form.getName());
    }

    @Test
    void Get_PokemonForm_By_Name() {
        PokemonForm form = API.getPokemonFormByName("bulbasaur");

        assertEquals(1, form.getId());
        assertEquals("bulbasaur", form.getName());
    }
}
