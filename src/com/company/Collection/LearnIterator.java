package com.company.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LearnIterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("bre");
        list.add("sv");
        list.add("fihv");
        list.add("d");
        list.add("qg");
        list.add("qs");
        list.add("qf");
        list.add("d");

        Iterator<String> Iteretor = list.iterator();

        while (Iteretor.hasNext()){
            String tempString = Iteretor.next();
            System.out.println(tempString);
        }
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            String tempnNext = listIterator.next();

            System.out.println("Next " + tempnNext);
        }
        while (listIterator.hasPrevious()){
//            String tempPrev = listIterator.previous();
//            System.out.println("Prev "+ tempPrev);
//
            System.out.println("prev˳"+listIterator.previous());
        }

    }
}
