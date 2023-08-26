package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

public class Student {
	private Samosa samosa;

	public void study() {
		System.out.println("sudents is studing");
		this.samosa.display();
	}
	
	
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [samosa=" + samosa + "]";
	}
	
	
}
