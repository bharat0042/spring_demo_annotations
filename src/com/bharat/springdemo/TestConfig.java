package com.bharat.springdemo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
public class TestConfig {
	
	@Bean
	public FortuneService sadFortuneService() {
		return new TestFortuneService();
	}
	
	@Bean
	public Coach testCoach() {
		return new TestCoach(sadFortuneService());
	}
}
