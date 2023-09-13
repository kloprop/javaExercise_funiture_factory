package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank {
	private LinkedHashMap<Long, Account> accounts; // object reference

	public Bank() {
		accounts = new LinkedHashMap<>();
		// complete the function
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		return this.accounts.getOrDefault(accountNumber, null);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		Long accNum = (long) this.accounts.size() +1 ;
		Account account = new CommercialAccount(company,accNum, pin,startingDeposit);
		accounts.put(accNum, account);
		return accNum;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		Long accNum = (long) this.accounts.size() +1;
		Account account = new ConsumerAccount(person, accNum, pin, startingDeposit);
		accounts.put(accNum, account);
		return accNum;
		// complete the function

	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		return true;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		
		return accounts.get(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		if (this.accounts.containsKey(accountNumber)){
			Account acc = this.accounts.get(accountNumber);
			acc.creditAccount(amount);
			this.accounts.put(accountNumber, acc);
		}
		// complete the function
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		if (this.accounts.containsKey(accountNumber)){
			return this.accounts.get(accountNumber).debitAccount(amount);
		}else{
			return false;
		}
		
	}
}
