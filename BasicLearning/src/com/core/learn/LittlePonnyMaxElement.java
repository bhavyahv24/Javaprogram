package com.core.learn;

import java.util.*;

public class LittlePonnyMaxElement{
	
	 public static int returnPonnyMaxElement(ArrayList<Integer> A, int B) {
			int count=0;
	        boolean flag=false;
			for(int j=0;j<A.size();j++) {
				if((A.get(j)>B))  {
					count++;	
				}
	            if(A.get(j)==B)
	            flag=true;
			}
	        if(flag==false){
	            return -1;
	        }
	        else
		    return count;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		ArrayList<Integer> A=new ArrayList<Integer>(N);
		for(int i=1;i<=N;i++) {
			A.add(sc.nextInt());
		}
		int B=sc.nextInt();
		
		System.out.println(returnPonnyMaxElement(A,B));
		sc.close();
		
	}
}