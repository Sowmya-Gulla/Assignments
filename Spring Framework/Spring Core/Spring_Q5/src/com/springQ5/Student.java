package com.springQ5;

import org.springframework.beans.factory.annotation.Required;

public class Student {
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
	@Required
	public void setName(String name) {
		this.name = name;
	}
	void display() {
		System.out.println("Id:"+id+" "+"Name:"+name);
	}

	
}
