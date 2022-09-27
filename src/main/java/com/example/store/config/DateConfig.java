package com.example.store.config;

import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.store.shared.ApplicationConstants;

@Configuration
public class DateConfig {

	@Bean
	public DateTimeFormatter dateTimeFormatter() {
		return DateTimeFormatter.ofPattern(ApplicationConstants.DEFAULT_DATE_FORMAT);
	}

}
