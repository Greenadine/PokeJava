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
package dev.greenadine.pokejava.resource.pokemon.type;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.GenerationGameIndex;
import dev.greenadine.pokejava.resource.common.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective
 * against, and which types of Pokémon it is completely ineffective against.
 */
@ResourcePath("type")
public final class Type extends NamedApiResource implements NameLocalized {

    private final TypeRelations damageRelations;
    private final List<TypeRelationsPast> pastDamageRelations;
    private final List<GenerationGameIndex> gameIndices;
    private final NamedApiResource generation;
    private final NamedApiResource moveDamageClass;
    private final List<Name> names;
    private final List<TypePokemon> pokemon;
    private final List<NamedApiResource> moves;
    private final TypeGenerationSprites sprites;

    @JsonCreator
    private Type(@JsonProperty("id") int id,
                 @JsonProperty("name") String name,
                 @JsonProperty("damage_relations") TypeRelations damageRelations,
                 @JsonProperty("past_damage_relations") List<TypeRelationsPast> pastDamageRelations,
                 @JsonProperty("game_indices") List<GenerationGameIndex> gameIndices,
                 @JsonProperty("generation") NamedApiResource generation,
                 @JsonProperty("move_damage_class") NamedApiResource moveDamageClass,
                 @JsonProperty("names") List<Name> names,
                 @JsonProperty("pokemon") List<TypePokemon> pokemon,
                 @JsonProperty("moves") List<NamedApiResource> moves,
                 @JsonProperty("sprites") TypeGenerationSprites sprites) {
        super(id, name);
        this.damageRelations = damageRelations;
        this.pastDamageRelations = pastDamageRelations;
        this.gameIndices = gameIndices;
        this.generation = generation;
        this.moveDamageClass = moveDamageClass;
        this.names = names;
        this.pokemon = pokemon;
        this.moves = moves;
        this.sprites = sprites;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets a detail of how effective this type is toward others (and vice versa).
     *
     * @return a detail of how effective this type is toward others (and vice versa).
     */
    public @NotNull TypeRelations getDamageRelations() {
        return damageRelations;
    }

    /**
     * Gets a list of details of how effective this type was toward others and vice versa in previous generations.
     *
     * @return a list of details of how effective this type was toward others and vice versa in previous generations.
     */
    public @Nullable List<TypeRelationsPast> getPastDamageRelations() {
        return pastDamageRelations;
    }

    /**
     * Gets a list of game indices relevant to this item by generation.
     *
     * @return a list of game indices relevant to this item by generation.
     */
    public @NotNull List<GenerationGameIndex> getGameIndices() {
        return gameIndices;
    }

    /**
     * Gets the generation this type was introduced in.
     *
     * @return the generation this type was introduced in.
     */
    public @NotNull NamedApiResource getGeneration() {
        return generation;
    }

    /**
     * Gets the class of damage inflicted by this type.
     *
     * @return the class of damage inflicted by this type.
     */
    public @Nullable NamedApiResource getMoveDamageClass() {
        return moveDamageClass;
    }

    /**
     * Gets a list of details of Pokémon that have this type.
     *
     * @return a list of details of Pokémon that have this type.
     */
    public @NotNull List<TypePokemon> getPokemon() {
        return pokemon;
    }

    /**
     * Gets a list of moves that have this type.
     *
     * @return a list of moves that have this type.
     */
    public @NotNull List<NamedApiResource> getMoves() {
        return moves;
    }

    /**
     * Gets the generation sprites of this type.
     *
     * @return the generation sprites of this type.
     */
    public @NotNull TypeGenerationSprites getSprites() {
        return sprites;
    }
}
