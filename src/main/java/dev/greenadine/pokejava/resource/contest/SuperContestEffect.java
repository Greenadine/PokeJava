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
package dev.greenadine.pokejava.resource.contest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.ApiResource;
import dev.greenadine.pokejava.resource.NamedApiResource;
import dev.greenadine.pokejava.resource.common.FlavorText;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Super contest effects refer to the effects of moves when used in super contests.
 */
@ResourcePath("super-contest-effect")
public final class SuperContestEffect extends ApiResource {

    private final int appeal;
    private final List<FlavorText> flavorTextEntries;
    private final List<NamedApiResource> moves;

    @JsonCreator
    private SuperContestEffect(@JsonProperty("id") int id,
                               @JsonProperty("appeal") int appeal,
                               @JsonProperty("flavor_text_entries") List<FlavorText> flavorTextEntries,
                               @JsonProperty("moves") List<NamedApiResource> moves) {
        super(id);
        this.appeal = appeal;
        this.flavorTextEntries = flavorTextEntries;
        this.moves = moves;
    }

    /**
     * Gets the appeal of this super contest effect.
     *
     * @return the appeal of this super contest effect.
     */
    public int getAppeal() {
        return appeal;
    }

    /**
     * Gets the flavor text entries of this super contest effect.
     *
     * @return the flavor text entries of this super contest effect.
     */
    public @NotNull List<FlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }

    /**
     * Gets the moves of this super contest effect.
     *
     * @return the moves of this super contest effect.
     */
    public @NotNull List<NamedApiResource> getMoves() {
        return moves;
    }
}
