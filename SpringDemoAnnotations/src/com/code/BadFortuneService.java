package com.code;

import org.springframework.stereotype.Component;

@Component
public class BadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Today is your bad Day!";
	}

}
