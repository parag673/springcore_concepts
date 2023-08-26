package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{45+89}")
	private int x;
	
	@Value("#{65+78+56}")
	private int y;
	
	@Value("#{T(java.lang.Math).PI}")
	private double z;
	
	@Value("#{ 4>8 }")
	private boolean e;
	
	
	public boolean isE() {
		return e;
	}
	public void setE(boolean e) {
		this.e = e;
	}
	public Demo(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Demo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + "]";
	}
	public Demo(int x, int y, double z, boolean e) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.e = e;
	}

	
}
