package com.core.learn;

import java.util.*;

public class SumOfDigitsRec{
	public static int sumOfDigitsRecu(int A) {
		if(A==0)
			return 0;
		return (A%10+sumOfDigitsRecu(A/10));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		
		int sum=0;
		sum=sumOfDigitsRecu(A);
		System.out.println(sum);
	}
}