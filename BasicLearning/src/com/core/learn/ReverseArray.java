package com.core.learn;

import java.util.*;

public class ReverseArray{
	 public static void main(String[] args) {

	        Scanner sc=new Scanner(System.in);
	        int N=sc.nextInt();
	        int[] A=new int[N];
	        for(int i=0;i<N;i++){
	            A[i]=sc.nextInt();
	        }
	        for(int j=N-1;j>=0;--j){
	            System.out.print(A[j]+" ");
	        }
	        sc.close();
	    }
}