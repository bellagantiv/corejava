package com.day5;

import java.util.Scanner;
public class calcwithswith {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number 1");
        int num1 = sc.nextInt();
        System.out.println(" enter nimber 2 ");
        int num2 = sc.nextInt();
        System.out.println("1.add 2.sub 3.mul 4.div 5.exit");
        System.out.println(" Enter your choice");
        int ch = sc.nextInt();
        String operator = "";
        int res = 0;
        switch (ch) {
            case 1:
                operator = "+";
                res = num1 + num2;
                break;
            case 2:
                operator = "-";
                res = num1 - num2;
                break;
            case 3:
                operator = "*";
                res = num1 * num2;
                break;
            case 4:
                operator = "%";
                res = num1 % num2;
                break;
            case 5:
                System.exit(0);
            default: operator = "invalid operator";
        }
        System.out.println(num1 +" "+operator+" "+ num2+" = "+ res );

    }

}
