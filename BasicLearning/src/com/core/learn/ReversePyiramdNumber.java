package com.core.learn;

import java.util.*;

public class ReversePyiramdNumber{
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
	        long N=scanner.nextLong();
	        for(int i=1;i<=N;i++){
	            for(int j=1;j<=N+1-i;j++){
	                if(j<N-i+1){
	                     System.out.print(j+" ");
	                }
	                else{
	                    System.out.print(j);
	                }
	            }
	            System.out.println();
	        }
	        scanner.close();
	}
}