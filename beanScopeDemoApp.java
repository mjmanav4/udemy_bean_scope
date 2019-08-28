package com.manavjain.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		
		Coach  theCoach = context.getBean("myCoach",Coach.class);
		
		
		Coach  alphaCoach = context.getBean("myCoach",Coach.class);
		
		
		boolean result = (theCoach==alphaCoach);
		
		System.out.println("result " + result);
		
		context.close();
		
	}

}
