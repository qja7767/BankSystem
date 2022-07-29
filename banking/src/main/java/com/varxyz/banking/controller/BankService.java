package com.varxyz.banking.controller;

import java.util.List;

import com.varxyz.banking.domain.Account;
import com.varxyz.banking.domain.Customer;

public interface BankService {
	public void addCustomer(Customer customer);	
	String addAccounts(Account account);
	List<Account> getAccounts(String userId);	
	void transfer(double money, String withdrawAccountNum, String depositAccountNum);
	long getBalance(String accountNum);	
	void saveInterest(double interestRate, String AccountNum);
}
