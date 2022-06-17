package com.core.learn;

import java.util.*;

public class ArmstrongNumbers
{
    public static void main(String args[])
    {
	int num, start, end, i, rem, temp, counter=0;
		
	Scanner scanner = new Scanner(System.in);
	//System.out.print("Enter the start number: ");
	//start = scanner.nextInt();
	//System.out.print("Enter the end number: ");
	end = scanner.nextInt();
	scanner.close();

	//generate Armstrong numbers between start and end
	for(i=1; i<end; i++)
	{
	   temp = i;
	   num = 0;
	   while(temp != 0)
	   {
		rem = temp%10;
		num = num + rem*rem*rem;
		temp = temp/10;
	   }
	   if(i == num)
	   {
		if(counter == 0)
		{
		  // System.out.print("Armstrong Numbers Between "+1+" and "+end+": ");
		}
		   System.out.println(i + "  ");
		   counter++;
	   }
	}
	// if no Armstrong number is found
	if(counter == 0)
	{
	   System.out.print("There is no Armstrong number Between "+1+" and "+end);
	}
    }
}