package unittests;

import dev.greenadine.pokejava.client.PokeApi;
import dev.greenadine.pokejava.client.PokeApiClient;

public abstract class PokeApiUnitTest {

    protected static final PokeApi api = new PokeApiClient();
}
