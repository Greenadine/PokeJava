package dev.greenadine.pokejava.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.greenadine.pokejava.client.v2.PokeApiV2ClientConfig;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public final class PokeApiServiceFactory {

    private PokeApiServiceFactory() {
        throw new UnsupportedOperationException("No instances of PokeApiServiceFactory may be created.");
    }

    private static final PokeApiService DEFAULT_SERVICE;
    static {
        DEFAULT_SERVICE = createService(new PokeApiV2ClientConfig());
    }

    /**
     * Returns the default PokéApi service.
     * The current default service is for PokéApi v2.
     *
     * @return the default instance of {@link PokeApiService}.
     */
    public static PokeApiService getDefaultService() {
        return DEFAULT_SERVICE;
    }

    /**
     * Creates a new instance of {@link PokeApiService} using the provided {@link ClientConfig} and {@link ObjectMapper}.
     *
     * @param config the {@link ClientConfig} to use.
     *
     * @return a new {@link PokeApiService}.
     */
    public static PokeApiService createService(ClientConfig config) {
        return new Retrofit.Builder()
                .baseUrl(config.getBaseUrl())
                .addConverterFactory(JacksonConverterFactory.create())
                .client(config.getOkHttpConfig().build())
                .build()
                .create(PokeApiService.class);
    }
}
