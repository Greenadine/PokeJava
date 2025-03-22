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
package dev.greenadine.pokejava.resource.machine;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.ApiResource;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

/**
 * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
 */
@ResourcePath("machine")
public final class Machine extends ApiResource {

    private final NamedApiResource item;
    private final NamedApiResource move;
    private final NamedApiResource versionGroup;

    @JsonCreator
    private Machine(@JsonProperty("id") int id,
                    @JsonProperty("item") NamedApiResource item,
                    @JsonProperty("move") NamedApiResource move,
                    @JsonProperty("version_group") NamedApiResource versionGroup) {
        super(id);
        this.item = item;
        this.move = move;
        this.versionGroup = versionGroup;
    }

    /**
     * Gets the TM or HM item that corresponds to this machine.
     *
     * @return the TM or HM item that corresponds to this machine.
     */
    public @NotNull NamedApiResource getItem() {
        return item;
    }

    /**
     * The move that is taught by this machine.
     *
     * @return the move that is taught by this machine.
     */
    public @NotNull NamedApiResource getMove() {
        return move;
    }

    /**
     * Gets the version group that this machine applies to.
     *
     * @return the version group that this machine applies to.
     */
    public @NotNull NamedApiResource getVersionGroup() {
        return versionGroup;
    }
}
