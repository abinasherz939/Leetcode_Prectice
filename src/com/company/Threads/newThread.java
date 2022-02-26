package com.company.Threads;

public class newThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(" Run by " + Thread.currentThread().getName() + ", i is " + i);
            // this is how we can get the refrence the threads.  // Thread.currentThread().getName()
            // either we can give them a name or by default they get a id.

            try {
                Thread.sleep(10);
                Thread.sleep(1000, 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Thread.yield();// it is also like sleep but it sends the thread to the runnable state.
            // but after going to the runnable state it is not under the control of anyone to schedule.
            // it will be done by jvm schedular which is internal to java not user control.

        }
    }
}
