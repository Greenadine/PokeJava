package dev.greenadine.pokejava.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.resource.NamedApiResource;

public record Name(@JsonProperty("name") String name,
                   @JsonProperty("language") NamedApiResource language) {
}
