package com.core.learn;

import java.util.*;

public class PrintNTo1Rec{
	 public static void printNos(int n)
	    {
		 System.out.print(n + " ");   
		 if(n > 1)
	        {
	            printNos(n - 1);
	        }
	        return;
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int N=sc.nextInt();
	        printNos(N);
	        sc.close();
	    }
}