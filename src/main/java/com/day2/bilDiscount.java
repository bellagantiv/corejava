package com.day2;

import java.util.Scanner;

public class bilDiscount {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the bill amount ");
        double billamount = sc.nextInt();
        System.out.println("enter customer age");
        double age = sc.nextInt();

        if (age > 50){
            double discount = billamount * 0.05;
            billamount = billamount - discount;
            System.out.println( "discount " + discount);
        }else{
            System.out.println( billamount);
        }
        System.out.println("  bill   " + billamount);

    }
}