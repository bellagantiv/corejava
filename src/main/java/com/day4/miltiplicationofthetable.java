package com.day4;

public class miltiplicationofthetable {
    public static void main(String[] args){
        int n = 20;
        int count = 50;
        for (int i =1; i <= n ; i++){
            int num = i;
            for (int j = 1; j <= 10 ; j++){
                System.out.println(num + " * " + j + " = " + (num* j));
            }
            System.out.println("-".repeat( count));
        }

    }
}
