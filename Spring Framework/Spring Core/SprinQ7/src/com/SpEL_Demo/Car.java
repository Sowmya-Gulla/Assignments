package com.SpEL_Demo;

import org.springframework.beans.factory.annotation.Value;

public class Car {
	@Value("#{2+2}")
	private int model;

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}
	void display() {
		System.out.println(model);
	}





	
	
	


}
