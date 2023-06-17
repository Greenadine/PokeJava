package dev.greenadine.pokejava.model.pokemon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a Pokémon's sprites.
 *
 * @param frontDefault the default depiction of this Pokémon from the front in battle.
 * @param frontShiny the shiny depiction of this Pokémon from the front in battle.
 * @param frontFemale the female depiction of this Pokémon from the front in battle.
 * @param frontShinyFemale the shiny female depiction of this Pokémon from the front in battle.
 * @param backDefault the default depiction of this Pokémon from the back in battle.
 * @param backShiny the shiny depiction of this Pokémon from the back in battle.
 * @param backFemale the female depiction of this Pokémon from the back in battle.
 * @param backFemaleShiny the female shiny depiction of this Pokémon from the back in battle.
 * @param other the other sprites of this Pokémon.
 *
 * @since 0.1.0
 * @author Greenadine
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public record PokemonSprites(@JsonProperty("front_default") String frontDefault,
                             @JsonProperty("front_shiny") String frontShiny,
                             @JsonProperty("front_female") String frontFemale,
                             @JsonProperty("front_shiny_female") String frontShinyFemale,
                             @JsonProperty("back_default") String backDefault,
                             @JsonProperty("back_shiny") String backShiny,
                             @JsonProperty("back_female") String backFemale,
                             @JsonProperty("back_shiny_female") String backFemaleShiny,
                             @JsonProperty("other") OtherSprites other) {

    // TODO inspect raw json data for an entire pokemon, with focus on sprites, something weird is going on there that isn't documented
}
