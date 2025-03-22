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
package dev.greenadine.pokejava.util;

import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.ApiResource;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.ApiStatus.Internal;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility class for the PokéJava library.
 *
 * @apiNote This class is for internal use only, and should not be relied upon by external code, as it may change at any time without warning. No support will be provided for this class.
 */
@Internal
public final class PokeJavaUtils {

    private static final Map<Class<? extends ApiResource>, String> RESOURCE_PATHS = new HashMap<>();

    private PokeJavaUtils() {
    }

    /**
     * Gets the resource path for the given resource class.
     *
     * @param resourceClass the resource class.
     * @return the resource path.
     */
    public static @NotNull String getResourcePath(@NotNull Class<? extends ApiResource> resourceClass) {
        if (resourceClass == ApiResource.class || resourceClass == NamedApiResource.class)
            throw new IllegalArgumentException("Can only get resource path for subclasses of (Named)ApiResource");
        return RESOURCE_PATHS.computeIfAbsent(resourceClass, PokeJavaUtils::computeResourcePath);
    }

    // Computes the resource path for the given resource class
    private static String computeResourcePath(Class<? extends ApiResource> resourecClass) {
        if (!resourecClass.isAnnotationPresent(ResourcePath.class))
            throw new IllegalArgumentException(resourecClass.getSimpleName() + " is missing @ResourcePath");
        return resourecClass.getAnnotation(ResourcePath.class).value();
    }
}
