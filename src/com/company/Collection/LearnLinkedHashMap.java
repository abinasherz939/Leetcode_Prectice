package com.company.Collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LearnLinkedHashMap {

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap();//insertion order is maintained

        for (int i = 0; i < 10; i++) {

            linkedHashMap.put((2*i +1), "Abinash Choudhary"+i);
            linkedHashMap.put((2*i),"Nanu"+i);


        }


        Set set = linkedHashMap.entrySet();
        Iterator itr = set.iterator();

       while (itr.hasNext()){
           Map.Entry me =(Map.Entry) itr.next();
           System.out.println(me.getKey() +" " + me.getValue()+" " + me.hashCode());
       }
    }


}
