package com.spring_collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringQ2.xml");

		Question q=(Question) context.getBean("question");
		q.displayInfoList();
		q.displayInfoSet();
		q.displayInfoMap();

	}

}
