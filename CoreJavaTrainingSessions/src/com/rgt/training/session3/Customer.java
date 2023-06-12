package com.rgt.training.session3;

public class Customer {

	private String firstName;
	private String customerID;
	private String custEmail;
	private String lastName;
	private String phoneNumber;

	public Customer(String firstName, String customerID, String custEmail, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.customerID = customerID;
		this.custEmail = custEmail;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getCustEmial() {
		return custEmail;
	}

}
