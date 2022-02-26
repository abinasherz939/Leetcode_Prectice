package com.company.Threads;

public class firstThreadMethod2 implements Runnable{

    //more usable practically

    @Override
    public void run() {
        for (int i = 0; i < 1000000; i++) {
            System.out.println("from thread 2");
        }
    }
}
