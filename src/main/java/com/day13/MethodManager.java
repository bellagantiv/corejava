package com.day13;
class MyMath{

    public int add(int a, int b){
        return a+b;

    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int... a){
        int res = 0;
        for (int i : a){
            res += i;
        }
        return res;
    }

   public int getPostIncValue(int a) {
        return a++;
    }

    public int getPreIncValue(int a) {
        return ++a;
    }

}
public class MethodManager {
    public static void main(String... args){
        MyMath obj = new MyMath();
        obj.add(1,3);
        obj.add(1,2,3);
        obj.add(1);
        obj.add(1,2,3,4,5,6);
        obj.add('a','b');

        int a =9;
        System.out.println(obj.getPostIncValue(a));
        System.out.println(obj.getPreIncValue(a));
    }

}
