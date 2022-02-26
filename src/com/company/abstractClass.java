package com.company;

abstract public class abstractClass {
    // we can not make object of it because its not fully defined it can only be inherited.
    //and we will have to write the bodies of the methods written in an abstract class in the inherited class.
    abstract void doSomthing ();
}

class inheritedFromAbstractClass extends abstractClass{

    @Override
    void doSomthing() {
        System.out.println("inheritedFromAbstractClass");
    }
}

class Layer2inheritedFromAbstractClass extends inheritedFromAbstractClass {

    @Override
    void doSomthing() {
        super.doSomthing();
        System.out.println("Layer2inheritedFromAbstractClass\n");
    }

    public static void main(String[] args) {
        Layer2inheritedFromAbstractClass obj = new Layer2inheritedFromAbstractClass();
        obj.doSomthing();
        inheritedFromAbstractClass obj2 = new Layer2inheritedFromAbstractClass();
        obj2.doSomthing();
        inheritedFromAbstractClass obj3 = new inheritedFromAbstractClass();
        obj3.doSomthing();
        abstractClass obj5 = new inheritedFromAbstractClass();
        obj5.doSomthing();
        abstractClass obj4 = new abstractClass() {
            @Override
            void doSomthing() {
                System.out.println("\nDirect");
            }
        };
        obj4.doSomthing();



    }
}

