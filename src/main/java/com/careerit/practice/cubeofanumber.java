package com.careerit.practice;

import java.util.Scanner;

public class cubeofanumber {
    public static void main(String[] args){
        Scanner sc =   new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int cube = num * num * num;
        System.out.println("cube of the number " + cube );
    }
}
