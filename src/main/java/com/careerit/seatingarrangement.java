package com.careerit;

import java.util.Scanner;

public class seatingarrangement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people:");
        int count = sc.nextInt();
        System.out.println("Enter the cab capacity:");
        int capacity = sc.nextInt();
        int requiredCabs=0;
        if(count % capacity == 0){
            requiredCabs = count / capacity;
        }
        else{
            requiredCabs = (count / capacity) + 1;
        }
        System.out.println("total"+requiredCabs+" cabs are required to accomidate" + count+"with cab capacity"+capacity);
    }

}
