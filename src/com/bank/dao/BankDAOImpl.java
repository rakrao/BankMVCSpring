package com.bank.dao;

import com.bank.pojo.*; //packages

import java.util.ArrayList;
import java.util.List;

import com.bank.pojo.Customer;

public class BankDAOImpl implements BankDAO {

	static Customer customer = new Customer(); // object

	Customer customer1 = new Customer(123, "Rao", 456545, "rsa@hd.com", "Indian", "male", 12000);
	Customer customer2 = new Customer(124, "Rakesh", 452243, "ssa@hd.com", "Indian", "male", 15000); // passing values
	Customer customer3 = new Customer(125, "Ramesh", 455643, "asa@hd.com", "Indian", "male", 30000);
	Customer customer4 = new Customer(126, "Rakshith", 346543, "vsa@hd.com", "Indian", "male", 20000);

	List<Customer> list = new ArrayList<>(); // declaring list

	public Customer searchById(int id) { // search function
		list = viewAll();
		Customer c = new Customer();
		for (Customer customer : list) {
			if (customer.getCustomerId() == id) {
				c = customer;
			}
		}
		return c;
	}

	@Override
	public long withdraw(int id, int amount) { // withdraw function
		viewAll();
		Customer c = searchById(id);
		c.setCurrentBalance(c.getCurrentBalance() - amount);
		System.out.println(c.getCurrentBalance());
		return (long) c.getCurrentBalance();
	}

	@Override
	public long deposit(int id1, int amount) { // deposit function
		viewAll();
		Customer c = searchById(id1);
		c.setCurrentBalance(c.getCurrentBalance() + amount);
		System.out.println(c.getCurrentBalance());
		return (long) c.getCurrentBalance();
	}

	public List<Customer> viewAll() { // view all function
		list.add(customer1);
		list.add(customer2);
		list.add(customer3);
		list.add(customer4);
		return list;
	}

	public long fund(int id2, int id3, int amount) { // fund function
		Customer c = searchById(id2);
		c.setCurrentBalance(c.getCurrentBalance() - amount);
		Customer c1 = searchById(id3);
		c.setCurrentBalance(c1.getCurrentBalance() + amount);
		return (long) c1.getCurrentBalance();
	}

}
