package com.core.learn;

import java.util.*;

class PrimeNumber{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int A=scanner.nextInt();
		boolean flag = false;
	    for (int i = 2; i <= A / 2; ++i) {
	      // condition for nonprime number
	      if (A % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(A + " is a prime number.");
	    else
	      System.out.println(A + " is not a prime number.");
	    scanner.close();
		
	}
	
}