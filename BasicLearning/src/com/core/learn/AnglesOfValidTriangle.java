/*
 * You are given 3 integer angles(in degrees) A, B and C of a triangle. 
 * You have to tell whether the triangle is valid or not.
 * A triangle is valid if sum of its angles equals to 180.
 * 
 * Problem Constraints
 * 1 <= A, B, C <= 180
 * 
 * Input Format
 * First line of the input contains an integer A.
 * Second line of the input contains an integer B.
 * Third line of the input contains an integer C.
 * 
 * Output Format
 * Print 1 if the triangle having given sides is valid, else print 0.
 * 
 * Input 1:
 * 60 60 60
 * 
 * Output 1:
 * 1
 * Explanation 1
 *  Sum of angles = A + B + C = 60 + 60 + 60 = 180
 *  Hence, the given triangle is valid.
 */

package com.core.learn;
import java.util.*;

public class AnglesOfValidTriangle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int anequals=A+B+C;
        if(anequals==180){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        sc.close();
	}
}