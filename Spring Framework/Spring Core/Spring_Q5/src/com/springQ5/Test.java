package com.springQ5;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springQ5.xml");
		
		Student s=(Student) context.getBean("student");
		s.display();

	}

}