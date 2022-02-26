package com.company;

public class forMethodOverloading {
    /*this is necesarry that give a return type to the methods unless it will not be read by another class*/
    public void print (int x){
        System.out.println(x);
    }
    public void print(String s){
        System.out.println(s);
    }
}
