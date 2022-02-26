package com.company.Collection;

import java.util.LinkedHashSet;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Books> booksLinkedHashSet = new LinkedHashSet<>();

        booksLinkedHashSet.add(new Books(1,"java"));
        booksLinkedHashSet.add(new Books(2,"c"));
        booksLinkedHashSet.add(new Books(3, "os"));

        System.out.println(booksLinkedHashSet);//this is internally using to string method in the books class;
        //which i overwrite , there is a string method in object class itself


        //referpdf for more




    }
}
