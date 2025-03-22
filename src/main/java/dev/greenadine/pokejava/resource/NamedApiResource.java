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
package dev.greenadine.pokejava.resource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.client.PokeApi;
import org.jetbrains.annotations.NotNull;

/**
 * An {@link ApiResource} that also has a name.
 *
 * <p> This class is the base class for all named API resources. Certain named API resources may also have {@linkplain NameLocalized localized names in different languages}.
 *
 * <p> In certain cases, methods may return this class instead of a subclass. This is because the PokéAPI sometimes returns a reference to a resource instead of the full resource. In such
 * cases, the full resource can be retrieved with the corresponding method in {@link PokeApi}.
 */
public class NamedApiResource extends ApiResource {

    private final String name;

    // Jackson constructor
    @JsonCreator
    protected NamedApiResource(@JsonProperty("name") String name,
                               @JsonProperty("url") String url) {
        super(url);
        this.name = name;
    }

    // Subclass constructor
    protected NamedApiResource(int id, String name) {
        super(id);
        this.name = name;
    }

    /**
     * Gets the name of the resource.
     *
     * @return the name of the resource.
     */
    public @NotNull String getName() {
        return name;
    }
}
