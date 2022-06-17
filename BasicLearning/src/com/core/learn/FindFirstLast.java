package com.core.learn;

import java.util.*;

public class FindFirstLast{
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	        int first=0,last=0;
	        for(int i=1;i<=T;i++){
	            int N=sc.nextInt();
	            int temp=N;
	           while(temp!=0){
	                first=temp%10;
	                temp=temp/10;
	            }
	                last=N%10;

	            System.out.print(first+" last "+last);
	            System.out.println();
	        }
	            
	        sc.close();
	    }
}