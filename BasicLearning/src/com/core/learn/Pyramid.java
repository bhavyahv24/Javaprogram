package com.core.learn;

import java.util.*;

class Pyramid{
	  public static void main(String[] args) {
		  Scanner scanner=new Scanner(System.in);
	        int N=scanner.nextInt();
	        
	        for(int i=0;i<N;i++){
	            for(int j=N-i;j>1;j--){
	                System.out.print(" ");
	            }
	        
	            for(int k=0;k<=i;k++){
	               System.out.print("* ");
	            }
	            
	             System.out.println();
	        }
	        scanner.close();
		  }
}