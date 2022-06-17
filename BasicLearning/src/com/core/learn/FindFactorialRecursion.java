package com.core.learn;

import java.util.*;

public class FindFactorialRecursion{
	 public static int facto(int A) {
	        if (A == 0)    
	            return 1;    
	        else    
	            return(A * facto(A-1)); 
	    }
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int A=sc.nextInt();
		 long result=facto(A);
		 System.out.println(result);
		 sc.close();
	 }
}
