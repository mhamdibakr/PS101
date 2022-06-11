package com.ps;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Integer> array = Arrays.asList(new Integer[] {5,1,22,25,6,-1,8,10});
        List<Integer> sub   = Arrays.asList(new Integer[] {1,6,-1,9});

        int[] sArray = {1,2,3,5,6,8,9};
        ArraysTwo.sortedSquaredArrayV2(sArray);

        Linkedlists linkedlist = new Linkedlists(new Linkedlists.Node(12,null));
        linkedlist.add(new Linkedlists.Node(15,null));
        //linkedlist.display();
}}

