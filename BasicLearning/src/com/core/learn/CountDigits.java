package com.core.learn;

import java.util.*;

class CountDigits{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int T=scanner.nextInt();
		int N,k,rem,count;
		for(int i=1;i<=T;i++)
		{
			N=scanner.nextInt();
			count=0;
			if(N==0)
			{
				count=1;
			}
			else
			{
			while(N!=0)
			{
				rem=N%10;
				count++;
				N=N/10;
			}
			//System.out.println(count);
			}
			System.out.println(count);
		}
		scanner.close();
		
	}
}