package com.company;
/**
 * static keyword can be used in 6 scenario
 *
 * 1. static variable
 *          method area , intailized once at the start of the execution, a single copy only -- not thread safe.
 *          dont need to create any object to access it. if not valiable. className.variableName.
 *          used to create only constants generally
 *
 *2 static methods
 *          static methods belongs to the class not to the instance.
 *          static method can access only static data. it can not acess non-static data.
 *          it can access only static methods, and can not call nonstatic.
 *          it can be accessed directly by class name
 *          className.methodName();
 *          static methods can't refer "this" and "super " keyword anyway
 *
 *          main is also decleared as a static keyword.
 *
 *
 *
 *
 *
 * 3static blocks of code
 *
 *          another class is there staticCodeBlock
 *
 *
 *
 * 4static import
 * 5static inner class
 * 6interface static methods(java 1.8 onwards)
 *
 *
 * **/
public class staticKeyword {

    static int z = 5;
    int x = 5;


    public static void staticMethod(){
        System.out.println("this is the static method content");
    }

    public static void main(String[] args) {
        staticKeyword.staticMethod();
        staticMethod();


      //  x++;
      //  z++;

    }
}
