package com.core.learn;

import java.util.*;

public class ElectricityBill{
		
	public static int calculate(int A) {
		double total=0, surcharge=0;
		int bill=0;
		if(A <= 50)
		{
			total = (A * 0.50);
			surcharge=((total) + (0.20 * total));
		}
		else if((A >= 51) && (A <= 150))
		{
			total = ((50 * 0.50) + ((A - 50) * 0.75) );
			surcharge = ((total) + (0.20 * total));
		}
		else if((A >= 151) && (A <= 250))
		{
			total=((50 * 0.50) + (100 * 0.75) + ((A - 150) * 1.20));
			surcharge = ((total) + (0.20 * total));
		}
		else
		{
			total = ((50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((A - 250) * 1.50));
			surcharge = ((total) + (0.20 * total) );
		}
		bill = (int)(Math.floor(surcharge));
		return bill;
	}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int A=scanner.nextInt();
		
		int bill = calculate(A);
		
		System.out.println(bill);
		scanner.close();
		
	}
}