package com.company;

import com.company.Collection.LinkedList;

public class LinkedListProgram {
    public static void main(String[] args) {
        LinkedList testLinkedList = new LinkedList(4);
        LinkedList temp = testLinkedList;


        LinkedList.appendToTailInLinkedList(5,testLinkedList);
        LinkedList.appendToTailInLinkedList(2,testLinkedList);
        LinkedList.appendToTailInLinkedList(4,testLinkedList);
        LinkedList.appendToTailInLinkedList(7,testLinkedList);
        LinkedList.appendToTailInLinkedList(0,testLinkedList);
        LinkedList.appendToTailInLinkedList(1,testLinkedList);
        LinkedList.appendToTailInLinkedList(0,testLinkedList);
        LinkedList.appendToTailInLinkedList(86,testLinkedList);


        LinkedListProgram.printLinkedList(temp);


        temp =  LinkedList.deleteTheKeyFromLinkedList(4,testLinkedList);

        System.out.println();
        LinkedListProgram.printLinkedList(temp);
        LinkedListProgram.printLinkedList(testLinkedList);







    }

    static void printLinkedList(LinkedList temp){
        System.out.println();
        while (temp != null){
            System.out.println(temp.data);

            temp=temp.next;
        }
    }
}
