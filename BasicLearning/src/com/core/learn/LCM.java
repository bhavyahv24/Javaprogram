package com.core.learn;

import java.lang.*;
import java.util.*;

public class LCM {
	
	/* public static int gcd(int A, int B) {
			if(B == 0) return A;
			return gcd(B, A % B);
		}
	    public int LCM(int A, int B) {
	        return (A / gcd(A, B)) * B;
	    }*/
	
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
    	 Scanner sc=new Scanner(System.in);
         int T=sc.nextInt();
         int hcf=0,temp1,temp2,temp,lcm=0;
         for(int i=1;i<=T;i++){
            int A=sc.nextInt();
            int B=sc.nextInt();
            
           temp1 = A;
           temp2 = B;

        while(temp2 != 0){
         temp = temp2;
         temp2 = temp1%temp2;
         temp1 = temp;
        }

        hcf = temp1;
        System.out.println(hcf);
     
            lcm=(A*B)/hcf;
            System.out.println(lcm);
         }
        sc.close();
    }
}