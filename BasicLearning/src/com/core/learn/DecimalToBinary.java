package com.core.learn;
 import java.util.*;
 
 public class DecimalToBinary{
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	        
	        for(int i=1;i<=T;i++){
	            String binary="";
	            int A=0;
	            A=sc.nextInt();
	            int temp=0;
			 while(A > 0) {
				 temp=A%2;
				 binary= temp+binary;
				 A=A/2;	
			 }
	            System.out.println(binary);
	        }
	        sc.close();
		 //79438016
		/*  int binary=0;
        int i=1;
        while(A > 0)
        {
            int temp = A % 2;
            binary += temp * i;
            A = A / 2;
            i*=10;
        }*/
		 
		// System.out.println("The binary equivalent of Decimal "+A+ " is "+binary);
		// sc.close();
		 
	 }
 }