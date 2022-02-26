package com.company.Threads;

public class forRunningFirstThread {

    public static void main(String[] args) {
        firstThreadMethod1 firstThreadMethod1 = new firstThreadMethod1();
        firstThreadMethod2 firstThreadMethod2 = new firstThreadMethod2();
        Thread forMakingThreadFromRunnable = new Thread(firstThreadMethod2);

        /**
         *
         * there are 4 constructors in Thread()
         *
         * 1. Threads ()
         * 2. Threads (Runnable target)
         * 3. Threads (Runable target, String name)
         * 4. Threads (String name)
         *
         *
         *
         * **/


        firstThreadMethod1.start();
        forMakingThreadFromRunnable.start();
    }
}
