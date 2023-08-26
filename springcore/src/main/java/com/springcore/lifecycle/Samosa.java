package com.springcore.lifecycle;

public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}
	
	public void hey() {
		System.out.println("this is init method");
	}
	
	public void buy() {
		System.out.println("this is destroy method");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
}
