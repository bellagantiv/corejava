package com.day13;



class One{
    private static int count = 0;

    public  One(int a){

    }

    public One(int a, int b){

    }

    public One(int a, int b, int c){

    }
    public static  int getCount(){
        return count();
    }
}
public class manager {
    public static void main(String[] args){
        System.out.println(One.getCount());
    }
}
