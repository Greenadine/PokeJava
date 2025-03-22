package unittests.resources.pokemon;

import dev.greenadine.pokejava.resource.NamedApiResourceList;
import dev.greenadine.pokejava.resource.pokemon.Pokemon;
import unittests.PokeApiUnitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PokemonTest extends PokeApiUnitTest {

    @Test
    void Get_Pokemon_List() {
        final NamedApiResourceList pokemon = api.getPokemon();

        assertTrue(pokemon.getCount() > 0);
    }

    @Test
    void Get_Pokemon_By_Id() {
        final Pokemon pokemon = api.getPokemonById(1);

        assertEquals(1, pokemon.getId());
        assertEquals("bulbasaur", pokemon.getName());
    }

    @Test
    void Get_Pokemon_By_Name() {
        final Pokemon pokemon = api.getPokemonByName("bulbasaur");

        assertEquals(1, pokemon.getId());
        assertEquals("bulbasaur", pokemon.getName());
    }

    @Test
    void Pokemon_Sprites() {
        final Pokemon pokemon = api.getPokemonById(1);

        final var generationSprites = pokemon.getSprites().versions().getGenerationSprites("generation-v");
        assertNotNull(generationSprites);
        final var gameSprites = generationSprites.getGameSprites("black-white");
        assertNotNull(gameSprites);
        assertNotNull(gameSprites.animated());
    }
}
