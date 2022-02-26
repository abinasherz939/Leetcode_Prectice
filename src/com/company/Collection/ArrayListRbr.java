package com.company.Collection;


import java.util.*;

//extended from list from list
public class ArrayListRbr {

    public static void main(String[] args) {


        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();

        employeeArrayList.add(new Employee(1,"sh"));
        employeeArrayList.add(new Employee(2,"iansh"));
        employeeArrayList.add(new Employee(3,"Abiash"));
        employeeArrayList.add(new Employee(4,"Ansh"));
        employeeArrayList.add(new Employee(5,"Ash"));

        Collections.sort(employeeArrayList, Employee::compareTo);

        for (Employee ob:
             employeeArrayList) {
            System.out.println(ob.name + " "+ ob.id);

        }

//        Comparator<Employee> comp = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if (o1.name < o2.name){//somting is wrong

//                    return -1;
//                }
//                if (o1.name>o2.name){
//                    return 1;
//                }
//                else return 0;
//            }
//        };

        //System.out.println("Search "+ Collections.binarySearch(employeeArrayList, new Employee(1, "sh"), comp));


        Iterator<Employee> employeeIterator = employeeArrayList.iterator();

        while (employeeIterator.hasNext()){
            Employee tempEmp= employeeIterator.next();
            System.out.println(tempEmp.name+" "+ tempEmp.id);
        }
    }
    
}
class Employee implements Comparable<Employee> {//for sorting comparable is needed

    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//here it is cheaking that if both are pointing to thw same file
        //the it will simliiy return dont need to compare it further


        if (o == null || getClass() != o.getClass()) return false;
        Employee student = (Employee) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


    public int compareTo(Employee employee){
        return name.compareTo(employee.name);
    }



}