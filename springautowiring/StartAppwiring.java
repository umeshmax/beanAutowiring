package com.java.spring.springautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartAppwiring {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("spwiring.xml");
		Car c = (Car) context.getBean("c");
		//System.out.println(c);

	}
}
