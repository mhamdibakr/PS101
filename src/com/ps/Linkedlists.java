package com.ps;

public class Linkedlists
{
    Node head;

    public Linkedlists(Node head)
    {
        this.head = head;
    }

    public void add(Node newNode)
    {
        newNode.next = head;
        head = newNode;
    }

    public void delete()
    {
        head = head.next;
    }

    public void display()
    {
        Node n = head;
        while (n != null)
        {
            System.out.println(n.value);
            n = n.next;
        }
    }





    static class Node
    {
        int value;
        Node next;

        public Node(int value, Node next)
        {
            this.value = value;
            this.next  = next;
        }
    }
}
