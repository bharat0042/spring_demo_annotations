package com.bharat.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach == alphaCoach);
		
		System.out.println(">> Are they pointing to same object: " + result);
		
		System.out.println(">> Momory location for theCoach: " + theCoach);
		
		System.out.println(">> Memory location for alphaCoach: " + alphaCoach);
		
		context.close();
	}

}
