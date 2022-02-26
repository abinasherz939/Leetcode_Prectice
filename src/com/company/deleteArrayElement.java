package com.company;

import java.util.Arrays;

import static com.company.deleteArrayElement.deleteArrayElementMethod;

public class deleteArrayElement {

    static int[] deleteArrayElementMethod (int[] a, int index){


        if (index>=0 && index<a.length) {
            int[] temp = new int[a.length - 1];
            System.arraycopy(a, 0, temp, 0, index);
            System.arraycopy(a, index+1,temp, index, a.length-index-1);
            return temp;
        }
        else {
            System.out.println("cannot be deleted");
            return a;
        }


    }
    int[] deleteArrayElementAlternate1 (int[] a,int index){

        if (index> 0 && index < a.length) {
            int[] temp = new int[a.length - 1];
            for (int i = 0; i < index; i++) {
                temp[i] = a[i];
            }
            for (int i = index + 1; i < a.length; i++) {
                temp[i - 1] = a[i];

            }
            return temp;
        }
        else {
            System.out.println("Out of bound");
            return a;
        }
    }


}
class test {
    public static void main(String[] args) {
        deleteArrayElement deleteArrayElement = new deleteArrayElement();
        int[] a = {0,1,2,3,4,5,6};
        int[] newArray = deleteArrayElementMethod(a, 4);
        int[] newArrayAlternate = deleteArrayElement.deleteArrayElementAlternate1(a,3);

        for (int i :
                a) {
            System.out.println("real elements" + i);

        }
        System.out.println();
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("the element " + newArray[i]);
        }

        System.out.println("\n\n\n");
        for (int i = 0; i < newArrayAlternate.length; i++) {
            System.out.println("the element " + newArrayAlternate[i]);
        }
        
    }
}