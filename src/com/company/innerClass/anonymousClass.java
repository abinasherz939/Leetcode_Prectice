package com.company.innerClass;


class test {
    public void doThings(){
        System.out.println("Testing");
    }
}
public class anonymousClass {
    public static void main(String[] args) {
        test test = new test(){
            @Override
            public void doThings() {
                super.doThings();
                System.out.println("overRidden");
            }// this is also like a super class and subclass. // it is not fully same.
            // this is called as Anonaymus Class

            public void anotherMethod (){
                System.out.println("Another Method");
            }

        };
        test.doThings();
      //  test.anotherMethod(); // this will not work
        // this is how it is diffrent from the inheritation.
    }
}
