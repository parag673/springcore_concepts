package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		Student s1=(Student) context.getBean("ob");
		System.out.println(s1.toString());
		System.out.println(s1.getAddress());
		System.out.println(s1.getAddress().getClass());
	}
}
