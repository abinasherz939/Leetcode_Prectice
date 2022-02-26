package com.company;

/**
 * we cannot have this and super at the same time
 *
 *
 * **/

/**
 * every constructor should have the first line to be either super or this
 * if we will write this then the compiler will not add super other wise it will add super as first line
 *
 * **/
//
    // every class has a superset namely /**"Object"**/


class parent {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class child extends parent{
    String name;

    void givenames () {
        name = "Child";
        super.name = "Parent";
    }
    void printNames (){
        System.out.println(name +" "+ super.name);
    }

    public static void main(String[] args) {
        child child = new child();
        child.givenames();

        child.printNames();

        System.out.println(child.name + " " + child.getName());
    }
}

class superAndThis {
    boolean flag;
    public superAndThis() {
        this(false);

    }
    public superAndThis(boolean flag){
        this.flag =flag;
    }
}
class superAndThisExtended extends superAndThis {
    public superAndThisExtended(){
        super();
    }
    public superAndThisExtended (boolean flag) {
        super(flag);
    }
    public superAndThisExtended (int x){
        this(true);
    }

    public static void main(String[] args) {
        superAndThisExtended superAndThisExtended =  new superAndThisExtended(5);
        superAndThis superAndThis  = new superAndThisExtended(5);
        superAndThis superAndThis1  = new superAndThisExtended();

        System.out.println(superAndThisExtended.flag);
        System.out.println(superAndThis.flag);
        System.out.println(superAndThis1.flag);
    }
}

