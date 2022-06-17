/*
 * */
package com.core.learn;

import java.util.*;

public class CategoriesThePersons{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        float A=sc.nextFloat();
        if(A>=195){
            System.out.println("abnormal");
        }
        else if((A>=165)){
            System.out.println("taller");
        }
        else if((A>=150)){
            System.out.println("average");
        }
        else{
            System.out.println("dwarf");
        }
        sc.close();
	}
}