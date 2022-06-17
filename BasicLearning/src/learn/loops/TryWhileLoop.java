package learn.loops;

import java.util.*;

public class TryWhileLoop{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int i=0;
		while(i<=N) {
			System.out.println("Value of i -->"+i +" before ++i");
			++i;
			int k=i;
			System.out.println("Value of i -->"+i +" after ++i");
			System.out.println("Value of k -->"+k +" after ++i");
			System.out.println();
		}
		sc.close();
	}
}