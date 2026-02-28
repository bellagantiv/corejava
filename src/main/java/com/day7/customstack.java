package com.day7;

import java.util.Arrays;
import java.util.Scanner;

public class customstack {
    public static void main(String[] args) {

        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        int c = 0;
        while (true) {
            System.out.println("*".repeat(50) + "\n1.add 2.deleat 3.update \n" + "*".repeat(50));
            System.out.println("enter your value");
            int ch = sc.nextInt();
            if(c == 0){
                System.out.println("[]");
            }else {
                showElements (arr,c);
            }
            System.out.println(Arrays.toString(arr));
            switch (ch) {
                case 1:
                    System.out.println("enter the num :");
                    int num = sc.nextInt();
                    if (c == arr.length - 1) {
                        int[] tmp = new int[2 * arr.length];
                        System.arraycopy(arr, 0, tmp, 0, arr.length);
                        arr = tmp;
                    }
                    arr[c++] = num;
                    ;
                    break;
                case 2:
                    System.out.println("enter the num to delete:");
                    int dnum = sc.nextInt();
                    break;
                case 3:
                    System.out.println("enter the num to update: ");
                    int unum = sc.nextInt();
                    int index = indexof(arr,unum);
                    if(index!=-1){
                        System.out.println("enter the update value: ");
                      int uvalue = sc.nextInt();
                        arr[index]= uvalue;
                    }
                    break;
                default:
                    System.out.println("wrong choise.... please enter 1-3 only : ");
            }
            System.out.println("DO you want continur? enter 1 to continue");
            int choice = sc.nextInt();
            if (choice != 1){
                break;
            }
        }



    }

    private static int indexof(int[] arr, int unum) {
        return -1;
    }

    private static void showElements(int[] arr, int c) {
        String str = "[";
        for(int i=0;i<=c;i++){
            str += "" + arr[i] + ",";
        }
        str = str.substring(0 ,str.length()-1);
        str +="]";
        System.out.println(str);

    }


}





