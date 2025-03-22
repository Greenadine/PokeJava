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

import dev.greenadine.pokejava.resource.common.Language;
import dev.greenadine.pokejava.resource.common.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * A {@link NamedApiResource} that has localized names.
 */
public interface NameLocalized {

    /**
     * Gets the name of the resource in different languages.
     *
     * @return a list of names of the resource.
     */
    List<Name> getNames();

    /**
     * Gets the name of the resource in a specific language.
     *
     * @param language the name of the language.
     * @return the name of the resource in the specified language, or {@code null} if no name is available in the specified language or if the resource has no localized names.
     */
    default @Nullable String getNameInLanguage(@NotNull String language) {
        final var names = getNames();
        if (names == null || names.isEmpty())
            return null;
        return names.stream()
                .filter(name -> name.language().getName().equals(language))
                .findFirst()
                .map(Name::name)
                .orElse(null);
    }

    /**
     * Gets the name of the resource in a specific language.
     *
     * @param language the language.
     * @return the name of the resource in the specified language, or {@code null} if no name is available in the specified language or if the resource has no localized names.
     */
    default @Nullable String getNameInLanguage(@NotNull Language language) {
        return getNameInLanguage(language.getName());
    }
}
