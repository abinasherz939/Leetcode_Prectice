package com.company.Threads;

public class multipleThreads {
    public static void main(String[] args) {
        newThread object = new newThread();
        Thread one = new Thread(object, "First");
        Thread two = new Thread(object, "Second");
        Thread three = new Thread(object, "Third");
        Thread four = new Thread(object);

        four.setName("Fourth");
        one.setPriority(8);




        one.start();
        two.start();
        three.start();
        four.start();

    }
}
