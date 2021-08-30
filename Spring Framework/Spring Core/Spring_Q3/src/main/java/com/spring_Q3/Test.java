package com.spring_Q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("springQ3.xml");
		BankAccController controller= (BankAccController) context.getBean("controller");
		System.out.println(controller.getBalance(123));
		System.out.println(controller.withdraw(222, 60000));
		System.out.println(controller.deposit(222, 20000));
		System.out.println(controller.fundTransfer(123, 333, 2000));
		System.out.println(controller.getBalance(123));
		
	}
}