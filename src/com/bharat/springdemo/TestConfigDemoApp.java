package com.bharat.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
		Coach theCoach = context.getBean("testCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		context.close();
	}

}
