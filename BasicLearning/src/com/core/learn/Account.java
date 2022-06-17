package com.core.learn;

import java.lang.*;
import java.io.*;


class Account {
	/*double balance;

	public static void main(String[] args) {
		Account account1=null; //Line1
		Account account2=null; //Line2
		account1 = new Account(); // Line 3
		account2 = new Account(); //Line 4
		account2 = account1; //Line 5
		account1 = new Account(); // Line 6
        System.out.println(account1.balance);*/
	
	int phone=312345;
	double getPhone(){
		System.out.print("phone number received");
		return phone;
	}
	public static void main(String[] args) {
		Account bank=new Account();
		System.out.print(bank.getPhone());
		
	
                         
	}
} 
/*class Account
{
	private double balance=500.00;
	public double getBalance(int accountId) {
		return balance;
	}
	public static void main(String[] args) {
		Account accnt= new Account();
		double value= accnt.getBalance(123456);
		
		PrintStream console= System.out;	
		System.setOut(console);
		System.out.print("The balance is : "+value);
	}
}*/