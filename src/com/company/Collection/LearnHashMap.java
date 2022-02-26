package com.company.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LearnHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();//insertion order is not mantained

        for (int i = 0; i < 10; i++) {

            hashMap.put((2*i +1), "Abinash Choudhary"+i);
            hashMap.put((2*i),"Nanu"+i);


        }


        Set set = hashMap.entrySet();
        Iterator itr = set.iterator();

        while (itr.hasNext()){
            Map.Entry me = (Map.Entry)itr.next();
            System.out.println(me.getKey() +" " + me.getValue()+" " + me.hashCode());

        }


    }
}
