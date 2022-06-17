package com.core.learn;

import java.util.*;

public class LittlePonnyandMobilePhones{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		int Q=sc.nextInt();
		int[] B=new int[Q];
		for(int j=0;j<Q;j++) {
			B[j]=sc.nextInt();
		}
		int sum=0;

		//support industry mindtree, accenture 
		//trick in and round approach
		sum=A[0];
		int k=0;
		int[] res=new int[Q];
		for(int i=0;i<Q;i++) {
			for(int j=1;j<N-1;i++) {
				sum+=A[j];
				if(B[i]<=sum) {
					res[k]=j;
					k++;
				}
					
			}
		}
		for(int l=0;l<Q;l++) {
		System.out.println(res[l]);
		}
		
	}
}