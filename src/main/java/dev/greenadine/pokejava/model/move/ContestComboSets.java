package dev.greenadine.pokejava.model.move;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contest combo detail lists the index numbers of the moves required to enable this move to be
 *
 * @param normal a detail of moves this move can be used before or after, granting additional appeal points in contests.
 * @param superCombo a detail of moves this move can be used before or after, granting additional appeal points in super contests.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public record ContestComboSets(@JsonProperty("normal") ContestComboDetail normal,
                               @JsonProperty("super") ContestComboDetail superCombo) {
}
