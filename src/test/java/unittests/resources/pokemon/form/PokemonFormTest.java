package unittests.resources.pokemon.form;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.form.PokemonForm;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PokemonFormTest extends PokeApiUnitTest {

    @Test
    void Get_PokemonForm_List() {
        final NamedApiResourceList pokemonForms = api.getPokemonForms();

        assertTrue(pokemonForms.getCount() > 0);
    }

    @Test
    void Get_PokemonForm_By_Id() {
        final PokemonForm form = api.getPokemonFormById(1);

        assertEquals(1, form.getId());
        assertEquals("bulbasaur", form.getName());
    }

    @Test
    void Get_PokemonForm_By_Name() {
        final PokemonForm form = api.getPokemonFormByName("bulbasaur");

        assertEquals(1, form.getId());
        assertEquals("bulbasaur", form.getName());
    }
}
