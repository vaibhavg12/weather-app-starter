package com.vb.weather.openweatherservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;
import java.util.Map;

/**
 * Data transfer object for open weather service.
 */
public class OpenWeatherDTO implements Serializable {

    private Instant timestamp;
    private double temperature;
    private String weatherMain;
    private double windSpeed;

    /**
     * Returns the main property of the weather.
     *
     * @return the main property
     */
    public String getWeatherMain() {
        return weatherMain;
    }

    /**
     * Sets the main property of the weather.
     *
     * @param weatherMain the main property
     */
    public void setWeatherMain(String weatherMain) {
        this.weatherMain = weatherMain;
    }

    /**
     * Returns the wind speed.
     *
     * @return the wind speed
     */
    public double getWindSpeed() {
        return windSpeed;
    }

    /**
     * Sets the wind speed.
     *
     * @param windSpeed the wind speed
     */
    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    /**
     * Return the temperature in Kelvin (K).
     *
     * @return the temperature
     */
    public double getTemperature() {
        return this.temperature;
    }

    /**
     * Sets the temperature.
     *
     * @param temperature the temperature
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * Parses the JSON response for weather property and sets it to correct class variable.
     *
     * @param weatherEntries the weather property object
     */
    @JsonProperty("weather")
    public void setWeather(List<Map<String, Object>> weatherEntries) {
        Map<String, Object> weather = weatherEntries.get(0);
        setWeatherMain((String) weather.get("main"));
    }

    /**
     * Parses the JSON response for wind property and sets it to correct class variable.
     *
     * @param wind the wind property object
     */
    @JsonProperty("wind")
    public void setWind(Map<String, Object> wind) {
        setWindSpeed(Double.parseDouble(wind.get("speed").toString()));
    }

    /**
     * Parses the JSON response for timestamp property.
     *
     * @return the value of timestamp property
     */
    @JsonProperty("timestamp")
    public Instant getTimestamp() {
        return this.timestamp;
    }

    /**
     * Parses the JSON response for dt property and sets it to correct class variable.
     *
     * @param unixTime the unixtime property object
     */
    @JsonSetter("dt")
    public void setTimestamp(long unixTime) {
        this.timestamp = Instant.ofEpochMilli(unixTime * 1000);
    }

    /**
     * Parses the JSON response for main property and sets it to correct class variable.
     *
     * @param main the main property object
     */
    @JsonProperty("main")
    public void setMain(Map<String, Object> main) {
        setTemperature(Double.parseDouble(main.get("temp").toString()));
    }

}
