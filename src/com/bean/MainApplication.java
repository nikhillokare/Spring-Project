package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
         ApplicationContext a = new ClassPathXmlApplicationContext("Spring.xml");
         //ApplicationContext a = new ClassPathXmlApplicationContext("Innerbean.xml");
		
		//Pojo Object
		/*Triangle t = (Triangle) a.getBean("tri");
		t.display();
		
		Circle c = (Circle) a.getBean("cir");
		c.display();*/
		
		Shape s = (Shape)a.getBean("sh");
		s.display();

	}

}
