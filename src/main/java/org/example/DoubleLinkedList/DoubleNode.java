package org.example.DoubleLinkedList;

public class DoubleNode {

    private String data;
    DoubleNode next;
    DoubleNode prev;

    public DoubleNode(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public String getData() {
        return data;
    }
}
