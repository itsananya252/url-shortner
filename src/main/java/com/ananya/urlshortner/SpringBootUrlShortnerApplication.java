package com.ananya.urlshortner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootUrlShortnerApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootUrlShortnerApplication.class, args);
	}

}
