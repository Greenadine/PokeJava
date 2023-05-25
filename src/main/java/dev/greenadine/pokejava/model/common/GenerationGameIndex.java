package dev.greenadine.pokejava.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.NamedApiResource;

public record GenerationGameIndex(@JsonProperty("game_index") int gameIndex,
                                  @JsonProperty("generation") NamedApiResource generation) {
}
