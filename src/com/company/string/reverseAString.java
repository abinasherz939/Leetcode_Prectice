package com.company.string;

import java.util.Scanner;

public class reverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();

        StringBuffer reverseMethod = new StringBuffer(String.valueOf(sc));
        // if we use StringBuffer then it is also syncronised, thread safe, so it is slower also.

        reverseMethod.reverse().toString();
        System.out.println(reverseMethod.reverse().toString());
        String reslult = reverseAStringMethod(s);

        System.out.println(reslult);

    }

    public static String reverseAStringMethod(String s) {
        StringBuffer sb = new StringBuffer("");

        for (int i = s.length()-1; i >= 0; i--) {
           sb.append(s.charAt(i));

        }
        return sb.toString();
    }
}
