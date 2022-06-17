package com.core.learn;

import java.util.*;

public class Test{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int N=sc.nextInt();
	        int[] A=new int[N];

	        for(int i=0;i<N;i++){
	            A[i]=sc.nextInt();
	        }
	        int X=sc.nextInt();
	        int Y=sc.nextInt();
	        int[] B=new int[N+1];
	        for(int j=0;j<B.length;j++){
	            if(j>X){
	            	 B[j+1]=A[j];
	            }
	            else if(j==X){
	                B[j]=Y;
	            }
	            else{
	            	B[j]=A[j];
	            }
	        }
	        for(int k=0;k<B.length;k++){
	            System.out.print(B[k]+" ");
	        }
	        sc.close();
	}
}