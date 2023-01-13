package org.example.singlyLinkedList;

import org.example.LinkedListInterface;

import java.util.ArrayList;
import java.util.List;

public class SinglyLinkedList implements LinkedListInterface {

    private Node head;
    private int size;


    public SinglyLinkedList() {
        this.size = 0;
        this.head = null;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void add(String str) {

        Node newNode = new Node(str);
        Node current = this.head;

        if (this.head == null) {
            this.head = newNode;
            this.head.next = null;
            this.size = 1;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = null;
            this.size++;
        }
    }

    @Override
    public boolean contains(String str) {
        Node current = head;

        if (head == null) {
            return false;
        } else {
            while (current != null) {
                if (current.getData().equals(str)) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    @Override
    public void delete(String str) {
        if (this.head != null) {

            Node current = this.head;
            Node prev = null;

            while (current != null) {
                if (current.getData().equals(str)) {
                    //If this is the first element
                    if (current == head) {
                        head = current.next;
                        this.size--;
                        break;
                    } else {
                        prev.next = current.next;
                        this.size--;
                        break;
                    }

                }
                prev = current;
                current = current.next;
            }
            //If the element we want to delete not exists
            if (current == null) {
                System.out.println("Element not exists");
            }
        } else {
            System.out.println("Can not delete from empty list.");
        }
    }

    @Override
    public List<String> getElements() {

        List<String> result = new ArrayList<>();
        Node current = head;

        if (head == null) {
            return new ArrayList<>();
        }

        while (current != null) {
            result.add(current.getData());
            current = current.next;
        }
        return result;
    }

    @Override
    public String get(int index) {

        Node current = head;

        if (head != null) {
            if (index > this.size - 1 || index < 0) {
                return "Invalid index";
            }

            for (int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            return "Empty list.";
        }
        return current.getData();
    }

}
