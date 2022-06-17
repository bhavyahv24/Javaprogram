/* Which triangle?
 * Problem Description
 * Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.
 * You have to print if the traingle is "equilateral", "scalene" or "isosceles".
 * 
 * Problem Constraints
 * 1 <= A <= 100000
 * 1 <= B <= 100000
 * 1 <= C <= 100000
 * 
 * Input Format
 * One line containing three space separated integers A, B & C.
 * 
 * Output Format
 * One string either "equilateral", "scalene" or "isosceles".
 * 
 * 
*/
package com.core.learn;
 import java.util.*;
 
 public class WhichTriangle{
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int A=sc.nextInt();
	        int B=sc.nextInt();
	        int C=sc.nextInt();
	        int triangle=(A+B+C);
	        if((A==B) && (A==C) && (B==C)){
	           System.out.println("equilateral"); 
	        }
	        else if((A==B) || (A==C) || (B==C)){
	            System.out.println("isosceles");
	        }
	        else{
	            System.out.println("scalene");
	        }
	        sc.close();
	 }
 }