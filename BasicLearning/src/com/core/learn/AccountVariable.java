package com.core.learn;

import java.lang.*;



public class AccountVariable {
	  private double balance = 500.00;  // instance variable
	  static int minimumBalance = 200;  // static variable
	  public double getBalance(int accountId) {
	    int withdrawal = 500;           // local variable
	    return balance - withdrawal;
	  }
	  public static void main(String[] args) {
		  AccountVariable accnt = new AccountVariable();
	    double value = accnt.getBalance(123456);
	    System.out.println(accnt.balance); //object.staticvariable
	    System.out.println("The balance is " + value);
	  }
	}
