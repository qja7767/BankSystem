package com.varxyz.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.varxyz.banking.dao.AccountDao;
import com.varxyz.banking.dao.CustomerDao;
import com.varxyz.banking.domain.Account;
import com.varxyz.banking.domain.Customer;
import com.varxyz.banking.service.AccountService;

public class TransferAccount implements BankService {
	@Autowired
	AccountDao accountDao;	
	CustomerDao customerDao;
	
	@Transactional
	@Override
	public void transfer(double amount, String fromAccountNum, String toAccountNum) {
		accountDao.Transfer(amount, fromAccountNum, toAccountNum);
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}
	
	@Override
	public String addAccounts(Account account) {
		return accountDao.addAccount(account);		
	}

	@Override
	public List<Account> getAccounts(String userId) {
		return accountDao.getAccounts(userId);
	}

	@Override
	public long getBalance(String accountNum) {
		return accountDao.getBalance(accountNum);							
	}

	@Override
	public void saveInterest(double interestRate, String AccountNum) {
		accountDao.saveInterest(interestRate, AccountNum);
	}
}
