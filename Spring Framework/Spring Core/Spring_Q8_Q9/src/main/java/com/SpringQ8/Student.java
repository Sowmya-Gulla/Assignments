package com.SpringQ8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void display() {
		System.out.println("Id:"+id+" "+"Name:"+name);
	}
	
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Beans init method called for a class");
	}
	
	public void destroy() throws Exception {
		System.out.println("Destroying Beans destroy method called for a class");
		
		
	}
	

	@PostConstruct
	void init() {
		System.out.println("Init method");
		
	}
	@PreDestroy
	void cleanup() {
		System.out.println("Clean Up method");
	}

	
	
}
