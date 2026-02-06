package com.day4.homework;

public class Fibonacciseries {
    public static void main(String[] args){
        int a=0, b=1,c;

        System.out.print(" Fibonacci Series up to 34 :  ");
        System.out.println(a+ "" + b + "");

        while (true) {
            c = a + b;
            if (c>34)
                break;
            System.out.print(c + "    ");
            a =b;
            b =c;
        }
    }

}
