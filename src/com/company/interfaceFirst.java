package com.company;

public interface interfaceFirst {
    int i = 10;
    //the compiler will be writing the int as // public static final int i = 10;


    void interfacemethod();
    //the compiler will be writing the int as // public abstract void interfacemethod ()

}
interface interfaceInherited extends interfaceFirst {
    void interfaceInheritedMethod ();
    void print();

}

interface interfaceSecond {
    int x = 20;
    void interfaceSecondMethod();
    void print();
}

class ImplementInterface implements interfaceInherited, interfaceSecond{
    /* multiple inheritances are possible. */


    @Override
    public void interfacemethod() {
        System.out.println("interfacemethod");
    }

    @Override
    public void interfaceInheritedMethod() {

        System.out.println("interfaceInheritedMethod");
    }

    @Override
    public void print() {
        System.out.println("there is only one print declearation because though there are print methods in both the interfaces" +
                "and that is being override here");
    }

    @Override
    public void interfaceSecondMethod() {
        System.out.println("interfaceSecondMethod");
    }
}