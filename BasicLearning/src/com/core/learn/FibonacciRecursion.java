package com.core.learn;

import java.util.*;

public class FibonacciRecursion{
	 public static int fibRec(int n){
	        if(n==0){
	        return 0;
	        }
	        if((n==1) || (n==2)){
	        return 1;
	        }
	        return fibRec(n-2) + fibRec(n-1);
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int A=sc.nextInt();
	        int result=fibRec(A);
	        System.out.println(result);
	        sc.close();
	    }
}