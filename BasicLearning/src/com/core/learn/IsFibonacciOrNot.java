package com.core.learn;

import java.util.*;

public class IsFibonacciOrNot{
	public static int checkfibonacci(long n)
    {
        int a = 0;
        int b = 1;
        if (n==a || n==b) return 0;
        int c = a+b;
        while(c<=n)
        {
            if(c == n) return 0;
            a = b;
            b = c;
            c = a + b;
        }
        return 1;
    }
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++){
			long N=sc.nextLong();
			int res=checkfibonacci(N);
			if(res==0){
				System.out.println("Yes");
			}
			else{
            System.out.println("No");
			}
		}
		sc.close();
	}
}