package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.pokemon.PokemonHabitat;
import dev.greenadine.pokejava.model.resource.NamedApiResourceList;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonHabitatsTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_PokemonHabitat_List() {
        NamedApiResourceList pokemonHabitats = API.getPokemonHabitatList(0, -1);

        assertEquals(9, pokemonHabitats.getCount());
    }

    @Test
    void Get_PokemonHabitat_By_Id() {
        PokemonHabitat habitat = API.getPokemonHabitatById(1);

        assertEquals(1, habitat.getId());
        assertEquals("cave", habitat.getName());
    }

    @Test
    void Get_PokemonHabitat_By_Name() {
        PokemonHabitat habitat = API.getPokemonHabitatByName("cave");

        assertEquals(1, habitat.getId());
        assertEquals("cave", habitat.getName());
    }
}
