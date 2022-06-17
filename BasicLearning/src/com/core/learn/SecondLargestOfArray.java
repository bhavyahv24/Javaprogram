/**Second Largest
 * You are given an integer T (Number of test cases). For each test case, You are given an integer array A.
 *  You have to find the second largest element/value in the array or report that no such element exists./
 */
package com.core.learn;

import java.util.*;

public class SecondLargestOfArray{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			int T=sc.nextInt();
			for(int i=0;i<T;i++) {
				int N=sc.nextInt();
				long[] A=new long[N];
				for(int m=0;m<N;m++) {
					A[m]=sc.nextLong();
				}
				long max=Integer.MIN_VALUE;
				long secmax=Integer.MIN_VALUE;
	            int n;
				for(n=0;n<N;n++) {
					if(A[n]>=max) {
						secmax=max;
	                    max=A[n];
					}
	                else if(A[n]>=secmax){
	                    secmax=A[n];
	                }
	                
				}
					if(N<=1)
	                System.out.println("-1");
	                else
	                System.out.println(secmax);
			}
			sc.close();
	}
}