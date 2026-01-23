package com.day2;

import java.util.Scanner;

public class billamount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bill amount :");
        float billamount = sc.nextFloat();
        float discount = 0.0f;
        float netamount = 0.0f;
        if(billamount >= 10000){
            discount = billamount * 0.1f;
        }
        netamount = billamount - discount;
        System.out.println("bill amount :" + billamount);
        System.out.println("discount:" + discount);
        System.out.println("net amount:" + netamount);
    }
}
