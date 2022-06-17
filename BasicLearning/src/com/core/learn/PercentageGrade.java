package com.core.learn;

import java.util.*;

public class PercentageGrade{
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int A=sc.nextInt();
	        int B=sc.nextInt();
	        int C=sc.nextInt();
	        int D=sc.nextInt();
	        int E=sc.nextInt();
	        int percent=0;
	        percent=((A+B+C+D+E)/5);
	        if(percent>=90){
	            System.out.println(percent+" A");
	        }
	        else if(percent>=80){
	            System.out.println(percent+" B");
	        }
	        else if(percent>=70){
	            System.out.println(percent+" C");
	        }
	        else if(percent>=60){
	            System.out.println(percent+" D");
	        }
	        else if(percent>=40){
	            System.out.println(percent+" E");
	        }
	        else{
	            System.out.println(percent+" F");
	        }
	        sc.close();
	    }
}