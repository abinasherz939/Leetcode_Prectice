package com.company.generics;

import java.util.ArrayList;

public class genericsSample {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList<String> list1 = new ArrayList<String>();
        list.add("Name");
        list.add(10);
        list.add(Integer.valueOf(90).toString());
        list.add("age");
      //  list1.add(100); //error
        for (Object element:
             list) {
            String str = element.toString();
            System.out.println(str);
            System.out.println(element+ " "+(element instanceof String) +" "+ (str instanceof String) );
        }
        System.out.println(list);



    }
}
