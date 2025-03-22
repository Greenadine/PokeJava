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
package dev.greenadine.pokejava.client;

import java.util.List;

/**
 * An exception that is thrown when an API call is made to a non-existent PokéAPI resource.
 */
public final class ResourceNotFoundException extends PokeApiException {

    ResourceNotFoundException(List<String> urlSegments) {
        super(buildMessage(urlSegments));
    }

    // Builds the exception message
    private static String buildMessage(List<String> urlSegments) {
        final var resourceNameOrId = urlSegments.get(urlSegments.size() - 2);
        final var resourceCategory = urlSegments.get(urlSegments.size() - 3);
        return resourceCategory + " with ID or name '" + getResourceDisplayName(resourceCategory) + "' does not exist";
    }
}
