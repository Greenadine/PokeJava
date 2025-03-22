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

import dev.greenadine.pokejava.resource.common.Description;
import dev.greenadine.pokejava.resource.common.Language;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * An {@link ApiResource} that has localized descriptions.
 */
public interface DescriptionLocalized {

    /**
     * Gets the description of the resource in different languages.
     *
     * @return a list of descriptions of the resource.
     */
    @NotNull List<Description> getDescriptions();

    /**
     * Gets the description of the resource in a specific language.
     *
     * @param language the name of the language.
     * @return the description of the resource in the specified language, or {@code null} if no description is available in the specified language or if the resource has no localized
     * descriptions.
     */
    default @Nullable String getDescriptionInLanguage(@NotNull String language) {
        return getDescriptions().stream()
                .filter(name -> name.language().getName().equals(language))
                .findFirst()
                .map(Description::description)
                .orElse(null);
    }

    /**
     * Gets the name of the resource in a specific language.
     *
     * @param language the language.
     * @return the description of the resource in the specified language, or {@code null} if no description is available in the specified language or if the resource has no localized
     * descriptions.
     */
    default @Nullable String getDescriptionInLanguage(@NotNull Language language) {
        return getDescriptionInLanguage(language.getName());
    }
}
