package com.vb.weather.openweatherservice;

/**
 * Open weather model.
 */
public class OpenWeather extends OpenWeatherDTO {

    private String name;

    /**
     * Returns the name of the weather.
     *
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the weather.
     *
     * @param name the name value
     */
    public void setName(String name) {
        this.name = name;
    }

}
