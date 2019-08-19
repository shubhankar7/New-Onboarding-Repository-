package com.amdocs;

public class SavingsAccount {
	
	public double getBalance() {
		System.out.println("From database");
		return 7000.00;
		
	}
	
	public double withdraw(double amountToBeWithdrawn) throws InsufficientBalanceException{
		
		System.out.println("Inside withdraw");
		
		double currentBalance=getBalance();
		
		if(amountToBeWithdrawn<currentBalance)
			currentBalance = currentBalance-amountToBeWithdrawn;
		else
			throw new InsufficientBalanceException();
		
		updateBalanceIntoDb(currentBalance);
		
		return currentBalance;
	}
	
	public void updateBalanceIntoDb(double currentBalance) {
		
		System.out.println("Balance Update In the database");
	}

}
