package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/config.xml");

		Person p1= (Person) context.getBean("person");
	System.out.println(p1);
	System.out.println("------------------------------------------------------------------");
	System.out.println(p1.getFeeStructure());
	System.out.println(p1.getFeeStructure().getClass().getName());
	
	System.out.println("--------------------------------------------------------------------");
	
	System.out.println(p1.getProperties());
	
	}
}
