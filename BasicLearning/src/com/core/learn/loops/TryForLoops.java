package com.core.learn.loops;

import java.util.*;

public class TryForLoops{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println("Case 1: Printing loop from 0 to N-1");
		for(int i=0;i<N;i++) {
			System.out.println("Trying to post increment i++ 1 0 to "+N+": value i --> "+i);
		}
		System.out.println("Printing loop from N-1 to 0");
		for(int i=N-1;i>=0;i--) {
			System.out.println("Trying to post decrement i-- "+N+" to 0 to : value i --> "+i);
		}
		System.out.println("Printing loop from 0 to N-1");
		for(int i=0;i<N;i+=2) {
			System.out.println("Trying to post increment i+2 1 0 to "+N+": value i --> "+i);
		}
		System.out.println("Printing loop from N-1 to 0");
		for(int i=N-1;i>=0;i-=2) {
			System.out.println("Trying to post decrement i-2 "+N+" to 0 to : value i --> "+i);
		}
		System.out.println("Printing loop from 0 to N-1");
		for(int i=0;i<N;i+=3) {
			System.out.println("Trying to post increment i+3 1 0 to "+N+": value i --> "+i);
		}
		System.out.println("Printing loop from N-1 to 0");
		for(int i=N-1;i>=0;i-=3) {
			System.out.println("Trying to post decrement i-3 "+N+" to 0 to : value i --> "+i);
		}
		
		System.out.println("Printing loop from 0 to N-1 pre increment/ pre decrement");
		for(int i=0;i<N;++i) {
			System.out.println("Trying to pre increment ++i 1 0 to "+N+": value i --> "+i);
		}
		System.out.println("Printing loop from N-1 to 0");
		for(int i=N-1;i>=0;--i) {
			System.out.println("Trying to pre decrement --i "+N+" to 0 to : value i --> "+i);
		}
		sc.close();
	}
}