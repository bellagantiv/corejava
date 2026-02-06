package com.day5;

public class countcharactesr {
    public static void main(String[] args){

        String  name = "core java";
        int vcount = 0;
        int ocunt = 0;

        for(int i=0; i<name  .length();i++){
            System.out.println(name.charAt(i));
            char ch =   name.charAt(i);
            switch (ch){
                case 'a':
                case 'e' :
                case  'i'   :
                case    'o' :
                case    'u' :
                    vcount++;
                    break;
                default:ocunt++;
            }
        }
        System.out.println("Total"+ vcount+ " vowels are thre in \"" + name+"\"");
    }
}
