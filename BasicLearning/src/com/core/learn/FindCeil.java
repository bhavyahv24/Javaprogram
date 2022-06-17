package com.core.learn;

import java.util.*;
import java.math.*;

public class FindCeil{
	public static int slove(int A) {
		   double ans=(double) (A) /200;
	        int result=(int) (Math.ceil(ans));
	        return result;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		System.out.println(slove(A));
		
	}
}