package com.vb.weather;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to hold configuration properties.
 */
@ConfigurationProperties("app.weather")
public class WeatherAppProperties {

    @Valid
    private final WeatherAppProperties.OpenWeahtherApi api = new OpenWeahtherApi();
    /**
     * Comma-separated list of locations to display. Each entry should have the
     * form "City,Country".
     */
    private List<String> locations = new ArrayList<>();

    /**
     * Returns {@link OpenWeahtherApi}.
     *
     * @return the api
     */
    public OpenWeahtherApi getApi() {
        return this.api;
    }

    /**
     * Returns all locations.
     *
     * @return the locations
     */
    public List<String> getLocations() {
        return this.locations;
    }

    /**
     * Sets all the locations.
     *
     * @param locations the locations
     */
    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    /**
     * Class to hold open weather api specific configurations.
     */
    public static class OpenWeahtherApi {

        /**
         * API key of the OpenWeatherMap service.
         */
        @NotNull
        private String key;

        /**
         * The key of the OpenWeatherMap service.
         *
         * @return the key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * Sets the key of the OpenWeatherMap Service.
         *
         * @param key the non null key
         */
        public void setKey(String key) {
            this.key = key;
        }

    }

}
