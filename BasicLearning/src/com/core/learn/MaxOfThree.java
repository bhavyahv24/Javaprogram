/*Write a program to input three numbers(A, B & C) from user and print the maximum element among A, B & C in each line.
 * i/p One line containing three space separated integers A, B & C.
 * o/p One line containing an integer as per the question.
 */
package com.core.learn;

import java.util.*;

public class MaxOfThree{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        if((A>=B) && (A>=C)){
            System.out.println(A);
        }
        else if((B>=C) && (B>=A)){
            System.out.println(B);
        }
        else{
            System.out.println(C);
        }
        sc.close();
	}
}