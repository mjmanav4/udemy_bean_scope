package com.manavjain.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

		
		Coach  theCoach = context.getBean("myCoach",Coach.class);
		
	System.out.print(theCoach.getDailyFortune());
		context.close();
		
	}

}
