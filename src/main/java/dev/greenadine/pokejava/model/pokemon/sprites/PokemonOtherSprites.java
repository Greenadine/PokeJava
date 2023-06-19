package dev.greenadine.pokejava.model.pokemon.sprites;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a Pokémon's miscellaneous sprites.
 *
 * @param dreamWorld the sprites of this Pokémon in the dream world.
 * @param home the sprites of this Pokémon in Pokémon Home.
 * @param officialArtwork the official artwork of this Pokémon.
 */
public record PokemonOtherSprites(@JsonProperty("dream_world") PokemonSprites dreamWorld,
                                  @JsonProperty("home") PokemonSprites home,
                                  @JsonProperty("official-artwork") PokemonSprites officialArtwork) {
}
