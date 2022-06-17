package com.core.learn;

import java.util.*;

public class FindEvenPosition{
	public static int position(int A) {
        int p=0;
         while (A / 2 != 0) {
        A /= 2;
        p++;
         }
         int result=  (int) Math.pow(2, p);
    return result;
    }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		System.out.println(position(A));
	}
}