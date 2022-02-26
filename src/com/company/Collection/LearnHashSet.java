package com.company.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class LearnHashSet {
    public static void main(String[] args) {
        HashSet<Books> booksHashSet = new HashSet<>();

        booksHashSet.add(new Books(1,"java"));
        booksHashSet.add(new Books(2,"c"));
        booksHashSet.add(new Books(3, "os"));


        boolean isAdded =  booksHashSet.add(new Books(3,"C++"));

        Iterator<Books> iterator = booksHashSet.iterator();

        while (iterator.hasNext()){
            Books tempbook = iterator.next();
            System.out.println(tempbook.getId()+"  "+ tempbook.getTitle());
        }
        System.out.println(isAdded);

        boolean isAdded1 =  booksHashSet.add(new Books(3,"COA"));
        System.out.println(isAdded1);

        while (iterator.hasNext()){//these lines are not working
            Books tempbook = iterator.next();
            System.out.println(tempbook.getId()+"  "+ tempbook.getTitle());
        }
        Iterator<Books> newIterator = booksHashSet.iterator();
        while (newIterator.hasNext()){
            System.out.println(newIterator.next().toString());
        }

        boolean isPresent = booksHashSet.contains(new Books(2,"c"));
        System.out.println(isPresent);

        for (Books b :
                booksHashSet) {
            System.out.println(b.toString());
        }
    }
}
