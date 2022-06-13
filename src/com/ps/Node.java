package com.ps;

public class Node {

    public int value;
    public Node next;

    public Node(int value,Node next) {
        this.value = value;
        this.next = next;
    }


    public String toString() {
        Node n = this;
        String res = "";
        do {
            res += n.value + " ";
            n = n.next;
        } while (n != null);
        return res;
    }

    public boolean equals(Node node) {
        return this.value == node.value;
    }
}
