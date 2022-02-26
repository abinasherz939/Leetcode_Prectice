package com.company.string;

public class stringBuffer {
    public static void main(String[] args) {
        // in string buffer both of them point to same data entry. not as string ., ,,, it is immmutable.not like String Class.
        // if we use StringBuffer then it is also syncronised, thread safe, so it is slower also.

        // almost all the features are same in stringBullider and StringBuffer.

        StringBuffer sb = new StringBuffer("Abinash");
        sb.append(" Choudhary");
        System.out.println(sb);


    }
}
