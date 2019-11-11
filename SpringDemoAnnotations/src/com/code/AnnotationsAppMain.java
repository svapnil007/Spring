package com.code;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Read the applications context file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve the beans
			
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//calling the method on bean
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close
		context.close();
		

	}

}
