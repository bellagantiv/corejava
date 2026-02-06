package com.day5;

import java.util.ArrayList;
import java.util.List;

public class breakcontinue {
    public static void showValues(List<Integer> list){
        for (int i : list){
            if (i % 3 == 0) {
                continue;;
            }
            System.out.print(i);
        }
    }
    public List<Integer> generateprime(int n){
        List<Integer>list = new ArrayList<>();

        for (int i=2; ; i++){
            if(list.size()== n){
                break;
            }
            if (isprime(i)){
                list.add(i);
            }

        }
        return list;
    }
}

public static boolean isprime(int num) {
    if(num < 2 || (num % 2 == 0 && num != 2) ){
        return false;
    }
    for(int i =2; i<= num / 2; i++){
        if(num % i ==0){
            return  false;
        }
    }
}