package dev.greenadine.pokejava.test.model.pokemon;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.model.common.resource.NamedApiResourceList;
import dev.greenadine.pokejava.model.pokemon.type.Type;
import dev.greenadine.pokejava.test.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TypeTest {

    private final PokeApi API = Main.API;

    @Test
    void Get_Type_List() {
        NamedApiResourceList types = API.getTypes(0, 0);

        assertTrue(types.getCount() > 0);
    }

    @Test
    void Get_Type_By_Id() {
        Type type = API.getTypeById(1);

        assertEquals(1, type.getId());
        assertEquals("normal", type.getName());
        assertEquals("/type/1/", type.getUrl());

        assertEquals(0, type.getDamageRelations().doubleDamageTo().size());
        assertEquals(2, type.getDamageRelations().halfDamageTo().size());
        assertEquals(1, type.getDamageRelations().noDamageTo().size());
        assertEquals(1, type.getDamageRelations().doubleDamageFrom().size());
        assertEquals(0, type.getDamageRelations().halfDamageFrom().size());
        assertEquals(1, type.getDamageRelations().noDamageFrom().size());

        assertEquals(6, type.getGameIndices().size());
        assertEquals("generation-i", type.getGeneration().getName());
    }

    @Test
    void Get_Type_By_Name() {
        Type type = API.getTypeByName("normal");

        assertEquals(1, type.getId());
        assertEquals("normal", type.getName());
        assertEquals("/type/1/", type.getUrl());
    }
}
