package com.day4.homework;

public class print2 {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Print leading spaces to center the numbers
            for (int j =1 ; j <= rows; j++) {
                System.out.print("  ");  // double space for proper alignment
            }

            // Print increasing numbers
            for (int j = i ; j <= i; j++) {
                System.out.print(j);
            }

            // Print decreasing numbers
            for (int j = i-1; j >= i; j--) {
                System.out.print(j);
            }

            System.out.println();  // move to next row
        }
    }


}
