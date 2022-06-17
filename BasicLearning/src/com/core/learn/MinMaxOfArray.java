package com.core.learn;

import java.util.*;

public class MinMaxOfArray{
	public static int getMin(int[] A) {
		 int min=0;
		 min=A[0];
	        for(int j=0;j<A.length;j++){
	        	
	            if(A[j]<min){
	                min=A[j];
	            }
	        }
	        return min;
	}
	
	public static int getMax(int[] A) {
		int max=0;
		max=A[0];
		for(int k=0;k<A.length;k++){
        	
            if(A[k]>max){
                max=A[k];
            }
        }
		return max;
	}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int N=sc.nextInt();
	        int[] arr=new int[N];
	        for(int i=0;i<N;i++){
	            arr[i]=sc.nextInt();
	        }
	        
	        System.out.println(getMax(arr)+" "+getMin(arr));
	        sc.close();
	}
}