package com.company.string;

public class stringMethods {
    /**
     * boolean equals
     * compareTo
     * char charAt(index) -- retuens character at specified index
     * String concat(String) -- append the string with a new string. // we need to catch the string also in general.// "+" can also be used
     *
     * int length() -- gived the length of the string.
     * string repalce (char oldChar, char newChar) old char will be changed to new char.
     * string subString (int beginIndex, int endIndex)
     * string trim() -- removes the white spaces from the enf of the string.
     *
     *
     *
     *
     *
     * **/

    public static void main(String[] args) {
        String string1 = "Abinash    ";
        String string2 = "Abinash";
        String string3 = new String("Abinasha");
        String string4 = new String("Abinashb");

        System.out.println(string1 == string2);// it compares the refrences
        System.out.println(string1.equals(string2));// it compares the value
        // i dont knoe but both is considered same as i feel now

        System.out.println(string3.compareTo(string4) +"" +
                " "+ string4.compareTo(string3));
        //string4>string3 = 1 //true
        System.out.println(string1.length());
        System.out.println(string1.trim().length());// see





    }
}
