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

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * Builder for creating a configured {@link PokeApiClient}.
 */
public final class PokeApiBuilder {

    /**
     * Creates a new {@link PokeApiBuilder} with the default (official) PokéAPI service.
     *
     * @return the new builder.
     */
    @Contract(value = " -> new", pure = true)
    public static PokeApiBuilder withDefaultService() {
        return new PokeApiBuilder(PokeApi.BASE_URL);
    }

    /**
     * Creates a new {@link PokeApiBuilder} with a custom PokéAPI service.
     *
     * @param baseUrl the base URL of the service.
     * @return the new builder.
     */
    @Contract(value = "_ -> new", pure = true)
    public static PokeApiBuilder withService(@NotNull String baseUrl) {
        return new PokeApiBuilder(baseUrl);
    }

    final String baseUrl;
    boolean retryOnConnectionFailure = false;
    Duration connectTimeout = Duration.of(5, ChronoUnit.SECONDS);
    Duration readTimeout = Duration.of(5, ChronoUnit.SECONDS);
    Duration callTimeout = Duration.of(5, ChronoUnit.SECONDS);
    int maxCacheAge = 60;
    long maxCacheSize = 10 * 1024 * 1024;

    private PokeApiBuilder(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /**
     * Sets whether the client should retry requests on connection failure.
     *
     * @param retryOnConnectionFailure {@code true} if the client should retry requests on connection failure, {@code false} otherwise.
     * @return this builder.
     */
    @Contract("_ -> this")
    public PokeApiBuilder retryOnConnectionFailure(boolean retryOnConnectionFailure) {
        this.retryOnConnectionFailure = retryOnConnectionFailure;
        return this;
    }

    /**
     * Sets the overall timeout for the client.
     *
     * @param amount the amount of the timeout.
     * @param unit   the unit of the timeout.
     * @return this builder.
     */
    @Contract("_, _ -> this")
    public PokeApiBuilder timeout(int amount, @NotNull TemporalUnit unit) {
        this.connectTimeout = this.readTimeout = this.callTimeout = Duration.of(amount, unit);
        return this;
    }

    /**
     * Sets the overall timeout for the client.
     *
     * @param duration the duration of the timeout.
     * @return this builder.
     */
    @Contract("_ -> this")
    public PokeApiBuilder timeout(@NotNull Duration duration) {
        this.connectTimeout = this.readTimeout = this.callTimeout = duration;
        return this;
    }

    /**
     * Sets the timeout for establishing a connection.
     *
     * @param amount the amount of the connect timeout.
     * @param unit   the unit of the connect timeout.
     * @return this builder.
     */
    @Contract("_, _ -> this")
    public PokeApiBuilder connectTimeout(int amount, @NotNull TemporalUnit unit) {
        this.connectTimeout = Duration.of(amount, unit);
        return this;
    }

    /**
     * Sets the timeout for establishing a connection.
     *
     * @param duration the duration of the connect timeout.
     * @return this builder.
     */
    @Contract("_ -> this")
    public PokeApiBuilder connectTimeout(@NotNull Duration duration) {
        this.connectTimeout = duration;
        return this;
    }

    /**
     * Sets the read timeout for requests.
     *
     * @param amount the amount of the read timeout.
     * @param unit   the unit of the read timeout.
     * @return this builder.
     */
    @Contract("_, _ -> this")
    public PokeApiBuilder readTimeout(int amount, @NotNull TemporalUnit unit) {
        this.readTimeout = Duration.of(amount, unit);
        return this;
    }

    /**
     * Sets the read timeout for requests.
     *
     * @param duration the duration of the read timeout.
     * @return this builder.
     */
    @Contract("_ -> this")
    public PokeApiBuilder readTimeout(@NotNull Duration duration) {
        this.readTimeout = duration;
        return this;
    }

    /**
     * Sets the call timeout for requests.
     *
     * @param amount the amount of the call timeout.
     * @param unit   the unit of the call timeout.
     * @return this builder.
     */
    @Contract("_, _ -> this")
    public PokeApiBuilder callTimeout(int amount, @NotNull TemporalUnit unit) {
        this.callTimeout = Duration.of(amount, unit);
        return this;
    }

    /**
     * Sets the call timeout for requests.
     *
     * @param duration the duration of the call timeout.
     * @return this builder.
     */
    @Contract("_ -> this")
    public PokeApiBuilder callTimeout(@NotNull Duration duration) {
        this.callTimeout = duration;
        return this;
    }

    /**
     * Sets the maximum age for cache entries before they are evicted.
     *
     * @param maxCacheAge the maximum age for cache entries.
     * @return this builder.
     */
    @Contract("_ -> this")
    public PokeApiBuilder maxCacheAge(int maxCacheAge) {
        this.maxCacheAge = maxCacheAge;
        return this;
    }

    /**
     * Sets the maximum size for the cache.
     *
     * @param maxCacheSize the maximum size for the cache.
     * @return this builder.
     */
    @Contract("_ -> this")
    public PokeApiBuilder maxCacheSize(long maxCacheSize) {
        this.maxCacheSize = maxCacheSize;
        return this;
    }

    /**
     * Builds the {@link PokeApi} client.
     *
     * @return the {@link PokeApi} client.
     */
    @Contract(value = " -> new", pure = true)
    public PokeApi build() {
        final var config = new ServiceConfig(this);
        final var service = PokeApiServiceFactory.createService(config);
        return new PokeApiClient(service);
    }
}
