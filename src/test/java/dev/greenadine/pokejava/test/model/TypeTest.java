package dev.greenadine.pokejava.test.model;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.client.PokeApiClient;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypeTest {

    private final PokeApi API = new PokeApiClient();

    @Test
    void test() {
        Type type = API.getType(1);

        assertEquals(1, type.getId());
        assertEquals("normal", type.getName());
        assertEquals("https://pokeapi.co/api/v2/type/1/", type.getUrl());

        assertEquals(0, type.getDamageRelations().doubleDamageTo().size());
        assertEquals(2, type.getDamageRelations().halfDamageTo().size());
        assertEquals(1, type.getDamageRelations().noDamageTo().size());
        assertEquals(1, type.getDamageRelations().doubleDamageFrom().size());
        assertEquals(0, type.getDamageRelations().halfDamageFrom().size());
        assertEquals(1, type.getDamageRelations().noDamageFrom().size());

        assertEquals(6, type.getGameIndices().size());
        assertEquals("generation-i", type.getGeneration().getName());
    }
}
