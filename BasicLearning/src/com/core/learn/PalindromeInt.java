package com.core.learn;

import java.util.*;

public class PalindromeInt{
	 public static void main(String[] args) {
	         Scanner scanner=new Scanner(System.in);

		            long A=scanner.nextLong();
		            long rem=0,rev=0,temp=0;
		            temp=A;
		            while(A!=0){
		                rem=A%10;
		                rev=(rev*10)+rem;
		                A=A/10;
		            }
	            if(rev==temp){
	                 System.out.println("Yes");
	            }
	            else{
	                 System.out.println("No");
	            }
		        scanner.close();
	    }
}