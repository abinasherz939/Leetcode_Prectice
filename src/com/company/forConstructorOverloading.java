package com.company;


// this can be done this way also.
// constructor cannot have the return type, contructor name should be same as class name.
// every time you use new keyword, one constructor should always be revoked no matter what. the piece of code which is used when  new is used is called constructor.
// contructor are used to initialize instance variable.
// can not be marked as static.
// cannot use final or abstract keyword with constroctor
/**
if we do not define any constrocter then jave gives us a default constructor. // 1. default Constructor
if we do not intailize every variable of a constructor java will assign default value to it. you can cheack the values on net.
if we will define a constroctor then it eill be called no arg constructor. // 2. No arg-constructor
 // 3. parameterized constuctor - with parameter


**/
public class forConstructorOverloading {

    //this is the default value for every constuctor if not overwritten
    int x = 1;
    int y = 2;
    int z = 3;
    int resultMultiply = x*y*z;
    String string = "text from the class forConstructorOverloading without using constructor over loading";
    //it will work even if you will reassign the value in every constructor


    public  forConstructorOverloading(int x){
        this.x = x;/** this keyword : 1. this is a refrence variable that refersto the current object.
         2. the main purpose of using main keyword is to diffrentiate the local variable and data members of the class,
         whenever the local variable and data members of the class have name without creating amibiguity to jvm.

         this.x means the variable x form the class, it is not the local variable.
         **/
        //rest is default
        this.resultMultiply = x*this.y* this.z;
    }

    public forConstructorOverloading(int x, int y){
        this(x);// there is a function this(value);
        this.y = y;
        this.resultMultiply = x*y*z;
    }

    public forConstructorOverloading(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        this.resultMultiply = x*y*z;

    }

    public forConstructorOverloading() {
        this(25, 6); //there is a function this(value);
        //some time we may fall into an infinite loop.
    }

    void display (){
        System.out.println("x = "+ x + "\n" +
                "y = " + y +" \n" +
                "z = " + z + "\n" +
                "resultmultiply = "+ resultMultiply);
    }
}
