package com.day4.homework;

import java.lang.classfile.attribute.SyntheticAttribute;
import java.util.Scanner;

public class uppercaselowercase {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any charater: ");
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch)){
            System.out.println("uppercase letter");
        }
        else if(Character.isLowerCase(ch)){
            System.out.println("lowercase Letter");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Symbol");
        }
    }

}
