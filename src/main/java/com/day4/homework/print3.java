package com.day4.homework;

public class print3 {
    public static void main(String[] args){
        int [][] matrix = {
                {19,0,0},
                {0,19,0},
                {0,0,19}
        };
        for (int i= 0; i< matrix.length ; i++){
            for (int j = 0; j < matrix[i].length ; j++  ){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
