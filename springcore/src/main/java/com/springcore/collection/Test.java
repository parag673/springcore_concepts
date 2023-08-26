package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("heloo");
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collection_config.xml");
	Emp emp1=(Emp) context.getBean("Emp1");
	System.out.println(emp1.getName());
	System.out.println(emp1.getAddress());
	System.out.println(emp1.getCourses());
	}
}
