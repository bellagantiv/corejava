package com.day14;

public class Master {
    public static void main(String[] args){
        Remote remote = new Remote();
        remote.volumeup();
        remote.volumeup();
         remote.volumedown();
        System.out.println(remote);

         Remote remote1 = new Remote();
        remote1.volumedown();
        remote1.Mute();
        remote1.volumeup();
        System.out.println(remote1);

    }
}
