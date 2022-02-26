package com.company.Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Books> booksPriorityQueue = new PriorityQueue<>();

        System.out.println(booksPriorityQueue);//this is working because to string methos in the Books class
        //min heap by default
        //max heap Comparator.reverseOrder();


        booksPriorityQueue.add(new Books(3,"java"));
        booksPriorityQueue.add(new Books(2,"os"));
        booksPriorityQueue.add(new Books(4, "Coa"));
        booksPriorityQueue.add(new Books(6, "Coa"));
        booksPriorityQueue.add(new Books(-10, "Coa"));
        booksPriorityQueue.add(new Books(-1, "Coa"));


        Iterator<Books> itr = booksPriorityQueue.iterator();


        while (itr.hasNext()){
            Books temp = itr.next();
            System.out.println(temp.toString());
        }

    }

}
