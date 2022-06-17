package com.core.learn;

import java.util.*;

public class SquareRootOfInteger{
	/*public int sqrt(int A) {
        if (A == 0 || A == 1)
    return A;
    long i = 1, result = 1;
    while (result <= A)
    {
      i++;
      result = i * i;
    }
    return (int)(i - 1);
}*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		if (A == 0 || A == 1)
		    System.out.println("Sqrt of "+ A +" is "+A);
		    long i = 1, result = 1;
		    while (result <= A)
		    {
		      i++;
		      result = i * i;
		      System.out.println("Result "+ result);
		    }
		    System.out.println("Sqrt of "+ A +" is "+(i - 1));
		    sc.close();
	}
}