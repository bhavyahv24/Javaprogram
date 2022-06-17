package com.core.learn;

import java.lang.*;
import java.util.*;

public class AlphabetsCase {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        char X;
        X=scanner.next().charAt(0);
        if (Character.isUpperCase(X)) {
         System.out.println("UPPERCASE");
        }
        else {
         System.out.println("lowercase");
        }
        scanner.close();
    }
}