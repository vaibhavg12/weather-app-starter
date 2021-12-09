package com.vb.weather.openweatherservice;

/**
 * Location model
 */
public class Location {

    private final String country;
    private final String city;
    private String text;

    /**
     * Constructor.
     *
     * @param country the country
     * @param city    the city
     */
    public Location(String country, String city) {
        this.country = country;
        this.city = city;
    }

    /**
     * Returns the country.
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Returns the city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Returns the readable location in format "City, Country".
     *
     * @return the text
     */
    public String getText() {
        text = toString();
        return text;
    }

    @Override
    public String toString() {
        return city + ", " + country;
    }
}
