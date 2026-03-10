package com.day14;

public class Remote extends Object {

    int volume;
    boolean isMute;
    public Remote() {
        this.volume = 5;
        this.isMute = false;
    }
    public void volumeup(){
        if (this.isMute){
            this.isMute = false;
        }
        this.volume++;
    }
    public  void volumedown(){
        if (this.volume>0){
            this.volume--;
        }
       if (this.volume==0){
           this.isMute = true;
       }
    }
    public void Mute(){
        this.isMute = true;
        this.volume = 0;
    }

    @Override
    public String toString() {
        return "Remote{" +
                "volume=" + volume +
                ", isMute=" + isMute +
                '}';
    }
}
