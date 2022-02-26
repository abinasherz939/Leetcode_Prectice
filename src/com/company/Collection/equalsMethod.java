package com.company.Collection;

import java.util.Objects;

class Student {
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//here it is cheaking that if both are pointing to thw same file
        //the it will simliiy return dont need to compare it further
        

        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class equalsMethod {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Abinash");
        Student student2 = new Student(1,"Abinash");
        Student student = null;

        System.out.println(student1.equals(student2));
        System.out.println(student1==student2);
        System.out.println(student1.equals(student));

    }

}
