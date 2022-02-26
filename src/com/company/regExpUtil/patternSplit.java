package com.company.regExpUtil;

import java.util.regex.Pattern;

public class patternSplit {

    public static void main(String[] args) {
        String text = "this is the text for searching and spliting with the spaces in it   ";
        String patternForSplit = " ";
        Pattern p = Pattern.compile(" ");
        String[] strings = p.split(text);
        for (String s: strings) {
            System.out.println(s);
        }

    }
}
