package dev.greenadine.pokejava.model.pokemon.sprites;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a Pokémon's sprites within a generation, separated by each game within the generation.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class PokemonSpritesGeneration {

    private final Map<String, PokemonGameSprites> games = new HashMap<>();

    /**
     * Gets all of a Pokémon's sprites within a generation, separated by each game within the generation.
     *
     * @return all of a Pokémon's sprites within a generation, separated by each game within the generation.
     */
    public Map<String, PokemonGameSprites> getGames() {
        return games;
    }

    /**
     * Gets a Pokémon's sprites within a specific game of this generation.
     *
     * @param game the game to get.
     *
     * @return a Pokémon's sprites within a specific game of this generation.
     */
    public PokemonGameSprites getGame(String game) {
        return games.get(game);
    }

    @JsonAnySetter
    public void setGame(String key, PokemonGameSprites value) {
        games.put(key, value);
    }
}
