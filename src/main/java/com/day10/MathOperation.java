package com.day10;

import java.util.ArrayList;
import java.util.List;

public class MathOperation {

    public List<Integer>generatePrime(int lb, int ub){
        List<Integer>list = new ArrayList<>();
        for (int i=lb;i<=ub;i++){
            if (isPrime(i)){
                list.add(i);
            }
        }
        return list;

    }
    public List<Integer> generatePrime(int n){
        List<Integer> list = new ArrayList<>();
        int i=2;
        while (list.size()!=n){
            if (isPrime(i)){
                list.add(i);
            }
            i++;
        }
        return list;

    }
    public  List<Player> getPlayers(String data){
        String[] playerArr = data.split(",");
        List<Player> list = new ArrayList<>();

        for(String playerstr:playerArr){
            String[] arr = playerstr.split("-");
            long id = Long.parseLong(arr[0]);
            String name = arr[1];
            double amount = Double.parseDouble(arr[2]);
            Player player = new Player(id,name,amount);
            list.add(player);
        }
        return list;
    }

    private boolean isPrime(int num){
        if(num < 2|| (num%2== 0 && num !=2)){
            return false;
        }
        for(int i= 2; i<= num/2; i++){
            if(num % i==0){
                return false;
            }
        }
        return true;
    }
}
