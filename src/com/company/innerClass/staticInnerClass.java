package com.company.innerClass;

class OuterClass {
    private int i = 2;
    public static class staticInnerClass{
        // it is as good as making a new class.
        // static class will not be able to access the outer class variable.
        public void doThings(){
            System.out.println("printing from inner class"/* + i*/);
        }
    }
}
class forRunningStaticInnerClass{
    public static void main(String[] args) {
        OuterClass.staticInnerClass object= new OuterClass.staticInnerClass();
        object.doThings();
    }
}