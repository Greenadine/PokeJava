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

import okhttp3.Cache;
import okhttp3.OkHttpClient;

import java.io.File;
import java.time.Duration;

// Configuration for the PokéAPI service
class ServiceConfig {

    final String baseUrl;
    final OkHttpClient.Builder client;

    // Default constructor
    private ServiceConfig(String baseUrl, boolean retryOnConnectionFailure, Duration connectTimeout, Duration readTimeout, Duration callTimeout, int cacheMaxAge, long cacheMaxSize) {
        this.baseUrl = baseUrl;
        this.client = new OkHttpClient.Builder()
                .retryOnConnectionFailure(retryOnConnectionFailure)
                .connectTimeout(connectTimeout)
                .readTimeout(readTimeout)
                .callTimeout(callTimeout)
                .addInterceptor(chain -> {
                    try (final var response = chain.proceed(chain.request())) {
                        return response.newBuilder().header("Cache-Control", "public, max-age=" + cacheMaxAge)
                                .build();
                    }
                })
                .cache(new Cache(new File("cache/"), cacheMaxSize));
    }

    // Simple constructor
    ServiceConfig(String baseUrl) {
        this(baseUrl,false, Duration.ofSeconds(5), Duration.ofSeconds(5), Duration.ofSeconds(5), 60, 10 * 1024 * 1024);
    }

    // Copy constructor from PokeApiBuilder
    ServiceConfig(PokeApiBuilder builder) {
        this(builder.baseUrl, builder.retryOnConnectionFailure, builder.connectTimeout, builder.readTimeout, builder.callTimeout, builder.maxCacheAge, builder.maxCacheSize);
    }
}
