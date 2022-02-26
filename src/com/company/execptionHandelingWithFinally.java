package com.company;

public class execptionHandelingWithFinally {

    void exampleThrows () throws ArrayIndexOutOfBoundsException {
        int[] ab = new int[5];
        System.out.println(ab[5]);
    }
    public static void main(String[] args) {
        try {

            execptionHandelingWithFinally obj = new execptionHandelingWithFinally();
            obj.exampleThrows();
            System.out.println("under try");
        }catch (ArithmeticException exception){
            String message = exception.getMessage();
            System.out.println(message+"\n" +"From catch block, Divide by Zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {

            System.out.println("finally this will be executed");
        }
        System.out.println("out of the block");
    }
}
