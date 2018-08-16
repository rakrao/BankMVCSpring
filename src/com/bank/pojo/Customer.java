package com.bank.pojo;



public class Customer {
	private int customerId;
	private String customerName;
	private long contactNumber;
	private String emailId;
	private String nationality;
	private String gender;
	private double currentBalance;
	public Customer(int customerId, String customerName, long contactNumber, String emailId, String nationality,
			String gender, long currentBalance) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
		this.nationality = nationality;
		this.gender = gender;
		this.currentBalance = currentBalance;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
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
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(double res) {
		this.currentBalance = res;
	}
	

	
	}
