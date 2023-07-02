package com.bean;

public class Shape {
	
	private Circle c;
	private Triangle t;
	public Circle getC() {
		return c;
	}
	public void setC(Circle c) {
		this.c = c;
	}
	public Triangle getT() {
		return t;
	}
	public void setT(Triangle t) {
		this.t = t;
	}
	
	public void display()
	{
		getC().display();//circle call method
		getT().display();//triangle call method
	}

}
