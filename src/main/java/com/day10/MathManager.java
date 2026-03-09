package com.day10;

import java.util.List;

public class MathManager  {

    public static void main(String[] args){
        MathOperation obj = new MathOperation();
        List<Integer> primeList= obj.generatePrime(1,200000);
        System.out.println(primeList);
    }
}
