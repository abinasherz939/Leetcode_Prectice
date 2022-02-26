package com.company.string;

public class stringBullider {
    // it is not syncronized like StringBuffer.

    StringBuffer sb = new StringBuffer("Abinash");
    StringBuilder sb1 = new StringBuilder("Abinash");

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Abinash");
        StringBuilder sb1 = new StringBuilder("Abinash");
        sb1.reverse().toString();
    }

}
