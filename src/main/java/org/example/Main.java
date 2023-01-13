package org.example;

import org.example.DoubleLinkedList.DoubleLinkedList;
import org.example.singlyLinkedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        singlyLinkedList.add("1");
        singlyLinkedList.add("2");
        singlyLinkedList.add("3");

        singlyLinkedList.delete("4");

        System.out.println(singlyLinkedList.getElements());


//        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
//
//        doubleLinkedList.add("1");
//        doubleLinkedList.add("2");
//        doubleLinkedList.add("3");
//
//        System.out.println(doubleLinkedList.getElements());
//
//        doubleLinkedList.delete("4");
//
//        System.out.println(doubleLinkedList.getElements());
    }
}