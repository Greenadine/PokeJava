package dev.greenadine.pokejava.model.pokemon.form;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a set of sprites used to depict a Pokémon in the game.
 *
 * @param frontDefault the default depiction of this Pokémon form from the front in battle.
 * @param frontFemale the female depiction of this Pokémon form from the front in battle.
 * @param frontShiny the shiny depiction of this Pokémon form from the front in battle.
 * @param frontFemaleShiny the female shiny depiction of this Pokémon form the front in battle.
 * @param backDefault the default depiction of this Pokémon form from the back in battle.
 * @param backFemale the female depiction of this Pokémon form from the back in battle.
 * @param backShiny the shiny depiction of this Pokémon form from the back in battle.
 * @param backFemaleShiny the female shiny depiction of this Pokémon form from the back in battle.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PokemonFormSprites(@JsonProperty("front_default") String frontDefault,
                                 @JsonProperty("front_female") String frontFemale,
                                 @JsonProperty("front_shiny") String frontShiny,
                                 @JsonProperty("front_female_shiny") String frontFemaleShiny,
                                 @JsonProperty("back_default") String backDefault,
                                 @JsonProperty("back_female") String backFemale,
                                 @JsonProperty("back_shiny") String backShiny,
                                 @JsonProperty("back_female_shiny") String backFemaleShiny) {
}
