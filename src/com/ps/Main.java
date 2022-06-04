package com.ps;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array55 = {{7, 8}, {9, 10}, {11, 12}};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


       int[] res = ArraysTwo.twoNumberSumvV2(array,10);
       Arrays.printIntArray(res);
    }
}

