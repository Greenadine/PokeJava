package dev.greenadine.pokejava.model.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

/**
 * Move stat changes are used to describe adjustments made to moves due to {@link MoveAilment}s.
 *
 * @param change the amount of change.
 * @param stat the stat being affected.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record MoveStatChange(@JsonProperty("change") int change,
                             @JsonProperty("stat") NamedApiResource stat) {
}
