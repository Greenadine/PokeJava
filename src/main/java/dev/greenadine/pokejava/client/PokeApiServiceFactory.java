package dev.greenadine.pokejava.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * A factory for creating instances of {@link PokeApiService}.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public final class PokeApiServiceFactory {

    private PokeApiServiceFactory() {
        throw new UnsupportedOperationException("No instances of PokeApiServiceFactory may be created.");
    }

    public static final PokeApiService VERSION_2;
    static {
        VERSION_2 = createService(new PokeApiV2ClientConfig());
    }

    /**
     * Returns the default PokéApi service.
     *
     * @return the default instance of {@link PokeApiService}.
     */
    static PokeApiService getDefaultService() {
        return VERSION_2;
    }

    /**
     * Creates a new instance of {@link PokeApiService} using the provided {@link ClientConfig} and {@link ObjectMapper}.
     *
     * @param config the {@link ClientConfig} to use.
     *
     * @return a new {@link PokeApiService}.
     */
    static PokeApiService createService(ClientConfig config) {
        return new Retrofit.Builder()
                .baseUrl(config.getBaseUrl())
                .addConverterFactory(JacksonConverterFactory.create())
                .client(config.getOkHttpConfig().build())
                .build()
                .create(PokeApiService.class);
    }
}
