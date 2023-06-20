package dev.greenadine.pokejava.model.move;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.model.common.resource.NamedApiResource;

import java.util.List;

/**
 * Contest combo detail lists the index numbers of the moves required to enable this move to be
 *
 * @param useBefore a list of moves to use before this move.
 * @param useAfter a list of moves to use after this move.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record ContestComboDetail(@JsonProperty("use_before") List<NamedApiResource> useBefore,
                                 @JsonProperty("use_after") List<NamedApiResource> useAfter) {
}
