package com.springcore.lifecycle;

import javax.security.auth.Subject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//Samosa s1=(Samosa) context.getBean("sam");
		//System.out.println(s1);
		context.registerShutdownHook();
		
		//Pepsi p1=(Pepsi) context.getBean("pep");
		//System.out.println(p1);
		Example sub1= (Example) context.getBean("subject");
		System.out.println(sub1);
	}
}
