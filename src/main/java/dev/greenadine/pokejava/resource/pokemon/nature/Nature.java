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
package dev.greenadine.pokejava.resource.pokemon.nature;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.common.Name;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * A Pokémon's nature.
 */
@ResourcePath("nature")
public final class Nature extends NamedApiResource implements NameLocalized {

    private final NamedApiResource decreasedStat;
    private final NamedApiResource increasedStat;
    private final NamedApiResource hatesFlavor;
    private final NamedApiResource likesFlavor;
    private final List<NatureStatChange> pokeathlonStatChanges;
    private final List<MoveBattleStylePreference> moveBattleStylePreferences;
    private final List<Name> names;

    @JsonCreator
    private Nature(@JsonProperty("id") int id,
                   @JsonProperty("name") String name,
                   @JsonProperty("decreased_stat") NamedApiResource decreasedStat,
                   @JsonProperty("increased_stat") NamedApiResource increasedStat,
                   @JsonProperty("hates_flavor") NamedApiResource hatesFlavor,
                   @JsonProperty("likes_flavor") NamedApiResource likesFlavor,
                   @JsonProperty("pokeathlon_stat_changes") List<NatureStatChange> pokeathlonStatChanges,
                   @JsonProperty("move_battle_style_preferences") List<MoveBattleStylePreference> moveBattleStylePreferences,
                   @JsonProperty("names") List<Name> names) {
        super(id, name);
        this.decreasedStat = decreasedStat;
        this.increasedStat = increasedStat;
        this.hatesFlavor = hatesFlavor;
        this.likesFlavor = likesFlavor;
        this.pokeathlonStatChanges = pokeathlonStatChanges;
        this.moveBattleStylePreferences = moveBattleStylePreferences;
        this.names = names;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets the stat decreased by 10% in Pokémon with this nature.
     *
     * @return the stat decreased by 10% in Pokémon with this nature.
     */
    public @Nullable NamedApiResource getDecreasedStat() {
        return decreasedStat;
    }

    /**
     * Gets the stat increased by 10% in Pokémon with this nature.
     *
     * @return the stat increased by 10% in Pokémon with this nature.
     */
    public @Nullable NamedApiResource getIncreasedStat() {
        return increasedStat;
    }

    /**
     * Gets the flavor hated by Pokémon with this nature.
     *
     * @return the flavor hated by Pokémon with this nature.
     */
    public @Nullable NamedApiResource getHatesFlavor() {
        return hatesFlavor;
    }

    /**
     * Gets the flavor liked by Pokémon with this nature.
     *
     * @return the flavor liked by Pokémon with this nature.
     */
    public @Nullable NamedApiResource getLikesFlavor() {
        return likesFlavor;
    }

    /**
     * Gets the stat changes that will be caused by breeding a Pokémon with this nature with another Pokémon.
     *
     * @return the stat changes that will be caused by breeding a Pokémon with this nature with another Pokémon.
     */
    public @NotNull List<NatureStatChange> getPokeathlonStatChanges() {
        return pokeathlonStatChanges;
    }

    /**
     * Gets the battle styles that get double the normal boost in Pokémon with this nature.
     *
     * @return the battle styles that get double the normal boost in Pokémon with this nature.
     */
    public @NotNull List<MoveBattleStylePreference> getMoveBattleStylePreferences() {
        return moveBattleStylePreferences;
    }
}
