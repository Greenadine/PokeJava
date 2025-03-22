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
import dev.greenadine.pokejava.util.PokeJavaUtils;
import org.jetbrains.annotations.NotNull;

/**
 * A resource in the PokéAPI.
 *
 * <p> This class is the base class for all API resources. It provides the ID, base relative path, and relative URL of the resource.
 *
 * <p> In certain cases, methods may return this class instead of a subclass. This is because the PokéAPI sometimes returns a reference to a resource instead of the full resource. In such
 * cases, the full resource can be retrieved with the corresponding method in {@link PokeApi}.
 *
 * @see NamedApiResource
 */
public class ApiResource {

    private final int id;
    private final String resourcePath;

    // Jackson constructor
    @JsonCreator
    protected ApiResource(@JsonProperty("url") String url) {
        final var urlSegments = url.split("/");
        this.id = Integer.parseInt(urlSegments[urlSegments.length - 1]);
        this.resourcePath = urlSegments[urlSegments.length - 2];
    }

    // Subclass constructor
    protected ApiResource(int id) {
        this.id = id;
        this.resourcePath = PokeJavaUtils.getResourcePath(getClass());
    }

    /**
     * Gets the ID of the resource.
     *
     * @return the resource's ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Gets the relative API path of the resource, e.g., "pokemon" or "ability".
     *
     * @return the resource's relative API path.
     */
    public @NotNull String getResourcePath() {
        return resourcePath;
    }
}
