package com.SpringQ6;

public class Product {
String productName;
double price;
int productId;
public int getProductId() {
	return productId;
}


public Product(String productName, double price, int productId) {
	System.out.println("Product constructor initialized");
	this.productName = productName;
	this.price = price;
	this.productId = productId;
}


public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


}
