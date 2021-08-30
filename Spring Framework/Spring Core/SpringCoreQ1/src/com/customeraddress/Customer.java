package com.customeraddress;

public class Customer {
	int customerId;
	String customerName;
	long customerContact;
	Address customerAddress;
	
	
/*
	//setting injection
	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public long getCustomerContact() {
		return customerContact;
	}



	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}



	public Address getCustomerAddress() {
		return customerAddress;
	}



	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

*/
	
	//conjunction injection
	Customer(int customerId,String customerName,long customerContact,Address customerAddress){
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerContact=customerContact;
		this.customerAddress=customerAddress;
	}

	void custInfo() {
		System.out.println(customerId+" "+customerName+" "+customerContact);
		System.out.println(customerAddress);
	}
	

}
