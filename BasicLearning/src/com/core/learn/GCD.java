package com.core.learn;

import java.util.*;

public class GCD{
	public static int gcd(int A, int B) {
		if(B == 0) return A;
		return gcd(B, A % B);
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int lcm = 0, A, B, hcf = 0;
        for (int i = 1; i <= T; i++)
        {
            A = scanner.nextInt();
            B = scanner.nextInt();
						
            hcf = gcd(A, B);
            System.out.println(hcf);
        }
        scanner.close();
    }
}