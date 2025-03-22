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
import dev.greenadine.pokejava.resource.common.Effect;
import dev.greenadine.pokejava.resource.common.FlavorText;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Contest effects refer to the effects of moves when used in contests.
 */
@ResourcePath("contest-effect")
public final class ContestEffect extends ApiResource {

    private final int appeal;
    private final int jam;
    private final List<Effect> effectEntries;
    private final List<FlavorText> flavorTextEntries;

    @JsonCreator
    private ContestEffect(@JsonProperty("id") int id,
                          @JsonProperty("appeal") int appeal,
                          @JsonProperty("jam") int jam,
                          @JsonProperty("effect_entries") List<Effect> effectEntries,
                          @JsonProperty("flavor_text_entries") List<FlavorText> flavorTextEntries) {
        super(id);
        this.appeal = appeal;
        this.jam = jam;
        this.effectEntries = effectEntries;
        this.flavorTextEntries = flavorTextEntries;
    }

    /**
     * Gets the base number of hearts the user of this move gets.
     *
     * @return the base number of hearts the user of this move gets.
     */
    public int getAppeal() {
        return appeal;
    }

    /**
     * Gets the base number of hearts the user's opponent loses.
     *
     * @return the base number of hearts the user's opponent loses.
     */
    public int getJam() {
        return jam;
    }

    /**
     * Gets the effect of this contest effect listed in different languages.
     *
     * @return the effect of this contest effect listed in different languages.
     */
    public @NotNull List<Effect> getEffectEntries() {
        return effectEntries;
    }

    /**
     * Gets the flavor text of this contest effect listed in different languages.
     *
     * @return the flavor text of this contest effect listed in different languages.
     */
    public @NotNull List<FlavorText> getFlavorTextEntries() {
        return flavorTextEntries;
    }
}
