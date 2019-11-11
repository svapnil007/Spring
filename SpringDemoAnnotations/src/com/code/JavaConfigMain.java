package com.code;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Read the spring config java class
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		// Retrieve the beans
			
		//Coach theCoach = context.getBean("tennisCoach", Coach.class); this will also work
		Coach theCoach = context.getBean("swimCoach", Coach.class);
	//	SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		
		//calling the method on bean
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//System.out.println()
		//close
		context.close();
		

	}

}
