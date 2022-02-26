//Name : Abinash Choudhary
//Roll: 10800119028
package com.company;
public class staticKeywordForExam {
    public static void main(String[] args) {

        forStaticMethodCalling.staticMethod();
        // we did not require to make obj.
        VariableDemo obj1=new VariableDemo();
        VariableDemo obj2=new VariableDemo();

        obj1.increment();
        System.out.println("Obj1: count is="+obj1.count);

        obj2.increment();
        System.out.println("Obj2: count is="+obj2.count);

    }
}
class forStaticMethodCalling{
    public static void staticMethod(){

    }

}
class VariableDemo
{
    static int count=0;
    public void increment()
    {
        count++;
    }
}