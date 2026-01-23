package com.day2;

import java.util.Scanner;

public class profitorloss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price");
        double costprise = sc.nextDouble();
        System.out.println("Enter the selling price");
        double sellingprice = sc.nextDouble();
        if (costprise<sellingprice){
            double profit = costprise - sellingprice;
            System.out.println("profit" + profit);
        } else if (costprise>sellingprice) {
            double loss = costprise -  sellingprice;
            System.out.println("loss" + loss);
        }else {
            System.out.println("no profit, no loss");
        }
    }
}
