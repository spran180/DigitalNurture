package com.cognizant.orm.learn;

import com.cognizant.orm.learn.model.Country;
import com.cognizant.orm.learn.service.CountryService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;


@SpringBootApplication
public class Application {
	private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

	private static CountryService countryService;

	private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("countries={}", countries);
		LOGGER.info("End");
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		countryService = context.getBean(CountryService.class);

		testGetAllCountries();
		LOGGER.info("Inside main");
	}

}
