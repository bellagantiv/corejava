package com.day2;

import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class biggestofthreenum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1:");
        int num1 = sc.nextInt();
        System.out.println("enter number2:");
        int num2 = sc.nextInt();
        System.out.println("enter number3:");
        int num3 = sc.nextInt();
        int biggest;
        if( num1>num2 && num1>num3 ){
            biggest = num1;
        } else if (num2>num3) {
            biggest=num2;

        }else  {
            biggest=num3;
        }
        System.out.println(" the biggest of" + num1 +"  ,  " + num2 +"   and  " + num3 +" is  "+ biggest);



    }
}
