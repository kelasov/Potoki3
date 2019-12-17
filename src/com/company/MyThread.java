package com.company;

public class MyThread extends Thread{
    private String messeg;
    boolean flag=true;
    MyThread(String m){
        this.messeg=m;
    }
    @Override
    public void run() {
        while (flag){
            Main.test(messeg);
        }
    }
}
