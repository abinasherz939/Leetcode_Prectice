package com.company;

public class singletonClass {

    private int integer;

    private static singletonClass instance;
    private singletonClass () {
        //constructor
    }
//    static {
    /**
     * there is a disadvantage of this type of declaration that is lets say if you want to use a static method written in
     * singletonClass you need to load this class and then a new instance is created which is not intentional.
     * **/
//        instance = new singletonClass();
//    }

    public static singletonClass getInstance() {
        if(instance == null){
            //this way of writing is not thread safe.
            instance = new singletonClass();
        }
        return instance;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }
}
