package com.day4.homework;

public class print1 {
    public static void main(String[] args){
        int num =1;
        for(int i = 1; i <= 4; i++){
            for (int j = 1; j <= i*2-1  ; j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();
        }
    }
}
