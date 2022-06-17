package com.core.learn;

import java.util.*;

public class IsItPerfect{
	/*static boolean isPerfect(int n)
	{
	    // To store sum of divisors
	    int sum = 1;
	 
	    // Find all divisors and add them
	    for (int i = 2; i * i <= n; i++)
	    {
	        if (n % i==0)
	        {
	            if(i * i != n)
	                sum = sum + i + n / i;
	            else
	                sum = sum + i;
	        }
	    }
	    // If sum of divisors is equal to
	    // n, then n is a perfect number
	    if (sum == n && n != 1)
	        return true;
	 
	    return false;
	}*/
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int N=sc.nextInt();
	        long A=0,sum=0;
	        for(int i=1;i<=N;i++){
	            A = sc.nextLong();
				 sum=0;
				for(int j=1;j<A;j++) {
					if(A%j == 0)
					{
						sum += j;
					}
				}
				if(sum == A)
				{
				System.out.println("YES" );
				}
				else
				{
				System.out.println("NO");
				}
				
			}
	        sc.close();

		}
}