package com.company.innerClass;

public class methodLocalInnerClass {
    private int i = 5;
    public void doThings() {
        class InnerMethodLocalClass{
            public void accessOuterFromMethodLocalInnerClass (){
                System.out.println("outer private i is: " + i);
            }

        }
        InnerMethodLocalClass innerMethodLocalClass = new InnerMethodLocalClass();
        innerMethodLocalClass.accessOuterFromMethodLocalInnerClass();// here only it ccan be defined in the method only
        // methods local variable will not be accesable by the class.

    }

}
