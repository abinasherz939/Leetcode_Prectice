package com.company.Threads;

public class firstThreadMethod1 extends Thread {

    public void run (){
        for (int i = 0; i < 1000000; i++) {
            System.out.println("from 1");
        }
    }
}
