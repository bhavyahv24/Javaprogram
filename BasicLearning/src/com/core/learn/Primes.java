package com.core.learn;

import java.util.*;

class Primes{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		int count;
		for(int i=1;i<=N;i++) 
		{
			count=0;
			for(int j=1;j<=i;j++) 
			{
				
				if(i%j == 0) {
					count=count+1;
				}
					
			}
			if(count == 2)
				System.out.println(i);
		}
		scanner.close();
	}
}