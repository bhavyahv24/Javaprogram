package com.core.learn;

import java.util.*;

public class RemoveElementFromArray{
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
	        int N=sc.nextInt();
	        int[] arr=new int[N];
	        for(int i=0;i<N;i++){
	            arr[i]=sc.nextInt();
	        }
	        int X=sc.nextInt();
	        for(int j=0;j<N;j++){
	            if(j==X){
	            	for(int k=X-1;k<N-1;k++) {
	            		arr[k]=arr[k+1];
	            	}
	            }
	        }
	        for(int l=0;l<N-1;l++) {
	        	System.out.print(arr[l]+" ");
	        }
	        sc.close();
	}
}