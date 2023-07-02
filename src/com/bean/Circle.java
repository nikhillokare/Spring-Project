package com.bean;

public class Circle {
   private Point center;
   private float radius;
public Point getCenter() {
	return center;
}
public void setCenter(Point center) {
	this.center = center;
}
public float getRadius() {
	return radius;
}
public void setRadius(float radius) {
	this.radius = radius;
}
   
   public void display()
   {
	   System.out.println("********Circle Details*****");
	   System.out.println("Cicle center::X==>" +getCenter().getX()+",Y==>"+getCenter().getY());
	   System.out.println("Circle Radius::"+getRadius());
	   System.out.println("Area is::"+(3.14*getRadius()*getRadius()));
   }
}
