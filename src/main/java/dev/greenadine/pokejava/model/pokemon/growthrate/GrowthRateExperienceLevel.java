package dev.greenadine.pokejava.model.pokemon.growthrate;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a level and the amount of experienced needed to attain it based on a growth level.
 *
 * @param level the level.
 * @param experience the amount of experience required to reach the level.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record GrowthRateExperienceLevel(@JsonProperty("level") int level,
                                        @JsonProperty("experience") int experience) {
}
