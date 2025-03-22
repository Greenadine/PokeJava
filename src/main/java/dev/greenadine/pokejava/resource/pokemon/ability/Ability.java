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
package dev.greenadine.pokejava.resource.pokemon.ability;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.common.Name;
import dev.greenadine.pokejava.resource.common.VerboseEffect;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * A Pokémon ability.
 */
@ResourcePath("ability")
public final class Ability extends NamedApiResource implements NameLocalized {

    private final boolean isMainSeries;
    private final NamedApiResource generation;
    private final List<Name> names;
    private final List<VerboseEffect> effectEntries;
    private final List<AbilityEffectChange> effectChanges;
    private final List<AbilityFlavorText> flavorTextEntries;
    private final List<AbilityPokemon> pokemon;

    @JsonCreator
    private Ability(@JsonProperty("id") int id, @JsonProperty("name") String name,
                    @JsonProperty("is_main_series") boolean isMainSeries,
                    @JsonProperty("generation") NamedApiResource generation,
                    @JsonProperty("names") List<Name> names,
                    @JsonProperty("effect_entries") List<VerboseEffect> effectEntries,
                    @JsonProperty("effect_changes") List<AbilityEffectChange> effectChanges,
                    @JsonProperty("flavor_text_entries") List<AbilityFlavorText> flavorTextEntries,
                    @JsonProperty("pokemon") List<AbilityPokemon> pokemon) {
        super(id, name);
        this.isMainSeries = isMainSeries;
        this.generation = generation;
        this.names = names;
        this.effectEntries = effectEntries;
        this.effectChanges = effectChanges;
        this.flavorTextEntries = flavorTextEntries;
        this.pokemon = pokemon;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets whether the ability was introduced in the main series of the video games.
     *
     * @return {@code true} if the ability was introduced in the main series of the video games, {@code false} otherwise.
     */
    public boolean isMainSeries() {
        return isMainSeries;
    }

    /**
     * Gets the generation this ability was introduced in.
     *
     * @return the generation this ability was introduced in.
     */
    public @NotNull NamedApiResource getGeneration() {
        return generation;
    }

    /**
     * Gets the effect of the ability listed in different languages.
     *
     * @return the effect of the ability listed in different languages.
     */
    public @NotNull List<VerboseEffect> getEffectEntries() {
        return effectEntries;
    }

    /**
     * Gets the list of previous effects this ability has had across version groups.
     *
     * @return the list of previous effects this ability has had across version groups.
     */
    public @Nullable List<AbilityEffectChange> getEffectChanges() {
        return effectChanges;
    }

    /**
     * Gets the flavor text of the ability listed in different languages.
     *
     * @return the flavor text of the ability listed in different languages.
     */
    public @NotNull List<AbilityFlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    /**
     * Gets the Pokémon that could potentially have this ability.
     *
     * @return the Pokémon that could potentially have this ability.
     */
    public @NotNull List<AbilityPokemon> getPokemon() {
        return pokemon;
    }
}