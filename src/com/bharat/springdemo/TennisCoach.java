package com.bharat.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	public TennisCoach() {
		System.out.println(">> TennisCoach : Inside TennisCoach() no-arg constructor");
	}
	
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">> TennisCoach : Inside method setFortuneService");
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	@Autowired
	public void doSomething(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach : Inside method doSomething");
		this.fortuneService = theFortuneService;
	}
	*/
	
	@PostConstruct
	public void doSomeStartupStuff() {
		System.out.println(">> TennisCoach : Inside doSomeStartupStuff()");
	}
	
	@PreDestroy
	public void doSomeCleanupStuff() {
		System.out.println(">> TennisCoach : Inside doSomeCleanupStuff()");
	}
	
	@Override
	public String getDailyWorkout() {
		return ">> Practice some backhand volly";
	}

	@Override
	public String getDailyFortune() {
		return ">> " + fortuneService.getFortune();
	}
}
