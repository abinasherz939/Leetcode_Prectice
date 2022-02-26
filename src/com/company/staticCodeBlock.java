package com.company;

public class staticCodeBlock {
    static int staticVariable;
    int nonStatic;

    static { //executed only once
        System.out.println("static initialisation");
        staticVariable = 5;
        // can not intialise nonstatic variable here.
    }
    {
        System.out.println("non static intailization");
        nonStatic = 7;
    }
    public staticCodeBlock() {
        System.out.println("In Counstructor");
    }

    public static void main(String[] args) {
        new staticCodeBlock();
        new staticCodeBlock();
        // we did not catched any value in any object to use the value
    }
}
