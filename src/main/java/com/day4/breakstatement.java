package com.day4;

public class breakstatement {
    public static void main(String[] args){
        for (int i=1;i<=100; i++) {
            if (i % 3 == 0 && i % 6 == 0) {
                break;
            }
            System.out.println(i);
        }

    }
}
