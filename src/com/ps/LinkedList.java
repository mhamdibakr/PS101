package com.ps;

public class LinkedList {
    Node head;

    public LinkedList() {
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public int length() {
        if (head == null) {
            return 0;
        }
        int length = 0;
        Node iterator = head;
        while (iterator != null) {
            iterator = iterator.next;
            ++length;
        }

        return length;
    }

    public void addFirst(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void addLast(Node newNode) {
        if (head == null) {
            head = newNode;
            return;
        }

        Node iterator = head;
        while (iterator.next != null) {
            iterator = iterator.next;
        }
        iterator.next = newNode;
    }

    public void addAt(int pos, Node newNode) {
        if (pos == 0) {
            addFirst(newNode);
            return;
        }

        int length = this.length();
        if (pos == length) {
            addLast(newNode);
            return;
        }

        if (pos > length) {
            for (int j = length; j < pos; ++j)
                this.addLast(new Node(-1, null));
            this.addLast(newNode);
        }

        int index = 1;
        for (Node previous = this.head, iterator = this.head.next; iterator.next != null; previous = iterator, iterator = iterator.next) {
            if (pos == index) {
                previous.next = newNode;
                newNode.next = iterator;
                return;
            }
            ++index;
        }
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
        System.out.print("\n");
    }

    public boolean remove(Node node) {
        if (this.head.equals(node)) {
            this.head = this.head.next;
            return true;
        }

        Node iterator = this.head.next;
        Node previous = this.head;

        while (iterator != null) {
            if (iterator.equals(node)) {
                previous.next = iterator.next;
                return true;
            }
            previous = iterator;
            iterator = iterator.next;
        }

        return false;
    }

    public Node removeAt(int pos) {
        if (pos == 0) {
            Node clone = new Node(this.head.value, this.head.next);
            this.head = this.head.next;
            return clone;
        }
        int index = 1;
        for (Node iterator = this.head.next, previous = this.head.next; iterator != null; previous = iterator, iterator = iterator.next) {
            if (pos == index) {
                Node clone = new Node(iterator.value, iterator.next);
                previous.next = iterator.next;
                return clone;
            }
            ++index;
        }
        return null;
    }

    public void purge() {
        while (head != null) {
            head = head.next;
        }
    }

    public LinkedList clone() {
        LinkedList clone = new LinkedList();
        Node iterator = head;
        while (iterator != null) {
            clone.addLast(new Node(iterator.value, null));
            iterator = iterator.next;
        }
        return clone;
    }

    public LinkedList subList(int start, int end) {
        return null;
    }

    public boolean equals(LinkedList list) {
        return false;
    }

    public LinkedList minus(LinkedList list) {
        return null;
    }


    public void concat(LinkedList list) {

    }

    //return a sorted clone
    public LinkedList sort() {
        return null;
    }

    public void sortSelf() {
    }

    public LinkedList intersection(LinkedList list) {
        return null;
    }

    // return a reversed clone
    public LinkedList reverse() {
        return null;
    }

    public void reverseSelf() {
    }

    public void pow(LinkedList list) {
    }

    public Node min() {
        return null;
    }

    public Node max() {
        return null;
    }
}
