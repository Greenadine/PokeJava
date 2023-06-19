package dev.greenadine.pokejava.model.pokemon.sprites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a Pokémon's sprites in a specific game.
 * <p>
 * Note that not every Pokémon has sprites available in each game.
 *
 * @param frontDefault the default sprite of this Pokémon from the front in battle.
 * @param frontShiny the shiny sprite of this Pokémon from the front in battle.
 * @param frontFemale the female sprite of this Pokémon from the front in battle.
 * @param frontShinyFemale the shiny female sprite of this Pokémon from the front in battle.
 * @param frontGray the gray sprite of this Pokémon from the front in battle.
 * @param backDefault the default sprite of this Pokémon from the back in battle.
 * @param backShiny the shiny sprite of this Pokémon from the back in battle.
 * @param backFemale the female sprite of this Pokémon from the back in battle.
 * @param backFemaleShiny the shiny female sprite of this Pokémon from the back in battle.
 * @param backGray the gray sprite of this Pokémon from the back in battle.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PokemonGameSprites(@JsonProperty("front_default") String frontDefault,
                                 @JsonProperty("front_shiny") String frontShiny,
                                 @JsonProperty("front_female") String frontFemale,
                                 @JsonProperty("front_shiny_female") String frontShinyFemale,
                                 @JsonProperty("front_gray")  String frontGray,
                                 @JsonProperty("back_default") String backDefault,
                                 @JsonProperty("back_shiny") String backShiny,
                                 @JsonProperty("back_female") String backFemale,
                                 @JsonProperty("back_shiny_female") String backFemaleShiny,
                                 @JsonProperty("back_gray") String backGray,
                                 @JsonProperty("animated") PokemonGameSprites animated) {
}
