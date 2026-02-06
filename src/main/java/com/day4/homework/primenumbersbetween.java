package com.day4.homework;

import java.util.Scanner;

public class primenumbersbetween {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second  number");
        int num2 = sc.nextInt();

        int start = Math.min(num1,num2);
        int end = Math.max(num1,num2);

        System.out.println("prime numbers betwween" + start + "and " + end + " are:" );
        for (int i = start+1; i<end; i++){
            if(i<= 1 )
                continue;
            boolean isprime = true;
            for (int j = 2; j<=i/ 2; j++){
                if(i%j == 0){
                    isprime = false;
                    break;
                }
            }
            if (isprime){
                System.out.print(i+" ");
            }
        }
    }
}
