package com.company;

//    (object refrence variable ) instance of (Class/interface type)

public class instanceOf {

    public static void main(String[] args) {
        String string = "Abinash Choudhary";
        boolean result = (string instanceof String) && (string instanceof Object);
        System.out.println(result);


        superClass superClass = new subClass();

        boolean flag = superClass instanceof subClass;
        boolean flag2 = superClass instanceof superClass;
        boolean flag3 = superClass instanceof Object;
        System.out.println(flag + " "+ flag2  + " "+ flag3);
    }

}
