package com.core.learn;

import java.util.*;

public class MinimumPicks{
	/* public int solve(ArrayList<Integer> A) {
	        int max,min;
	        max=Integer.MIN_VALUE;
	        min=Integer.MAX_VALUE;
	        int n=A.size();
	        for(int i=0;i<n;i++){
	            if(A.get(i)%2==0){
	                if(A.get(i)> max)
	                { 
	                    max=A.get(i);
	                }
	            }
	            else{
	                if(A.get(i)<=min)
	                {
	                    min=A.get(i);
	                }
	            }
	            
	        }
	        return (max-min);
	    }*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=sc.nextInt();
		}
		 int max,min;
		 max=Integer.MIN_VALUE; // initializing with some constant value
	     min=Integer.MAX_VALUE;
	    // System.out.println("Integer.MIN_VALUE"+max);
	   //  System.out.println("Integer.MAX_VALUE"+min);
	        for(int i=0;i<A.length;i++){
	        	if((A[i]%2)==0) {     	        	        		
	        		if(A[i]>=max)
	        		{ 
	        			max=A[i];
	        		}
	        	}
	            else
	            {
	            	if(A[i]<=min) {		
	            		min=A[i];	
	            	}
	            }
	            
	        }

	        int sum=max-min;
	       // System.out.println("Max" +max);
	      //  System.out.println("Min" +min);
	        System.out.println("Sum" +sum);
	   sc.close();
	}
}