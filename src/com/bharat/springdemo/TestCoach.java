package com.bharat.springdemo;

public class TestCoach implements Coach {
	
	private FortuneService fortuneService;

	public TestCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Do some test runs.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
