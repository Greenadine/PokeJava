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

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

// Factory for creating PokeApiService instances
final class PokeApiServiceFactory {

    private PokeApiServiceFactory() {
    }

    // Builds a new instance of PokeApiService using the provided configuration
    static PokeApiService createService(ServiceConfig config) {
        return createService(config.baseUrl, config.client.build());
    }

    // Creates a new instance of PokeApiService with the provided base URL and OkHttpClient
    private static PokeApiService createService(String baseUrl, OkHttpClient client) {
        final var jacksonConverterFactory = createJacksonConverterFactory();
        return new Retrofit.Builder()
                .client(client)
                .baseUrl(baseUrl)
                .addConverterFactory(jacksonConverterFactory)
                .build()
                .create(PokeApiService.class);
    }

    // Create a JacksonConverterFactory with a custom ObjectMapper
    private static JacksonConverterFactory createJacksonConverterFactory() {
        final var objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
        objectMapper.enable(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT);
        return JacksonConverterFactory.create(objectMapper);
    }
}
