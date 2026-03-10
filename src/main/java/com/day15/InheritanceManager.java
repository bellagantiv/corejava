package com.day15;
class One{
    One(int a, int b) {

        System.out.println("one");
    }

}
class Two extends One{
    Two(int a) {
        super(10,11);
        System.out.println("two");
    }
}
class Three extends Two {
    Three() {
        super(5);
        System.out.println("three");
    }

}
public class InheritanceManager {

   public static void main(String[] args) {
       Three obj = new Three();
    }

}
