package com.core.learn;

import java.util.*;

public class HalfDiamondPattern{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		 int i, j;
		  

		    for (i = 0; i < N; i++)
		    {
		        for (j = 0; j < i + 1; j++)
		             System.out.print("*");
		        System.out.print("\n");
		    }
		  
		    for (i = 1; i < N; i++) 
		    {
		        for (j = i; j < N; j++)
		             System.out.print("*");
		        System.out.print("\n");
		    }
		    sc.close();
	}
}