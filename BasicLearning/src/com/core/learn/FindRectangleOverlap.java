package com.core.learn;

import java.util.*;

public class FindRectangleOverlap{
	
	  public static int rectangleOverlap(int A, int B, int C, int D, int E, int F, int G, int H) {
	       if((B>=H) || (E>=C) || (A>=G) || (F>=D)){
	           return 0;
	       }
	        return 1;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A, B, C, D, E, F, G, H;
		System.out.print("A: ");
		A=sc.nextInt();
		System.out.print("B: ");
		B=sc.nextInt();
		System.out.print("C: ");
		C=sc.nextInt();
		System.out.print("D: ");
		D=sc.nextInt();
		System.out.print("E: ");
		E=sc.nextInt();
		System.out.print("F: ");
		F=sc.nextInt();
		System.out.print("G: ");
		G=sc.nextInt();
		System.out.print("H: ");
		H=sc.nextInt();
		int res=rectangleOverlap(A,B,C,D,E,F,G,H);
		if(res==1) {
			System.out.println("Rectangle Overlapping");
		}
		else {
			System.out.println("Rectangle Not Overlapping");
		}
	}
}