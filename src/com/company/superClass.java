package com.company;

// multiple inheritance is not allowed // Diamond Problem.

// don't try to use inheritance everywhere when not required. try thinking about has a <attribute> or deriving some functionality.
// if attribute then make cn another class of it, don't inherit it

public class superClass {

    private int x = 2;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void forMethodOverriding(){
        System.out.println( "from super class");
    }
}
