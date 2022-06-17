/* Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M. */

package com.core.learn;

import java.util.*;

public class ABandModulo{
	public static int abModulo(int A, int B) {
	        if(A>B){
	        return A-B;
	    }
	        return B-A;
	    }

	public static void main(String[] args) {
		
	}
}