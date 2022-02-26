package com.company.regExpUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExpExample1 {

    /**
     * boolean matches(pattern, content);
     *
     *
     * **/

    public static void main(String[] args) {
        Pattern p = Pattern.compile("ba");
        int a = 0;
        Matcher m = p.matcher("abab7aa efif f ifhgr3984r 47 4r92 fdbfqgbeibfbIBFBGIYWERGEF H94 9" +
                " GEFGIABGIBGBBG8FHWGibgibwbg gibgib" +
                "bbhbpwebg983   39b2983gr92ygbbf9fyv9f  9ubf39r89gfqfgrebg98g" +
                " 234bb e1yeg   gr8 i3ro8q23grp723yrbbfbfibas");

        while (m.find()){
            a++;
            System.out.println(m.start() + " "+ m.end());
        }
        System.out.println( "the count is "+  a);
    }
}
