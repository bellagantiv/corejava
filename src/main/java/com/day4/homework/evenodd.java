package com.day4.homework;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("enter a number");
         int n, evensum=0, oddsum=0;
         n = sc.nextInt();
         for (int i =0; i<= n; i++) {
             if (i % 2 == 0) {
                 evensum = evensum + i;

             } else {
                 oddsum = oddsum + i;

             }
         }
        System.out.println(" sum of even numbers = " + evensum);
        System.out.println("sum of odd numbers = " + oddsum);
    }
}
