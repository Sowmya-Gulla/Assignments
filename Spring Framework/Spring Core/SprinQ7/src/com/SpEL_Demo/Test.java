package com.SpEL_Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Operations c= (Operations) context.getBean("operations");
		System.out.print(c);
	

	}

}
