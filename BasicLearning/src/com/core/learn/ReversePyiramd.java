package com.core.learn;

import java.util.*;

public class ReversePyiramd{
	  public static void main(String[] args) {
		  Scanner scanner=new Scanner(System.in);
	        int N=scanner.nextInt();
	        
	        for(int i=N;i>=1;--i){
	        	for(int k=1;k<=N-i;++k) {
	        		System.out.print(" ");
	        	}
	           for(int j=i;j>=1;--j) {
	                       System.out.print("* ");
	         
	        }
	           System.out.println();
	        }
	        scanner.close();
		  }
}