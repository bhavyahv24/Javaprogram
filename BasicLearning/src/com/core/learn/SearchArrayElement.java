package com.core.learn;

import java.util.*;

public class SearchArrayElement{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int i=0;i<T;i++) {
			int N=sc.nextInt();
			int[] A=new int[N];
			for(int j=0;j<N;j++) {
				A[j]=sc.nextInt();
			}
			int B=sc.nextInt();
			int flag=0;
			for(int k=0;k<N;k++) {
				if(A[k]==B) {
					flag=0;
					break;
				}
				else {
					flag=1;
				}
				
			}
			if(flag==0) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}
		
		sc.close();
	}
}