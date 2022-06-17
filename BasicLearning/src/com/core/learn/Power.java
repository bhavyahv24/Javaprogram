package com.core.learn;

import java.util.*;

public class Power{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        long result=1;

        while (M != 0) {
            result *= N;
            --M;
        }

        System.out.println(result);
        sc.close();
    }
}