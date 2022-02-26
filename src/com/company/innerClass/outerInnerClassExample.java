package com.company.innerClass;

public class outerInnerClassExample {
    private int i = 5;

    public void makeInner(){
        inner innerObject = new inner();
        innerObject.acsessOuter();
    }
    class inner {
        public void acsessOuter(){
            System.out.println("private int i is " + i);
            System.out.println("InnerClass Ref: " + this);
            System.out.println("Outer class Ref: " + outerInnerClassExample.this);
        }
    }
    public void innerAccsess (){
        inner in = new inner();
        in.acsessOuter();
    }
}
class testInnerOuterClass{
    public static void main(String[] args) {
        // inner class can access outer class and outer class can acces inner class's , everything.
        outerInnerClassExample outer = new outerInnerClassExample();
        outerInnerClassExample.inner inner = outer.new inner();
        inner.acsessOuter();
        outerInnerClassExample.inner inner2 = new outerInnerClassExample().new inner();
        inner2.acsessOuter();
        outer.innerAccsess();
        System.out.println("\n\n\n\n");
        inner2.acsessOuter();

    }

}
