package dev.greenadine.pokejava.client.v2;

import dev.greenadine.pokejava.client.ClientConfig;

/**
 * The client configuration for making API calls to version 2 of the PokeAPI.
 *
 * @since 0.1.0
 * @see ClientConfig
 * @author Greenadine
 */
public class PokeApiV2ClientConfig extends ClientConfig {

    public PokeApiV2ClientConfig() {
        super("https://pokeapi.co/api/v2/");
    }
}
