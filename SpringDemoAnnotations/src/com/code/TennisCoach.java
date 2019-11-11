package com.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	
	@Autowired
	@Qualifier("badFortuneService")
	private FortuneService theFortuneService;
	


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Every Day!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return theFortuneService.getDailyFortune();
	}
	
	

	
}
