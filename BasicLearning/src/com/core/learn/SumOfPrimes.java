package com.core.learn;

import java.util.*;

class SumOfPrimes{

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter start and end values: ");
//int start = sc.nextInt();
int end = sc.nextInt();
int i, temp1, temp2, remainder, n = 0, result = 0, frst=0, lst=0;


for(i = 1; i < end; ++i)
{

temp2 = i;
temp1 = i;

/*while (temp1 != 0)
{
temp1 /= 10;
++n;
}*/

while (temp2 != 0)
{
remainder = temp2 % 10;
result += Math.pow(remainder, n);
temp2 /= 10;
}

if (result == i) {
	lst=result;
}

n = 0;
result = 0;

}
frst=1;

System.out.print(frst+" "+lst + " ");

}

}
