package com.customeraddress;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		Customer cust=(Customer) context.getBean("obj");
		cust.custInfo();

	}

}
