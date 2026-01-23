package com.day2;

import java.util.Scanner;

public class acceptnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if (num <= 0){
            num = -num;
        }
        System.out.println("accepting number"+ num);
    }
}
