package com.day5;

import java.util.Scanner;

public class billcalculator {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the day name");
        String dname = sc.next();
        System.out.println("enter the bill amount");
        float billamount = sc.nextFloat();
        float discount = 0;
        switch (dname){
            case "mon" :
            case "wed":
            case "thu": discount = billamount * 0.05f;
            break;
            case "the": discount = billamount * 0.20f;
            break;
            case "fri": discount = billamount * 0.10f;
            break;
            case "sat" :
            case "sun ": discount = -billamount * 0.10f;
            break;
            default:
                System.out.println("invalid details");

        }
        float netamount = billamount - discount;
        System.out.println("billa amount " + billamount);
        System.out.println("discount " + discount);
        System.out.println("net amount " + netamount );
    }
}
