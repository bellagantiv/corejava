package com.day6;

public class sumandavg {
    public static void main(String[] args){

        int[] arr = new int[]{10, 20, 30, 40 ,50};
        for(int i =0; i < arr.length; i++ ){
            System.out.println(arr[i]);
        }
        for (int i = arr.length - 1; i>=0; i--){
            System.out.println(arr[i]);
        }
        for (int i=arr.length-4;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
