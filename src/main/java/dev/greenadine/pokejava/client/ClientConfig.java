package dev.greenadine.pokejava.client;

import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

/**
 * Represents the configuration of the client.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public abstract class ClientConfig {

    private final String baseUrl;
    private final OkHttpClient.Builder okHttpConfig;
    protected ClientConfig(@NotNull final String baseUrl) {
        this.baseUrl = baseUrl;
        okHttpConfig = new OkHttpClient.Builder()
                .retryOnConnectionFailure(false)
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS);
    }

    /**
     * Gets the base URL of the API.
     *
     * @return the base URL of the API.
     */
    @NotNull
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Gets the configuration of the HTTP client.
     *
     * @return the configuration of the HTTP client.
     */
    @NotNull
    public OkHttpClient.Builder getOkHttpConfig() {
        return okHttpConfig;
    }
}
