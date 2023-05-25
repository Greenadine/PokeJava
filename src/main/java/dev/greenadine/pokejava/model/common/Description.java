package dev.greenadine.pokejava.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.NamedApiResource;

public record Description(@JsonProperty("description") String description,
                          @JsonProperty("language") NamedApiResource language) {
}
