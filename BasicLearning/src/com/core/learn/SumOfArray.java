package com.core.learn;

import java.util.*;

public class SumOfArray{
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int N=sc.nextInt();
	        int[] A=new int[N];
	        int sum=0;
	        for(int i=0;i<N;i++){
	                A[i]=sc.nextInt();
	                sum=sum+A[i];
	        }
	        System.out.println(sum);
	        sc.close();
	    }
}