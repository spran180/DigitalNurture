package com.cognizant.spring_learn.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:country.xml")
public class CountryConfig {
}
