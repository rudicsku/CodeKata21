package org.example.DoubleLinkedList;

import org.example.LinkedListInterface;

import java.util.ArrayList;
import java.util.List;

public class DoubleLinkedList implements LinkedListInterface {

    DoubleNode head;
    private int size;

    public DoubleLinkedList() {
        this.size = 0;
        this.head = null;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void add(String str) {
        DoubleNode newNode = new DoubleNode(str);
        DoubleNode current = this.head;

        if (this.head == null) {
            this.head = newNode;
            this.head.next = null;
            this.size = 1;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
            newNode.next = null;
            this.size++;
        }
    }

    @Override
    public void delete(String str) {

        if (this.head != null) {

            DoubleNode current = this.head;
            DoubleNode prev = null;


            while (current != null) {
                if (current.getData().equals(str)) {

                    //If it is the last element
                    if (current.next == null) {
                        prev.next = null;
                        prev.prev = current.prev.prev;
                        this.size--;
                        break;
                    }
                    //If it is the first element
                    else if (current.prev == null) {
                        head = current.next;
                        head.next = current.next.next;
                        this.size--;
                        break;
                    } else {
                        prev.next = current.next;
                        current.next.prev = prev;
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
    public boolean contains(String str) {
        DoubleNode current = head;

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
    public List<String> getElements() {
        List<String> result = new ArrayList<>();
        DoubleNode current = head;

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
        DoubleNode current = head;

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
