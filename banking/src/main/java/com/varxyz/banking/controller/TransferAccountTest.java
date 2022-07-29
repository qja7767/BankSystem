package com.varxyz.banking.controller;

public class TransferAccountTest {
	
	public static void main(String[] args) {
		
			TransferAccount test = new TransferAccount();
			double balance = 1000.0;
			String toAccount = "110-11-1111";
			String fromAccount = "112-22-2222";
			test.transfer(balance, toAccount, fromAccount);			
		
			
		
		
	}
}
