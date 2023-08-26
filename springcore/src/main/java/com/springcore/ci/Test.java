package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/config.xml");
		Person p1=(Person) context.getBean("person1");
		System.out.println(p1);
		
		Addition a1=(Addition) context.getBean("add");
		a1.dosum();
	}
}
