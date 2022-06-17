package com.core.learn;

import java.util.*;

public class Bank{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Initially bank balance ");
        long N=sc.nextLong();
        long total_amt=N;
        int M=sc.nextInt();
        do{
            int type=sc.nextInt();
            long X=sc.nextLong();
            
           switch(type){
            case 1: total_amt= total_amt+X;
                    System.out.println(total_amt);
                    break;
            case 2: if(total_amt>X){
                    total_amt=total_amt-X;
                    System.out.println(total_amt);
                    }
                    else{
                        
                        System.out.println("Insufficient Funds");
                    }
                    break;
            default:
            System.out.println(total_amt);
            }
            M--;
        }
        while(M!=0);
        sc.close();
    }
}