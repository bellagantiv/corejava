package com.day4.homework;

import java.util.Scanner;

public class sumofseries2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            System.out.print("Enter n: ");
            int n = sc.nextInt();

            double sum = 0.0;

            for (int i = 2; i <= n; i++) {
                sum += 1.0 / (i * i * i);   // 1 / i^3
            }

            System.out.println("Sum of series = " + sum);
            sc.close();
        }
    }

