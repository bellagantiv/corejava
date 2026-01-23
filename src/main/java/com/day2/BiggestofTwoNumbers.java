package com.day2;

import java.util.Scanner;

public class BiggestofTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1:");
        int num1 = sc.nextInt();
        System.out.println("enter number 2 :");
        int num2 = sc.nextInt();
        int biggest;
        if(num1>num2){
            biggest=num1;
        }else{
            biggest=num2;
        }
        System.out.println("the biggest of " + num1 + "the biggest of" + num2 +  "is" + biggest);
    }
}
