package com.ps;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
/*        List<Integer> array = Arrays.asList(new Integer[] {5,1,22,25,6,-1,8,10});
        List<Integer> sub   = Arrays.asList(new Integer[] {1,6,-1,9});

        int[] sArray = {1,2,3,5,6,8,9};
        int[] sArray2 = {-5, -4, -3, -2, -1};
        ArraysTwo.sortedSquaredArrayV2(sArray2);

        Node node = new Node(0, null);
        Node node2 = new Node(1, null);
        Node node3 =
        node.next = node2;

        int i = 0, length = 0;
        for (Node n = node; n != null; n = n.next, ++i) {
            if (n.value == 1) {
                // reference => n
                // indix =>  i
            } else {
                ++i;
            }
            ++length;
            System.out.println(n);
        }


        Node n = node;
        while (n != null) {
            System.out.println(n.value);
            n = n.next;
        }

        Node n2 = node;
        do {
            System.out.println(n2.value);
            n2 = n2.next;
        } while (n2 != null);

        LinkedList linkedlist = new LinkedList(new Node(12,null));
        linkedlist.add(new Node(15,null));*/
        //linkedlist.display();


        LinkedList list = new LinkedList();
        for (int i = 10; i > 0; --i)
            list.addFirst(new Node(i, null));

        list.display(); // 1 2 3 4 5 6 7 8 9 10

        list.remove(new Node(4, null));

        //list.display(); // 1 2 3 5 6 7 8 9 10

        list.removeAt(2);

        //list.display(); // 1 2 5 6 7 8 9 10

        list.removeAt(0);

        //list.display(); // 2 5 6 7 8 9 10

        //list.remove(new Node(10, null));

       // list.display(); // 2 5 6 7 8 9

        list.purge();
        //list.display(); //


        list.addFirst(new Node(1,null));

        list.display(); // 1

        list.addLast(new Node(2, null));

        list.display();//  1 2

        list.addAt(0, new Node(3, null));

        list.display();//  3 1 2

        list.addAt(1, new Node(4, null));

        list.display();//  3 4 1 2

        list.addAt(4, new Node(5, null));

        list.display(); //  3 4 1 2 5

        list.addAt(8, new Node(8, null));

        list.display(); //  3 4 1 2 5 -1 -1 -1 8

        LinkedList clone = list.clone();
        clone.display();//  3 4 1 2 5 -1 -1 -1 8

        list.removeAt(5);
        list.removeAt(6);
        list.removeAt(7);

        clone.display();//  3 4 1 2 5 -1 -1 -1 8

    }
}

