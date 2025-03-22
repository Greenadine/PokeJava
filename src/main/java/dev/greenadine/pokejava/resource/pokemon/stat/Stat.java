/*
 * Copyright © 2025 Kevin "Greenadine" Zuman (kevin@greenadine.dev)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.greenadine.pokejava.resource.pokemon.stat;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.ApiResource;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.common.Name;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
 */
@ResourcePath("stat")
public final class Stat extends NamedApiResource implements NameLocalized {

    private final int gameIndex;
    private final boolean isBattleOnly;
    private final MoveStatAffectSets affectingMoves;
    private final NatureStatAffectSets affectingNatures;
    private final List<ApiResource> characteristics;
    private final NamedApiResource moveDamageClass;
    private final List<Name> names;

    @JsonCreator
    private Stat(@JsonProperty("id") int id,
                 @JsonProperty("name") String name,
                 @JsonProperty("game_index") int gameIndex,
                 @JsonProperty("is_battle_only") boolean isBattleOnly,
                 @JsonProperty("affecting_moves") MoveStatAffectSets affectingMoves,
                 @JsonProperty("affecting_natures") NatureStatAffectSets affectingNatures,
                 @JsonProperty("characteristics") List<ApiResource> characteristics,
                 @JsonProperty("move_damage_class") NamedApiResource moveDamageClass,
                 @JsonProperty("names") List<Name> names) {
        super(id, name);
        this.gameIndex = gameIndex;
        this.isBattleOnly = isBattleOnly;
        this.affectingMoves = affectingMoves;
        this.affectingNatures = affectingNatures;
        this.characteristics = characteristics;
        this.moveDamageClass = moveDamageClass;
        this.names = names;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets the game index of the stat.
     *
     * @return the game index of the stat.
     */
    public int getGameIndex() {
        return gameIndex;
    }

    /**
     * Gets whether this stat only exists within a battle.
     *
     * @return {@code true} if this stat only exists within a battle; {@code false} otherwise.
     */
    public boolean isBattleOnly() {
        return isBattleOnly;
    }

    /**
     * Gets a list of moves which affect this stat positively and negatively.
     *
     * @return a list of moves which affect this stat positively and negatively.
     */
    public @NotNull MoveStatAffectSets getAffectingMoves() {
        return affectingMoves;
    }

    /**
     * Gets a list of natures which affect this stat positively and negatively.
     *
     * @return a list of natures which affect this stat positively and negatively.
     */
    public @NotNull NatureStatAffectSets getAffectingNatures() {
        return affectingNatures;
    }

    /**
     * Gets the characteristics that are set on a Pokémon when its highest base stat is this stat.
     *
     * @return the characteristics that are set on a Pokémon when its highest base stat is this stat.
     */
    public @Nullable List<ApiResource> getCharacteristics() {
        return characteristics;
    }

    /**
     * Gets the class of damage this stat is directly related to.
     *
     * @return the class of damage this stat is directly related to.
     */
    public @Nullable NamedApiResource getMoveDamageClass() {
        return moveDamageClass;
    }
}
