package com.day13;
class parent extends Object{

    public parent(){
        super();

        System.out.println("Parent Constructor");
    }
    {
        System.out.println("IIB-Parent");
    }
}
class Two  extends parent{
    static {

        System.out.println("Static block-1");
    }
    Two() {
        super();

        System.out.println("Constructor");
    }
    {
        System.out.println("IIB");
    }
    static {
        System.out.println("Static Blick-2");
    }
}
public class IIBexample {
    public static void main(String[] args){
        Two obj = new Two();



    }

}
