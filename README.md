# weather-app

## Design

1. Make a client to query and parse response from OpenWeatherMap API. (https://openweathermap.org/current) 
2. Use Spring MVC for exposing REST endpoints to return all locations and weather for a specific location respectively.
3. Create Thymeleaf templates for UI part and auto wiring modelandview objects returned from REST endpoints from above.
4. Add configuration, manage the locations from configuration - so that cities and countries could be added on the fly.
5. Unit test using MVCMock test framework

## Tech Stack
- Spring-boot 2.1.5.RELEASE
- Java 1.8
- Maven 3.x
- Spring MVC
- Thymeleaf templates

## Other Documents
- Class Diagram : extras/weather-app-class-diagram.png
- Java docs: extras/auto-generated-java-docs/index.html

## System Requirement
- Git should be installed to checkout the code.
- Maven 3.x installed to build the code
- A browser like chrome should be installed.

## To run the app 
- execute following commands in terminal or any other CLI
```
$ git clone https://github.com/vaibhavg12/weather-app.git 
$ cd weather-app
$ mvn spring-boot:run
```
- then Navigate to URL = http://localhost:8080

## Using the App 
- Expand the drop down and select a value and hit submit. 
- The app navigates to weather summary
- Navigate again to http://localhost:8080 and this time, without selecting anything hit submit.
- The app navigates to error page, prompting to select a location




