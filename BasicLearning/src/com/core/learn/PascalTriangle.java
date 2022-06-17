/*Write a program to input an integer N from user and print pascal triangle up to N rows.
 * To find kth term of nth row of a pascal triangle we use formula: nCk = (n!) / ((k)! * (n-k)!)
 * Problem Constraints
	* 1 <= T <= 100
	* 1 <= N <= 15
	* sample input 5
	* sample output
	* 1 
	* 1 1 
	* 1 2 1 
	* 1 3 3 1 
	* 1 4 6 4 1
	* =========================
	* Explanation :
	* Row 1 = 1C1 = 1
	* Row 2 = 2C1 2C2 = 1 1
	* Row 3 = 3C1 3C2 3C3 = 1 2 1
	* Row 4 = 4C1 4C2 4C3 4C4 = 1 3 3 1 
	* Row 5 = 5C1 5C2 5C3 5C4 5C5 = 1 4 6 4 1
	* ==============================
	* */

package com.core.learn;

import java.util.*;

public class PascalTriangle{
    public static long facto(long A) {
        if (A == 0)    
            return 1;    
        else    
            return(A * facto(A-1)); 
    }
    public static long ncr(long n,long r) {
      return facto(n) / ( facto(n-r) * facto(r) );
    }
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			long N=sc.nextLong();
			for(long i=0;i<=N;i++) {
				for(long j=0;j<=i;j++) {
					System.out.print(ncr(i,j)+" ");
				}
				System.out.println();
			}
			sc.close();
	}
}