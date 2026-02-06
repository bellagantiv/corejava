package com.day4.homework;

import java.util.Scanner;

public class factorialnumber {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int fact = 1;
        while (n > 0){
            fact = fact * n;
            n--;
        }
        System.out.println("factorial is:" + fact);
    }
}
