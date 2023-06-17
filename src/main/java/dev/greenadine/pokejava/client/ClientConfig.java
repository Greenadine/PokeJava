package dev.greenadine.pokejava.client;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;

/**
 * Represents the configuration of the client.
 *
 * @since 0.1.0
 * @author Greenadine
 */
public abstract class ClientConfig {

    private static final Interceptor ONLINE_INTERCEPTOR = chain -> {
        Response response = chain.proceed(chain.request());
        int maxAge = 60; // read from cache for 1 minute
        return response.newBuilder().header("Cache-Control", "public, max-age=" + maxAge)
                .removeHeader("Pragma")
                .build();
    };

    private final String baseUrl;
    private final OkHttpClient.Builder okHttpConfig;

    protected ClientConfig(@NotNull final String baseUrl) {
        this.baseUrl = baseUrl;
        okHttpConfig = new OkHttpClient.Builder()
                .retryOnConnectionFailure(false)
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .addInterceptor(ONLINE_INTERCEPTOR)
                .cache(new Cache(new File("cache/"), 10 * 1024 * 1024));
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

    /**
     * Checks if the application has internet connectivity.
     *
     * @return {@code true} if the application has internet connectivity, {@code false} otherwise.
     */
    private static boolean isOffline() {
        try {
            URL url = new URL("https://google.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
