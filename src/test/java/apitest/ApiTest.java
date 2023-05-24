package apitest;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.client.PokeApiClient;
import dev.greenadine.pokejava.model.Type;

public class ApiTest {

    private static PokeApi API;

    public static void main(String[] args) {
        API = new PokeApiClient();

        testTypes();
    }

    private static void testTypes() {
        Type type = API.getType(1);

        System.out.println(type);
    }
}
