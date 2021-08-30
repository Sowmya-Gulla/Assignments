package com.SpringQ8;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("springQ5.xml");
		context.registerShutdownHook();
		Student s=(Student) context.getBean("student");
		s.display();

	}

}
