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
package dev.greenadine.pokejava.resource.game;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.common.Name;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Versions of the games, e.g., Red, Blue or Yellow.
 */
@ResourcePath("version")
public final class Version extends NamedApiResource implements NameLocalized {

    private final List<Name> names;
    private final NamedApiResource versionGroup;

    @JsonCreator
    private Version(@JsonProperty("id") int id,
                    @JsonProperty("name") String name,
                    @JsonProperty("names") List<Name> names,
                    @JsonProperty("version_group") NamedApiResource versionGroup) {
        super(id, name);
        this.names = names;
        this.versionGroup = versionGroup;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets the version group this version belongs to.
     *
     * @return the version group this version belongs to.
     */
    public @NotNull NamedApiResource getVersionGroup() {
        return versionGroup;
    }
}
