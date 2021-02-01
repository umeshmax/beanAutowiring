package com.java.spring.constructorwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartAppWiring {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spwiring2.xml");
		Car c = (Car) context.getBean("c");

		System.out.println("constructor wiring:-" + c);
	}
}
