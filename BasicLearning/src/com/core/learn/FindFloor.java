package com.core.learn;

import java.util.*;
import java.math.*;

public class FindFloor{
	public static int slove(int A) {
		   double ans=(double) (A) /200;
		   System.out.println("ans"+ans);
	        int result=(int) (Math.floor(ans));
	        return result;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		System.out.println(slove(A));
		
	}
}