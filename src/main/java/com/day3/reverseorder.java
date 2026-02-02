package com.day3;

import java.util.Scanner;

public class reverseorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int n = sc.nextInt();
        for (int i = 20; i >= 1; i--) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

    }

}
