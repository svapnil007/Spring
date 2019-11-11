package com.code;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.code")
public class SportConfig {
	
	
	//creating bean for fortuneService
	@Bean
	public FortuneService sadFortuneService() {
		return new BadFortuneService();
	}
	
	
	//define bean for swimCoach and inject dependency of previous bean
	@Bean
	public SwimCoach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
	
	
}
