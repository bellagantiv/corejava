package com.careerit.practice;

import java.util.Scanner;

public class netandaverage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double weight, average;
        for(int i=1; i <= 5; i++) {
            System.out.println("enter weight of person" + i + ":");
            weight = sc.nextDouble();
            sum = sum + weight;
        }
    average = sum / 5;
     System.out.println("net weight =" +  sum);
     System.out.println("aveerage weight =" + average);


    }
}
