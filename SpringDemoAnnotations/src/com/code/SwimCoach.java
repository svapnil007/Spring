package com.code;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService theFortuneService;
	
	@Value("${sport.email}")
	private String email;
	
	public SwimCoach(FortuneService theFortuneService) {
		this.theFortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 100m every Day!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return theFortuneService.getDailyFortune();
	}
	
	public String getEmail() {
		return email;
	}

}
