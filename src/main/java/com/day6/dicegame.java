package com.day6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class dicegame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rnum = ThreadLocalRandom.current().nextInt(1, 7);
        for (int i = 1; i <= 3; i++) {


            System.out.println("gess a number (1-6)");
            int gnum = sc.nextInt();
            if (rnum == gnum) {
                System.out.println("good you guessed number");
                break;
            } else {
                System.out.println("your guess is wrong:" + rnum);
            }
        }
    }
}
