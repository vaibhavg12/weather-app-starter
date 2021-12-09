package com.vb.weather.openweatherservice;


import com.vb.weather.openweatherservice.OpenWeather;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Weather summary model.
 */
class WeatherSummary {

    private final String country;
    private final String city;
    private final OpenWeather weather;
    private String temperature;
    private String currentTime;

    /**
     * Constructor.
     *
     * @param country the country
     * @param city    the city
     * @param weather {@link OpenWeather} instance
     */
    WeatherSummary(String country, String city, OpenWeather weather) {
        this.country = country;
        this.city = city;
        this.weather = weather;
    }

    /**
     * Returns the country.
     *
     * @return the country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Returns the city.
     *
     * @return the city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Returns the temperature in format xx.xx˚C | xx.xx˚F.
     *
     * @return the temperature
     */
    public String getTemperature() {
        double tempF = (this.weather.getTemperature() * 1.8) - 459.67;
        double tempC = this.weather.getTemperature() - 273.15;
        temperature = String.format("%4.2f", tempC) + "˚C" + " | " + String.format("%4.2f", tempF) + "˚F";
        return temperature;
    }

    /**
     * Returns the main weather condition.
     *
     * @return the main weather
     */
    public String getWeatherMain() {
        return this.weather.getWeatherMain();
    }

    /**
     * Returns the wind speed in format xx.xx m/s.
     *
     * @return the wind speed
     */
    public String getWindSpeed() {
        return String.format("%4.2f", weather.getWindSpeed()) + " m/s";
    }

    /**
     *
     * Returns the time when weather information was updated in format DD/MM/YY HH:mm.
     *
     * @return the time
     */
    public String getCurrentTime() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                        .withLocale(Locale.UK)
                        .withZone(ZoneId.systemDefault());
        currentTime = formatter.format(this.weather.getTimestamp());
        return currentTime;
    }
}
