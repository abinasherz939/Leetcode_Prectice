package com.company;
//protected -- only in inheritence. it works for both in same pakage and in diffrent pakages.

public class subClass extends superClass {

    private int y = 5;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void forMethodOverriding (){ //some time it is called polymorphism.// overridden
        /**
         * argument list should be same.
         * if not same arguments then the methods will be overloaded not overridden.
         *
         * Access modifiers should be greater than or equal scope then superClass in subclass.
         *
         * private, static, final cannot be overridden.
         * **/

        //super.forMethodOverriding();// this can also be done to use both the functionality.
        System.out.println("from subClass");
    }

    public void onlyInSubClass (){
        System.out.println("onlyInSubClass");
    }

}
