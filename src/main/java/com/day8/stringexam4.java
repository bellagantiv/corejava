package com.day8;

public class stringexam4 {
    public static void main(String[] args){
        System.out.println(isPalindrome("MOM"));
    }
    private static boolean isPalindrome(String str){
        int l = str.length();
        for (int i =0, j= l -1; i<= j ; i++, j--){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
        }
        return true;

    }

}
