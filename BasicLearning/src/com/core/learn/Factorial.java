package com.core.learn;

import java.util.*;

public class Factorial{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		long result=1;
		if(A==0) {
			result=1;
		}
		for(int i=A;i>=1;i--) {
			result=result*i;
		}
		System.out.println(result);
	}
}