package com.customeraddress;

public class Address {
	String street,city,state,country;
	int zip;
	
	//Uses setting Injection
	/*
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	*/
	
	//Constructor Injection
	Address(String street,String city,String state,int zip,String country){
		this.street=street;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.country=country;
	}
	
	
	public String toString() {
		return street+" "+city+" "+state+" "+zip+" "+country;
	}
	
	

}
