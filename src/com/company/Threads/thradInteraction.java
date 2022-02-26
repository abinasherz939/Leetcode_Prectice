package com.company.Threads;

class calculator extends Thread {
    int total;

    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                total += i;
            }
            notify();
        }
    }
}

class reader extends Thread {
    calculator calc;
    public reader (calculator calc){
        this.calc = calc;
    }

    @Override
    public void run() {
        super.run();

        try {
            synchronized (calc){
                System.out.println("waiting For Result");
                calc.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("total is "+ calc.total);

    }
}




public class thradInteraction {
    public static void main(String[] args) {

        // here also we can not guaranty that which will execute first so usually we put both of them in while loop
        // so no matter which one is executed first every time it will run.
        // but here we can not know or decide what is the way to do.

        calculator calc = new calculator();
        new reader(calc).start();
        calc.start();
    }
}
