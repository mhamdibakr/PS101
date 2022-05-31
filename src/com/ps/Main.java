package com.ps;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] array = {1, 23, 12};
        int[][] array2 = {{3, 5, 4}, {7, 6, 9}, {2, 1, 8}};
        int[][] array55 = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Arrays.pairingArray(array);
    }
}

