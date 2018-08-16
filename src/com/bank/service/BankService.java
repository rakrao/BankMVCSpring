package com.bank.service;

import java.util.List; //packages

import com.bank.pojo.Customer;

public interface BankService { // interface

	public long withdraw(int id, int amount);

	public long deposit(int id, int amount);

	public long fund(int id2, int id3, int amount); // methods

	public List<Customer> viewAll();
}
