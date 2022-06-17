package com.core.learn;

import java.util.*;

public class ReversePyramidNumber{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N+1-i;j++){

                     System.out.print(j+" ");
            }
            System.out.println();
        }
        scanner.close();
	}
}