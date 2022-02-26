package com.company.execptionHandling;

public class example1ExecptionHandling {
    // if there are nested try catch then first it will try to execute its own catch block and if not found same type of execution then it will go
    // to parent catch blocks

     void exampleThrows () throws ArrayIndexOutOfBoundsException {// here it does not care about handaling them
         // the calling funation should handle them.
         int[] ab = new int[5];
         System.out.println(ab[5]);
     }
    public static void main(String[] args) {
        int a, b, b1;
        try {
            a= 10;
            b = 0;
         //   b1 = a /b;
          example1ExecptionHandling obj = new example1ExecptionHandling();
          obj.exampleThrows();// here we are caring about exexptions.
            System.out.println("under try");// this line will not be executed if there is an exception occers.
        }catch (ArithmeticException exception){// if one catch block is executed the other will not get executed.
            String message = exception.getMessage();
            System.out.println(message+"\n" +"From catch block, Divide by Zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            // no matter what happens it will be execued
            // even if you are returning from the block it will be executed then it will be returned.
            // here we close the thing which we have opened whike the execution of the program.

            /**
             * when will finally not get executed..??
             * 1. System.exit();
             * 2. Death of the thread;
             * 3. Exception in finally block
             *
             * **/
            System.out.println("finally this will be executed");
        }
        System.out.println("out of the block");
    }
}
