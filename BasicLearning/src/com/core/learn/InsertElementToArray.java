		package com.core.learn;

import java.util.*;

public class InsertElementToArray{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N+1];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int temp=0;
		int[] newarr=new int[N+1];
		for(int j=0;j<N+1;j++) {
			 if (j < X - 1)
	                newarr[j] = arr[j];
	            else if (j == X - 1)
	                newarr[j] = Y;
	            else
	                newarr[j] = arr[j - 1];
		}
		for(int m=0;m<N+1;m++) {
		System.out.print(newarr[m]+" ");
		}
		sc.close();
	}
}