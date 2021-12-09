package com.vb.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Entry class for spring boot.
 */
@SpringBootApplication
@EnableConfigurationProperties(WeatherAppProperties.class)
public class WeatherApp {

    /**
     * the main method
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(WeatherApp.class, args);
    }

}
