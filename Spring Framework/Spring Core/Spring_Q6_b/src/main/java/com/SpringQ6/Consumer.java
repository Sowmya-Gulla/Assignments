package com.SpringQ6;

public class Consumer {

	private Product p1;
	
	public Consumer(Product p1) {
		System.out.println("Consumer constructor initialized with product");
		this.p1 = p1;
	}

	public Product getP1() {
		return p1;
	}
   
	public void setP1(Product p1) {
		this.p1 = p1;
	}
	
	void displayItems() {
		System.out.println("Product_ID :" +p1.productId);
		System.out.println("Product_Name :"+p1.productName);
		System.out.println("Product_Price :"+p1.price);	
	}
	
	
	
}
