package com.bank.service;

import java.util.List; //packages

import com.bank.dao.*;
import com.bank.pojo.Customer;

public class BankServiceImpl implements BankService {

	BankDAO dao = new BankDAOImpl(); // dao object

	@Override
	public long withdraw(int id, int amount) {
		return dao.withdraw(id, amount);
	}

	@Override
	public long deposit(int id, int amount) { // implementing methods
		return dao.deposit(id, amount);
	}

	@Override
	public List<Customer> viewAll() {
		// TODO Auto-generated method stub
		return dao.viewAll();
	}

	@Override
	public long fund(int id2, int id3, int amount) {
		// TODO Auto-generated method stub
		return dao.fund(id2, id3, amount);
	}
}
