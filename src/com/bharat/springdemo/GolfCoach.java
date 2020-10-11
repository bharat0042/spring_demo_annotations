package com.bharat.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GolfCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Work on your swings";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
