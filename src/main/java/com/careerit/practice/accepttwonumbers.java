package com.careerit.practice;

import java.util.Scanner;

public class accepttwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number1:");
        double num2 = sc.nextDouble();

        double sum = num1+num2;
        double average = sum/ 2;
        System.out.println("sum =" + sum);
        System.out.println("average"+ average);
        sc.close();
    }



}
