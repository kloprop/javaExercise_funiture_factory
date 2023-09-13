package com.javahongkong.bootcamp.exercise;

public class Transaction {
	private Long accountNumber;
	private Bank bank;

	/**
	 *
	 * @param bank
	 *                      The bank where the account is housed.
	 * @param accountNumber
	 *                      The customer's account number.
	 * @param attemptedPin
	 *                      The PIN entered by the customer.
	 * @throws Exception
	 *                   Account validation failed.
	 */
	public Transaction(Bank bank, Long accountNumber, int attemptedPin) throws Exception {
		// complete the function
		this.bank = bank;
		this.accountNumber = accountNumber;
		if (this.bank.getAccount(accountNumber).validatePin(attemptedPin) == false){
			throw new Exception();
		}
		
	}

	public double getBalance() {
		// complete the function
		return this.bank.getBalance(this.accountNumber);
	}

	public void credit(double amount) {
		this.bank.getAccount(accountNumber).creditAccount(amount);
		// complete the function
	}

	public boolean debit(double amount) {
		
		return this.bank.getAccount(accountNumber).debitAccount(amount);
		// complete the function
	}
}
