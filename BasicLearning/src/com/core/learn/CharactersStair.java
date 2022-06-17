package com.core.learn;

import java.util.*;

public class CharactersStair{
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
        int alphabet = 65;
                for (int i = 1; i<= N; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((char) alphabet + " ");
            }
            alphabet++;
            System.out.println();
        }
        sc.close();
    }
}