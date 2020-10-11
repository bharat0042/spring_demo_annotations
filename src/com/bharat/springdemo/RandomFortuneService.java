package com.bharat.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] fortune= {"Diligence is the key.", "The wolf in sheeps clothing.", "Holy mother of god."};
	
	private Random random = new Random();

	@Override
	public String getFortune() {
		return fortune[random.nextInt(fortune.length)];
	}

}
