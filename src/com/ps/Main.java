package com.ps;

import java.io.IOException;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) throws IOException {
        int[] array = {1, 55, 41, 77, 23, 15, 33};
        int[][] array2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Box and pit confirm Max please");
        Arrays.selectionSortUpdated(array);
    }
}

