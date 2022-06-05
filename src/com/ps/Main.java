package com.ps;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Integer> array = Arrays.asList(new Integer[] {1,2,3,5,6,8,9});
        List<Integer> sub   = Arrays.asList(new Integer[] {1,1,1});

        int[] sArray = {1,2,3,5,6,8,9};

        ArraysTwo.sortedSquaredArray(sArray);
    }
}

