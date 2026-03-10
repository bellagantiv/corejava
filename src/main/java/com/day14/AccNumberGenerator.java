package com.day14;

public class AccNumberGenerator {

    public static int get;
    private static int startNum=1001;

    public static int getNewAccNumber(){
        return startNum++;
    }

}
