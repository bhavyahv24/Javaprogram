package com.core.learn;

import java.lang.*;
import java.util.*;

public class PrintPyiramd {

  public static void main(String[] args) {
	  Scanner scanner=new Scanner(System.in);
      int N=scanner.nextInt();
      int count=0,k=0,count1=0;
      for (int i = 1; i <= N; ++i) {
          for (int j = 1; j <= N - i; ++j) {
            System.out.print("0 ");
            ++count;
          }

          while (k != 2 * i - 1) {
            if (count <= N - 1) {
              System.out.print((i + k) + " ");
              ++count;
            } else {
              ++count1;
              System.out.print((i + k - 2 * count1) + " ");
            }

            ++k;
            
          }
          count1 = count = k = 0;
          for (int l = 1; l <= N - i; ++l) {
              System.out.print("0 ");

            }
          System.out.println();
        }
      
          scanner.close();
  }
}