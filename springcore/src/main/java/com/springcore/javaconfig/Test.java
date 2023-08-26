package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(javaconfig.class);
		Student s1=(Student) con.getBean("getStudent");
		System.out.println(s1);
		s1.study();
		Samosa s2=(Samosa) con.getBean("getSamosa");
		System.out.println(s2);
	}
}
