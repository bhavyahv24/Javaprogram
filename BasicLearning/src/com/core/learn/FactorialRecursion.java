package com.core.learn;

import java.util.*;

public class FactorialRecursion{
	 public static int facto(int A) {
		 if (A >= 1)
	            return A * facto(A - 1);
	        else
	            return 1;
	    }
	
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int A=sc.nextInt();
		 long result=facto(A);
		 System.out.println(result);
		 sc.close();
	 }
}