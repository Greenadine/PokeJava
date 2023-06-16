package dev.greenadine.pokejava.model.pokemon.growthrate;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GrowthRateExperienceLevel(@JsonProperty("level") int level,
                                        @JsonProperty("experience") int experience) {
}
