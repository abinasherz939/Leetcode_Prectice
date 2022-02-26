package com.company.Threads;

public class joinFunction {
    public static void main(String[] args) {
        newThread object = new newThread();
        Thread one = new Thread(object, "First");
        Thread two = new Thread(object, "Second");
        Thread three = new Thread(object, "Third");
        Thread four = new Thread(object, "Fourth");

        one.start();
        try {
            one.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        two.start();
        three.start();
        try {
            three.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Join means that -- join me (The normal flow of code after three is dead) in runnable state after three is dead.
        // till then wait in waiting state.
        // three.join(SomeTime)-- it means is three stops running then send me runnable or if SomeTime is over then also send me in runnable.
        // state Diagram for a thread is in "Threads states and transition" -- title

        four.start();


    }
}
