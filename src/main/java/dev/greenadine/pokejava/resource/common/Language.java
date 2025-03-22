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
package dev.greenadine.pokejava.resource.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.greenadine.pokejava.annotation.ResourcePath;
import dev.greenadine.pokejava.resource.NameLocalized;
import dev.greenadine.pokejava.resource.NamedApiResource;
import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * Languages for translations of API resource information.
 */
@ResourcePath("language")
public final class Language extends NamedApiResource implements NameLocalized {

    private final boolean official;
    private final String iso639;
    private final String iso3166;
    private final List<Name> names;

    @JsonCreator
    private Language(@JsonProperty("id") int id,
                     @JsonProperty("name") String name,
                     @JsonProperty("official") boolean official,
                     @JsonProperty("iso639") String iso639,
                     @JsonProperty("iso3166") String iso3166,
                     @JsonProperty("names") List<Name> names) {
        super(id, name);
        this.official = official;
        this.iso639 = iso639;
        this.iso3166 = iso3166;
        this.names = names;
    }

    @Override
    public @NotNull List<Name> getNames() {
        return names;
    }

    /**
     * Gets whether the games are published in this language.
     *
     * @return {@code true} if the games are published in this language; {@code false} otherwise.
     */
    public boolean isOfficial() {
        return official;
    }

    /**
     * Gets the two-letter code of the country where this language is spoken. Note that it is not unique.
     *
     * @return the two-letter code of the country where this language is spoken.
     */
    public @NotNull String getIso639() {
        return iso639;
    }

    /**
     * Gets the two-letter code of the language. Note that it is not unique.
     *
     * @return the two-letter code of the language.
     */
    public @NotNull String getIso3166() {
        return iso3166;
    }
}
