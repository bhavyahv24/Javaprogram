package com.core.learn;

import java.lang.*;
import java.util.*;
import java.math.*;
public class BinaryToDecimal {
    public static void main(String[] args) {
        
    	 Scanner scanner=new Scanner(System.in);
         long A=scanner.nextLong();
         long rem=0;
         int base=1;
         long dec=0;
         long temp=A;
         while(temp>0){
             rem = temp % 10;
             temp = temp/10;
             dec += rem * base;
  
             base = base * 2;
         }
         System.out.println(dec);
         scanner.close();
    }
}