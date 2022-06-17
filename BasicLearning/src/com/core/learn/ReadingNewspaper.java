package com.core.learn;

import java.util.*;

public class ReadingNewspaper{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		
		int[] B=new int[7];
		
		for(int i=0;i<7;i++) {
			B[i] =sc.nextInt();
		}
		
		int sum=0,rem=0;
		
		for(int j=0;j<B.length;j++){
            if(B[j]>=A){
                sum= (j+1)%7;
                break;
            }else{
                A-=B[j];
            }
		}
		
		System.out.println(sum);
		//System.out.println(rem);
		
		sc.close();
	}
}