package com.company.string;

public class string {
    public static void main(String[] args) {

        /**
         * Strings are allocated in Constant pools. At a time for one string there will be only one copy of the data will be avalible
         * if two string objects are having the same value then both of them will be pointing to the same data.
         * if by using some fuctions one variable would want to edit the string then a new palce a new entry will be created in the contant
         * pool and the variale will start pointing to the new entry.
         * **/
        String string = "Abinash";
        String string1 = string.concat(" Choudhary");
        string.concat("string");// we need to catch the string into a new variable, here.
        // here it is not changing the value of string variable.
        //strings are immutable. the vlaue of the string will not be changed once assigned.
        System.out.println(string+" "+ string1);
    }
}
