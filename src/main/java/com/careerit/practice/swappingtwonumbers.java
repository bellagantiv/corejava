package com.careerit.practice;

import java.util.Scanner;

public class swappingtwonumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the x value");
        int x = sc.nextInt();
        System.out.println("enter the y value");
        int y = sc.nextInt();

        int temp;

        temp = x;
        x = y;
        y = temp;
        System.out.println("after swapping:");
        System.out.println("x =" + x);
        System.out.println("y =" + y);

    }
}
