package com.core.learn;

import java.util.*;

public class SumOfDigits{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int T=scanner.nextInt();
		int N,k,rem;
		for(int i=1;i<=T;i++)
		{
			N=scanner.nextInt();
			int sum=0;
			while(N!=0)
			{
				rem=N%10;
				sum=sum+rem;
				N=N/10;
			}

			System.out.println(sum);
		}
		scanner.close();
		
	}
}