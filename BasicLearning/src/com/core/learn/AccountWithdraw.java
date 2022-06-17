package com.core.learn;

import java.lang.*;

public class AccountWithdraw{
	
	public static void main(String args[]) {
		/*double balance=600;
		System.out.println("Amount to Withdraw is 1500");
		double amount=1500;
		if((amount < 0) || (amount >= balance))
			System.out.println("Withdraw has failed.");
		else
			System.out.println("Withdraw is successfull. Amount 1500 withdraw is successfull");*/
		
		/*double balance=2000;
		System.out.println("Amount to Withdraw is 500");
		double amount=500;
		if((amount<=0)||((balance-amount) > balance))
			System.out.println("Withdraw has failed");
		else
			System.out.println("Withdraw is successfull. Amout 500 withdraw is successfull");*/
		
		
			    double balance = 2000;
			    System.out.println("Amount to withdraw");
			    double amount = 500, limit = 10000, minbal = 500;
			    if(amount <= limit && (balance - amount) > minbal) {
			      balance -= amount;
			      System.out.println("Withdrawal has succeeded");
			    }
		
			
			
	}
}