package com.core.learn;

import java.util.*;

public class PositiveNegative{
	 public static void main(String[] args) {
	        Scanner scanner=new Scanner(System.in);
	        int A=scanner.nextInt();
	        if(A>0)
	        {
	            System.out.println("1");
	        }
	        else if(A<0)
	        {
	            System.out.println("-1");
	        }
	        else
	        System.out.println("0");
	        scanner.close();
	        
	    }
}