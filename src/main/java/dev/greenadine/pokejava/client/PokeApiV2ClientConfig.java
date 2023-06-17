package dev.greenadine.pokejava.client;

/**
 * The client configuration for making API calls to version 2 of the PokeAPI.
 *
 * @see ClientConfig
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class PokeApiV2ClientConfig extends ClientConfig {

    public PokeApiV2ClientConfig() {
        super("https://pokeapi.co/api/v2/");
    }
}
