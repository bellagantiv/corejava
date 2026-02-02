package com.day3;

import java.util.Scanner;

public class forloopexample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value");
        int n= sc.nextInt();
        for (int i = 1; i <=n; i++) {
            System.out.println(i +  "  =   Welcome to java world");
        }
    }
}
