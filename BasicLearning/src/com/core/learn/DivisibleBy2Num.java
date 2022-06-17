/*You are given an integer A. You have to tell whether A is divible by both 5 and 11 or not
 * The input contains a single integer A.
 * Print 1 if A is divisible by both 5 and 11, else print 0.
 */
package com.core.learn;

import java.util.*;

public class DivisibleBy2Num{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        if((A%5==0) && (A%11==0)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        } 
        sc.close(); 
	}
}