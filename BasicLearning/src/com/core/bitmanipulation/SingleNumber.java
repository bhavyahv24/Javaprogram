package com.core.bitmanipulation;

import java.util.*;

public class SingleNumber{
	public int singleNumber(final List<Integer> A) {
        HashSet<Integer> set=new HashSet<Integer>();
       for(int i:A){
           if(!set.add(i)) 
               set.remove(i);
       }
       Iterator<Integer> it = set.iterator();
       return it.next();
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		int N=sc.nextInt();
		ArrayList<Integer> A=new ArrayList<Integer>();
		//change
	}
}