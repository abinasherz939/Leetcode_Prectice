package com.company;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays {


    void printArray(int @NotNull [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("element at index "+ i + " is "+arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] a = {1,2,36,7,5};
        int[] b = new int[a.length];
//        b =a; // not coping of real elements just coping of addresses.

        arrays arrays = new arrays();
        arrays.printArray(a);
        arrays.printArray(b);
//        for (int i = 0; i < a.length; i++) { //type 1
//            b[i] = a[i];
//        }
//        arrays.printArray(b);



//        b = Arrays.copyOf(a, a.length); //type 2
//        arrays.printArray(b);


//        System.arraycopy(a, 0, b,0,a.length); //type 3
//        arrays.printArray(a);

        b = a.clone(); //type 4 //may be typecasting is required
        arrays.printArray(b);


    }

}
