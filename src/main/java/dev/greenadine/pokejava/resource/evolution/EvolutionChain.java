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
package dev.greenadine.pokejava.resource.evolution;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.ApiResource;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through
 * the hierarchy.
 */
@ResourcePath("evolution-chain")
public final class EvolutionChain extends ApiResource {

    private final NamedApiResource babyTriggerItem;
    private final ChainLink chain;

    @JsonCreator
    private EvolutionChain(@JsonProperty("id") int id,
                           @JsonProperty("baby_trigger_item") NamedApiResource babyTriggerItem,
                           @JsonProperty("chain") ChainLink chain) {
        super(id);
        this.babyTriggerItem = babyTriggerItem;
        this.chain = chain;
    }

    /**
     * Gets the item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
     *
     * @return the item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
     */
    public @Nullable NamedApiResource getBabyTriggerItem() {
        return babyTriggerItem;
    }

    /**
     * Gets the base chain link object. Each link contains evolution details for a Pokémon in the chain.
     *
     * @return the base chain link object. Each link contains evolution details for a Pokémon in the chain.
     */
    public @NotNull ChainLink getChain() {
        return chain;
    }
}
