package com.core.learn;

import java.util.*;
import java.util.Arrays;
//import java.util.Collections;

public class KthSmallestElement{
	public static int kthsmallest(final int[] A, int B) {
        Arrays.sort(A);
        return A[B - 1];
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] A=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		int B=sc.nextInt();
		int res=kthsmallest(A,B);
		System.out.println(res);
		sc.close();
	}
}