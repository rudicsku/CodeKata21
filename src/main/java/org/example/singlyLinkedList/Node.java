package org.example.singlyLinkedList;

public class Node {
    private String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public String getData() {
        return data;
    }


}
