package com.core.learn;

import java.lang.*;

public class Rectangle
{
	float length;
	float breadth;
	double area=0;
	
	public double calculatePerimeter(float length,float breadth)
	{
		
		area= (2*(length+breadth));
		return area;
	}
	
	public static void main(String args[]) {
		
		Rectangle rect = new Rectangle();
		 rect.area= rect.calculatePerimeter(2,3);
		
		System.out.println("The area of the Rectangle is "+rect.area);
	}
}


