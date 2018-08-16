package com.cg.bankmvc.controller;

import org.springframework.stereotype.Controller; //packages

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.service.BankService;
import com.bank.service.BankServiceImpl;

@Controller
public class AccountController { // controller class

	BankService service = new BankServiceImpl(); // service object

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/Add") // different cases
	public String Add() {
		return "Add";
	}

	@RequestMapping("/withdraw")
	public String withdraw() {
		return "withdraw";
	}

	@RequestMapping("/successwith")
	public String successwith(@RequestParam("custid") String customerId, @RequestParam("amount") String amount,
			Model model) {
		int bankAccount = (int) service.withdraw(Integer.parseInt(customerId), Integer.parseInt(amount));
		model.addAttribute("BankAccount", bankAccount);
		return "successwith";
	}

	@RequestMapping("/deposit")
	public String deposit() {
		return "deposit";
	}

	@RequestMapping("/successdepo")
	public String successdepo(@RequestParam("custid") String customerId, @RequestParam("amount") String amount,
			Model model) {
		int bankAccount1 = (int) service.withdraw(Integer.parseInt(customerId), Integer.parseInt(amount));
		model.addAttribute("BankAccount1", bankAccount1);
		return "successdepo";
	}

	@RequestMapping("/fund")
	public String fund() {
		return "fund";
	}

	@RequestMapping("/successfund")
	public String successfund(@RequestParam("fromAccNo") String source, @RequestParam("toAccNo") String destination,
			@RequestParam("amount") String amount, Model model) {
		int bankAccount2 = (int) service.fund(Integer.parseInt(source), Integer.parseInt(destination),
				Integer.parseInt(amount));
		model.addAttribute("BankAccount2", bankAccount2);
		return "successfund";
	}

}
