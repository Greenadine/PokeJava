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

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * A list of {@linkplain ApiResource resources from the PokéAPI}.
 *
 * @param <T> the type of resources in the list.
 */
public abstract sealed class PokeApiResourceList<T extends ApiResource>
        permits NamedApiResourceList, ApiResourceList {

    private final int count;
    private final String next;
    private final String previous;
    private final List<T> results;

    PokeApiResourceList(int count, String next, String previous, List<T> results) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
    }

    /**
     * Gets the total number of resources available from the resource list.
     *
     * @return the total number of resources available from the resource list.
     */
    public int getCount() {
        return count;
    }

    /**
     * Gets the (full) URL for the next page in the list.
     *
     * @return the URL for the next page in the list, or {@code null} if there is no next page.
     */
    public @Nullable String getNext() {
        return next;
    }

    /**
     * Gets the (full) URL for the previous page in the list.
     *
     * @return the URL for the previous page in the list, or {@code null} if there is no previous page.
     */
    public @Nullable String getPrevious() {
        return previous;
    }

    /**
     * Gets the list of resources.
     *
     * @return the list of resources.
     */
    public @NotNull List<T> getResults() {
        return results;
    }
}
