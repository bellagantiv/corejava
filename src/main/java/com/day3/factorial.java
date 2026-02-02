package com.day3;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("evter the n value :");
        int n = sc.nextInt();
        int fact = 1;
        for( int i =2; i<=n; i++){
            fact *=i;
        }
        System.out.println("factorial of " +n+ "is" + fact);
    }
}
