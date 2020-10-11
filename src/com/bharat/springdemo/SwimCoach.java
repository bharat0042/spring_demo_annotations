package com.bharat.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	public SwimCoach(FortuneService fortunService) {
		this.fortuneService = fortunService;
	}

	@Override
	public String getDailyWorkout() {
		return ">> Swim 1000 meters for warm up.";
	}

	@Override
	public String getDailyFortune() {
		System.out.println(">> SwimCoach: email: " + email);
		System.out.println(">> SwimCoach: team: " + team);
		return fortuneService.getFortune();
		
	}

}
