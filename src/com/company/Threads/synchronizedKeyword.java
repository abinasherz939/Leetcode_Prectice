package com.company.Threads;

public class synchronizedKeyword {
    int count;
    public synchronized void Count(){
        // a thread wants to enter into a critical section, and it does not have a lock then it will go to block state and after some time it will go to ready state.
        // A thread will be holding the Locks until its finished even if it is in wait state then also it is not giving up the lock.
        // we can also synchronize static method
        // static methods have different lock and the object have different lock. so they will not block each other.
        // this will make the method as critical section: i.e. only one thread can enter into it at once.
        // There could be deadlock also.
        count++;
    }

    public void  setCount (int x) {
        System.out.println("not Synchronized");
        synchronized (this){
            // this keyword is referring to the current object.
            count = x;
            System.out.println("this is Synchronized");
        }
    }
}
