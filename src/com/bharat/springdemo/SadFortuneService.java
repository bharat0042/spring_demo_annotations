package com.bharat.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return ">> Today is not supposed to be a sad day.";
	}

}
