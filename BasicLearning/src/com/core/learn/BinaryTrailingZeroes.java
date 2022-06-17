package com.core.learn;

import java.util.*;

public class BinaryTrailingZeroes{
	public static int trailingZeroes(int A) {
		String bit = Integer.toBinaryString(A);
        StringBuilder bit1 = new StringBuilder();
        bit1.append(bit);
        bit1=bit1.reverse();
        int zero = 0;
      
        for (int i = 0; i < 64; i++) {
            if (bit1.charAt(i) == '0')
                zero++;
            // if '1' comes then break
            else
                break;
        }
      
        return zero;
	        /*long binary=0;
        long i=1;
        while(A > 0)
        {
            long temp = A % 2;
            binary += temp * i;
            A = A / 2;
            i*=10;
        }
        System.out.println("binary"+binary);
        if (binary == 0) {
            return 0;
        }
        int counter = 0;
        while (binary % 10 == 0) {
            counter++;
            binary /= 10;
        }*/

    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int decimal=sc.nextInt();

		System.out.println(trailingZeroes(decimal));
		sc.close();
	}
	
}