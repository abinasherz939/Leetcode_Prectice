package com.company.execptionHandling;

class ageInvalidExecption extends Exception {
    int age;
    ageInvalidExecption(String msg){
        super(msg);
    }
}
class Student {
    String name;
    int age;

    public void setAge(int age) throws ageInvalidExecption {
        if (age < 0) throw new ageInvalidExecption("age is a negetive number");
        this.age =age;

    }
}
class testEception {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.setAge(-1);
        } catch (ageInvalidExecption e) {
            e.printStackTrace();
        }
    }
}
