package com.core.learn;

import java.util.*;

class Reverse{
	 public static void main(String[] args) {

	        Scanner scanner=new Scanner(System.in);
	        int T=scanner.nextInt();
	        for(int i=1;i<=T;i++){
	            int N=scanner.nextInt();
	            int rem=0,rev=0;
	            while(N!=0){
	                rem=N%10;
	                rev=(rev*10)+rem;
	                N=N/10;
	            }
	            System.out.println(rev);
	        }
	        scanner.close();
	 }
}