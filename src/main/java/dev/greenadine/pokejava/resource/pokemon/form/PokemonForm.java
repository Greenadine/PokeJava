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
package dev.greenadine.pokejava.resource.pokemon.form;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.common.Name;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.pokemon.PokemonFormType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * A single Pokémon form.
 */
@ResourcePath("pokemon-form")
public final class PokemonForm extends NamedApiResource implements NameLocalized {

    //region Fields
    private final int order;
    private final int formOrder;
    private final boolean isDefault;
    private final boolean isBattleOnly;
    private final boolean isMega;
    private final String formName;
    private final NamedApiResource pokemon;
    private final List<PokemonFormType> types;
    private final PokemonFormSprites sprites;
    private final NamedApiResource versionGroup;
    private final List<Name> names;
    private final List<Name> formNames;
    //endregion

    @JsonCreator
    private PokemonForm(@JsonProperty("id") int id,
                        @JsonProperty("name") String name,
                        @JsonProperty("order") int order,
                        @JsonProperty("form_order") int formOrder,
                        @JsonProperty("is_default") boolean isDefault,
                        @JsonProperty("is_battle_only") boolean isBattleOnly,
                        @JsonProperty("is_mega") boolean isMega,
                        @JsonProperty("form_name") String formName,
                        @JsonProperty("pokemon")  NamedApiResource pokemon,
                        @JsonProperty("types")  List<PokemonFormType> types,
                        @JsonProperty("sprites")  PokemonFormSprites sprites,
                        @JsonProperty("version_group") NamedApiResource versionGroup,
                        @JsonProperty("names") List<Name> names,
                        @JsonProperty("form_names") List<Name> formNames) {
        super(id, name);
        this.order = order;
        this.formOrder = formOrder;
        this.isDefault = isDefault;
        this.isBattleOnly = isBattleOnly;
        this.isMega = isMega;
        this.formName = formName;
        this.pokemon = pokemon;
        this.types = types;
        this.sprites = sprites;
        this.versionGroup = versionGroup;
        this.names = names;
        this.formNames = formNames;
    }

    @Override
    public @Nullable List<Name> getNames() {
        return names;
    }

    /**
     * Gets the order in which forms should be sorted within all forms.
     *
     * @return the order in which forms should be sorted within all forms.
     */
    public int getOrder() {
        return order;
    }

    /**
     * Gets the order in which forms should be sorted within a species' forms.
     *
     * @return the order in which forms should be sorted within a species' forms.
     */
    public int getFormOrder() {
        return formOrder;
    }

    /**
     * Gets whether this form is the default form for the Pokémon.
     *
     * @return {@code true} if this form is the default form for the Pokémon, {@code false} otherwise.
     */
    public boolean isDefault() {
        return isDefault;
    }

    /**
     * Gets whether this form can only be used in battle.
     *
     * @return {@code true} if this form can only be used in battle, {@code false} otherwise.
     */
    public boolean isBattleOnly() {
        return isBattleOnly;
    }

    /**
     * Gets whether this form is a mega evolution.
     *
     * @return {@code true} if this form is a mega evolution, {@code false} otherwise.
     */
    public boolean isMega() {
        return isMega;
    }

    /**
     * Gets the name of this form.
     *
     * @return the name of this form.
     */
    public @Nullable String getFormName() {
        return formName;
    }

    /**
     * Gets the Pokémon that can take on this form.
     *
     * @return the Pokémon that can take on this form.
     */
    public @NotNull NamedApiResource getPokemon() {
        return pokemon;
    }

    /**
     * Gets the different types this form has.
     *
     * @return the different types this form has.
     */
    public @NotNull List<PokemonFormType> getTypes() {
        return types;
    }

    /**
     * Gets the sprites of this form.
     *
     * @return the sprites of this form.
     */
    public @NotNull PokemonFormSprites getSprites() {
        return sprites;
    }

    /**
     * Gets the version group this form was introduced in.
     *
     * @return the version group this form was introduced in.
     */
    public @NotNull NamedApiResource getVersionGroup() {
        return versionGroup;
    }

    /**
     * Gets the form names of this form.
     *
     * @return the form names of this form.
     */
    public @Nullable List<Name> getFormNames() {
        return formNames;
    }
}
