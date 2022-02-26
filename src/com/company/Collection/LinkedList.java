package com.company.Collection;

public class LinkedList {// there is also a Linked list in java.util.
    public int data;
    public LinkedList next = null;
    public LinkedList(int data){
        this.data = data;
    }
    public static void appendToTailInLinkedList(int d, LinkedList head){
        LinkedList endNode = new LinkedList(d);
        LinkedList adderssToAppend = head;

        while (adderssToAppend.next!=null){
            adderssToAppend = adderssToAppend.next;
        }adderssToAppend.next = endNode;
    }
    public static LinkedList deleteTheKeyFromLinkedList(int key, LinkedList head){
        LinkedList current = head;
        while (current.next!= null){
            if (head.data== key) {
                head = head.next;
            }
            if (current.next.data == key){
                current.next = current.next.next;
            }
            current = current.next;
        }
        return head;
    }
}
