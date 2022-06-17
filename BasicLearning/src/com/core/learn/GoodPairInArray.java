/* Good Pair
 * Problem Description
 * Given an array A and a integer B. A pair(i,j) in the array is a good pair if i!=j and (A[i]+A[j]==B). 
 * Check if any good pair exist or not.
 * Problem Constraints
 * 1 <= A.size() <= 104
 * 1 <= A[i] <= 109
 * 1 <= B <= 109
 * 
 * Input Format
 * First argument is an integer array A.
 * Second argument is an integer B.
 * 
 * Output Format
 * Return 1 if good pair exist otherwise return 0.
 * 
 * 
*/
package com.core.learn;

import java.util.*;

public class GoodPairInArray{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		long[] A=new long[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextLong();
		}
		long B=sc.nextLong();
		int flag=0;
		for(int i=0;i<N-1;i++) {
			for(int j=i+1;j<N;j++)
			if((A[i]+A[j]) == B) {
				System.out.println(A[i]+A[j]);
				flag=1;
				System.out.println(flag);
				break;
			}
		}
		if(flag==1) {
			System.out.print("1");
		}
		else {
			System.out.print("0");
		}
		sc.close();
	}
}