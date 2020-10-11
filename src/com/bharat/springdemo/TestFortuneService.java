package com.bharat.springdemo;

public class TestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is some hard coded fortune.";
	}

}
