package dev.greenadine.pokejava.model.pokemon.sprites;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a Pokémon's sprites for each generation.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public class PokemonSpritesVersions {

    private final Map<String, PokemonSpritesGeneration> generations = new HashMap<>();

    /**
     * Gets all of a Pokémon's sprites for each generation.
     *
     * @return all of a Pokémon's sprites for each generation.
     */
    public Map<String, PokemonSpritesGeneration> getGenerations() {
        return generations;
    }

    /**
     * Gets a specific generation of this Pokémon's sprites.
     *
     * @param key the generation to get.
     *
     * @return the Pokémon's sprites of a specific generation.
     */
    public PokemonSpritesGeneration getGeneration(String key) {
        return generations.get(key);
    }

    @JsonAnySetter
    public void setGeneration(String key, PokemonSpritesGeneration value) {
        generations.put(key, value);
    }
}
